/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeensCarrito;
import beens.registroBeensCompras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author h2ver
 */
public class registroDAOCompra {
    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;

    public int GenerarCompra(registroBeensCompras compra) {
        
        String sql = "insert into compras(Id, idPago, FechaCompras, Monto, Estado)"
                + "values(?,?,?,?,?)";
        try {
            int idcompras;
            
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            ps.setInt(1, compra.getIdCliente().getId());
            ps.setInt(2, compra.getIdPago());
            ps.setString(3, compra.getFecha());
            ps.setDouble(4, compra.getMonto());
            ps.setString(5, compra.getEstado());
            
            resultado  = ps.executeUpdate();
            
            //ahora agg los detalle
            //para identificar la ultima compra
            sql="Select @@IDENTITY AS idCompras";
            rs=ps.executeQuery(sql);
            rs.next();
            idcompras=rs.getInt("idCompras");
            rs.close();
            
            for (registroBeensCarrito detalle : compra.getDetallecompras()) {
                sql="insert info detalle_compras(Id, idCompras, Cantidad, PrecioCompra)values(?,?,?,?)";
                ps = cnx.prepareStatement(sql);
                
                ps.setInt(1, detalle.getId());
                ps.setInt(2, idcompras);
                ps.setInt(3, detalle.getCantidadP());
                ps.setFloat(4, detalle.getCosto());
                
                resultado = ps.executeUpdate();
            }
            
            
        } catch (Exception e) {
        }
        return resultado;
    }
    
    


    
    
    
    
    
    
}

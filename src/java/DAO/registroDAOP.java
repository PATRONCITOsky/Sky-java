/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeensP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author h2ver
 */
public class registroDAOP {
    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;
    
    public int insertar(registroBeensP r){
    
        String sql = "insert into productos(nombres,costo,descripcion,cantidad,id_categoria)"+
                "values(?,?,?,?,?)";
        try {
            cnx=con.ConexBD();
            ps=cnx.prepareStatement(sql);
            
            ps.setString(1,r.getNombres());
            ps.setFloat(2,r.getCosto());
            ps.setString(3,r.getDescripcion());
            ps.setInt(4,r.getCantidad());
            ps.setInt(5,r.getId_categoria());
            
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return resultado;
    }
    
    /*
     public registroBeensP validar(String usr, String pass){
        // se instancia la clase Registro
        registroBeensP miRegistro = new registroBeensP();
        //se crea la sentencia sql
        String sql = "select * from registro where nombres=? and password=?";
        
        
        
        
        try {
            //Se establece la conexion a la bd
            cnx = con.ConexBD();
            //Prepara la sentencia sql
            ps = cnx.prepareStatement(sql);
            ps.setString(1, usr);
            ps.setString(2, pass);
            //Ejecuta la sentencia sql
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                miRegistro.setId(rs.getInt("Id"));
                miRegistro.setNombres(rs.getString("nombres"));
                miRegistro.setContacto(rs.getString("contacto"));
                miRegistro.setCorreo(rs.getString("correo"));
                miRegistro.setPassword(rs.getString("password"));
                miRegistro.setRole(rs.getString("role"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRegistro;
    }*/
    
    public List getAll(){
        String sql = "select * from productos";
        List<registroBeensP>lista=new ArrayList<>();
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                registroBeensP regM = new registroBeensP();
                regM.setId(rs.getInt("Idp"));
                regM.setNombres(rs.getString("nombres"));
                regM.setCosto(rs.getFloat("costo"));
                regM.setDescripcion(rs.getString("descripcion"));
                regM.setCantidad(rs.getInt("cantidad"));
                regM.setEstado(rs.getInt("estado"));
                regM.setId_categoria(rs.getInt("id_categoria"));
                
                lista.add(regM);
                
            }
        } catch (SQLException ex) { 
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return lista;
        }
    
    public int modificar(registroBeensP usua){
        //se declara la variable de consulta
        String sql = "UPDATE productos SET nombres=?, costo=?, descripcion=?, cantidad=? "+"WHERE Idp=?";
         
        try {
            cnx = con.ConexBD();
            //prepara la sentencia sql
            ps = cnx.prepareStatement(sql);
            ps.setString(1, usua.getNombres());
            ps.setFloat(2, usua.getCosto());
            ps.setString(3, usua.getDescripcion());
            ps.setInt(4, usua.getCantidad());
            
            ps.setInt(5, usua.getId());
            //ejecuta la sentencia
            ps.executeUpdate();
        } catch (SQLException e) {
            
        }
        return resultado;
    }
    
    public boolean eliminar (int id){
        String sql = "delete from productos where Idp="+id;
        try {
            cnx = con.ConexBD();
            Statement st = cnx.createStatement();
            int estado = st.executeUpdate(sql);
                if(estado > 0){
                    return true;
                }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public registroBeensP cargar(int id){
        registroBeensP miRBeens = new registroBeensP();
        String sql = "select * from productos where Idp="+id;
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                miRBeens.setNombres(rs.getString(2));
                miRBeens.setCosto(rs.getFloat(3));
                miRBeens.setDescripcion(rs.getString(4));
                miRBeens.setCantidad(rs.getInt(5));
                miRBeens.setEstado(rs.getInt(6));
                miRBeens.setId_categoria(rs.getInt(7));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRBeens;
    }

    
}

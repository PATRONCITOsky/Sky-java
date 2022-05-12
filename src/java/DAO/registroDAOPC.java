/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeensPC;
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
public class registroDAOPC {
    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;
    
    public int insertar(registroBeensPC r){
    
        String sql = "insert into c_producto(nombre)"+
                "values(?)";
        try {
            cnx=con.ConexBD();
            ps=cnx.prepareStatement(sql);
            
            ps.setString(1,r.getNombre());
            /*ps.setString(2,r.getContacto());
            ps.setString(3,r.getCorreo());
            ps.setString(4,r.getPassword());*/
            
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return resultado;
    }
    
    
    /*
    public registroBeensPC validar(String usr, String pass){
        // se instancia la clase Registro
        registroBeensPC miRegistro = new registroBeensPC();
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
                miRegistro.setNombre(rs.getString("nombre"));
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
        String sql = "select * from c_producto";
        List<registroBeensPC>lista=new ArrayList<>();
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                registroBeensPC regM = new registroBeensPC();
                regM.setId(rs.getInt("Id"));
                regM.setNombre(rs.getString("nombre"));
                regM.setEstado(rs.getInt("estado"));
                /*regM.setContacto(rs.getString("contacto"));
                regM.setCorreo(rs.getString("correo"));
                regM.setPassword(rs.getString("password"));
                regM.setRole(rs.getString("role"));*/
                
                lista.add(regM);
                
            }
        } catch (SQLException ex) { 
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return lista;
        }
    
    public int modificar(registroBeensPC usua){
        //se declara la variable de consulta
        String sql = "UPDATE c_producto SET nombre=?"+"WHERE id=?";
         //String sql = "UPDATE registro SET nombres=?,contacto=?,correo=?" + " WHERE id=?";
        try {
            cnx = con.ConexBD();
            //prepara la sentencia sql
            ps = cnx.prepareStatement(sql);
            ps.setString(1, usua.getNombre());
            /*ps.setString(2, usua.getContacto());
            ps.setString(3, usua.getCorreo());
            ps.setString(4, usua.getPassword());
            //ps.setString(5, usua.getRole());*/
            ps.setInt(2, usua.getId());
            //ejecuta la sentencia
            ps.executeUpdate();
        } catch (SQLException e) {
            //Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public boolean eliminar (int id){
        String sql = "delete from c_producto where id="+id;
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
    
    public registroBeensPC cargar(int id){
        registroBeensPC miRBeens = new registroBeensPC();
        String sql = "select * from c_producto where id="+id;
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                miRBeens.setNombre(rs.getString(2));
                /*miRBeens.setContacto(rs.getString(3));
                miRBeens.setCorreo(rs.getString(4));*/
                //miRBeens.setPassword(rs.getString(5));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRBeens;
    }

    
}

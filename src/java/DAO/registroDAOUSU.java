/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;

import beens.registroBeensUSU;
import java.math.BigInteger;
import java.security.MessageDigest;
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
public class registroDAOUSU {
    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;
    
    
    
    
    
    public registroBeensUSU validar(String usr, String pass){
        // se instancia la clase Registro
        registroBeensUSU miRegistro = new registroBeensUSU();
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
    }
    
    public String getMD5(String input){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] encBytes = md.digest(input.getBytes());
            BigInteger numero = new BigInteger(1, encBytes);
            String encString = numero.toString(16);
            while (encString.length() < 32) {                
                encString = "0" + encString;
            }
            return encString;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
    }
    
    
    public List getAll(){
        String sql = "select * from registro";
        List<registroBeensUSU>lista=new ArrayList<>();
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                registroBeensUSU regM = new registroBeensUSU();
                regM.setId(rs.getInt("Id"));
                regM.setNombres(rs.getString("nombres"));
                regM.setContacto(rs.getString("contacto"));
                regM.setCorreo(rs.getString("correo"));
                regM.setPassword(rs.getString("password"));
                //regM.setPassword(getMD5(rs.getString("password")));
                regM.setRole(rs.getString("role"));
                
                lista.add(regM);
                
            }
        } catch (SQLException ex) { 
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return lista;
        }
    
    public int modificar(registroBeensUSU usua){
        //se declara la variable de consulta
        String sql = "UPDATE registro SET nombres=?, contacto=?, correo=?, password=?"+"WHERE id=?";
         //String sql = "UPDATE registro SET nombres=?,contacto=?,correo=?" + " WHERE id=?";
        try {
            cnx = con.ConexBD();
            //prepara la sentencia sql
            ps = cnx.prepareStatement(sql);
            ps.setString(1, usua.getNombres());
            ps.setString(2, usua.getContacto());
            ps.setString(3, usua.getCorreo());
            ps.setString(4, getMD5(usua.getPassword()));
            
            //ps.setString(5, usua.getRole());
            ps.setInt(5, usua.getId());
            //ejecuta la sentencia
            ps.executeUpdate();
        } catch (SQLException e) {
            //Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
    /*
    public boolean eliminar (int id){
        String sql = "delete from registro where id="+id;
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
    }*/
    
    public registroBeensUSU cargar(int id){
        registroBeensUSU miRBeens = new registroBeensUSU();
        String sql = "select * from registro where id="+id;
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                miRBeens.setId(rs.getInt(1));
                miRBeens.setNombres(rs.getString(2));
                miRBeens.setContacto(rs.getString(3));
                miRBeens.setCorreo(rs.getString(4));
                miRBeens.setPassword(rs.getString(5));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRBeens;
    }

    
}

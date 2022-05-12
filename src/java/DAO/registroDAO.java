/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeens;
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
public class registroDAO {
    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;
    
    public int insertar(registroBeens r){
    
        String sql = "insert into registro(nombres,contacto,correo,password)"+
                "values(?,?,?,?)";
        try {
            cnx=con.ConexBD();
            ps=cnx.prepareStatement(sql);
            
            ps.setString(1,r.getNombres());
            ps.setString(2,r.getContacto());
            ps.setString(3,r.getCorreo());
            ps.setString(4, getMD5(r.getPassword()));
            
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
        }
        return resultado;
    }
    
    public registroBeens validar(String usr, String pass){
        // se instancia la clase Registro
        registroBeens miRegistro = new registroBeens();
        //se crea la sentencia sql
        String sql = "select * from registro where nombres=? and password=?";
        
        try {
            //Se establece la conexion a la bd
            cnx = con.ConexBD();
            //Prepara la sentencia sql
            ps = cnx.prepareStatement(sql);
            ps.setString(1, usr);
            ps.setString(2, getMD5(pass));
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
    
    
    /*
    Método de encriptación recibe como parametro un String 
    */
    public String getMD5(String input){
        /*
        La declaración try... catch señala un bloque de instrucciones a intentar ( try ), 
        y especifica una respuesta si se produce una excepción ( catch ).
        */
        try {
            //Convierte lo que se recibe por parametro en MD5
            /*
            MessageDigest libreria de java security que brinda varios mecanimos de encrip*/
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Se declara un arreglo de bytes, se hace una digestion XD para pasar un string en bytes
            byte[] encBytes = md.digest(input.getBytes());
            /*Lo anterior se pasa a algo más entendible (numero)
            Recibe cada uno de los bytes de uno en uno*/
            BigInteger numero = new BigInteger(1, encBytes);
            /*El hash generado se convierte en un string*/
            String encString = numero.toString(16);
            /*Llena los compos vacios con ceros*/
            while (encString.length() < 32) {                
                encString = "0" + encString;
            }
            return encString;
        } catch (Exception e) {
            /*En caso de error lo envia hacia la ejecución en linea*/
            throw new RuntimeException(e);
        }
        
        
    }

    
    public List getAll(){
        String sql = "select * from registro";
        List<registroBeens>lista=new ArrayList<>();
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                registroBeens regM = new registroBeens();
                regM.setId(rs.getInt("Id"));
                regM.setNombres(rs.getString("nombres"));
                regM.setContacto(rs.getString("contacto"));
                regM.setCorreo(rs.getString("correo"));
                //regM.setPassword(rs.getString("password"));
                regM.setPassword(getMD5(rs.getString("password")));
                regM.setRole(rs.getString("role"));
                
                lista.add(regM);
                
            }
        } catch (SQLException ex) { 
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return lista;
        }
    
    public int modificar(registroBeens usua){
        //se declara la variable de consulta
        String sql = "UPDATE registro SET nombres=?, contacto=?, correo=?, password=?"+"WHERE id=?";
         
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
    }
    
    
    //Este trae la informacion al admin
    public registroBeens cargar(int id){
        registroBeens miRBeens = new registroBeens();
        String sql = "select * from registro where id="+id;
        
        try{
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
                miRBeens.setNombres(rs.getString(2));
                miRBeens.setContacto(rs.getString(3));
                miRBeens.setCorreo(rs.getString(4));
                miRBeens.setPassword(getMD5(rs.getString(5)));
                //miRBeens.setPassword(rs.getString(5));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRBeens;
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeensP;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author h2ver
 */
public class registroDAOProductos {

    //Se instancia la clase conexion
    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;
    
    
    //Método para insertar productos e imagen
    public int insertar(registroBeensP r) {

        String sql = "insert into productos(nombres,costo,descripcion,cantidad,id_categoria,imagen)"
                + "values(?,?,?,?,?,?)";
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);

            ps.setString(1, r.getNombres());
            ps.setFloat(2, r.getCosto());
            ps.setString(3, r.getDescripcion());
            ps.setInt(4, r.getCantidad());
            ps.setInt(5, r.getId_categoria());
            ps.setBlob(6, r.getImagen());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return resultado;
    }

    //Método para listar por Id
    public registroBeensP listarId(int id) {
        String SQL = "select * from productos where Idp=" + id;
        registroBeensP BP = new registroBeensP();
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                BP.setId(rs.getInt(1));
                BP.setNombres(rs.getString(2));
                BP.setCosto(rs.getFloat(3));
                BP.setDescripcion(rs.getString(4));
                BP.setCantidad(rs.getInt(5));
                BP.setEstado(rs.getInt(6));
                BP.setId_categoria(rs.getInt(7));
                BP.setImagen(rs.getBinaryStream(8));
            }
        } catch (Exception e) {
        }
        return BP;

    }

    
    //Listar Imagen por Id
    /*Como parametro este método va a tener el id
    luego una variable de tipo HttpServletResponse y la variable response
       
    Los objetos ServletResponse se emplean para enviar el resultado de procesar una petición a un cliente. 
    El subtipo HttpServletResponse se utiliza en las peticiones HTTP. 
    Proporciona acceso al canal de salida por donde enviar la respuesta al cliente. 
    Con getWriter() se obtiene un Writer para enviar texto al cliente.
    */
    public void listarImg(int id, HttpServletResponse response) {
        //Variable para la consulta (cuando el idp sea igual al id que viene como parametro)
        String sql = "select * from productos where Idp=" + id;
        //Se inicializan variables en null
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            outputStream = response.getOutputStream();
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                inputStream = rs.getBinaryStream("imagen");
            }
            /* La clase Java BufferedInputStream , java.io.BufferedInputStream, 
            proporciona lectura transparente de fragmentos de bytes y almacenamiento en búfer
            
            Se inicializan en vacio las variables*/
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        } catch (Exception e) {
        }
    }

    
    //Método para listar todos los productos
    public List getAll() {
        String sql = "select * from productos";
        List<registroBeensP> lista = new ArrayList<>();

        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                registroBeensP regM = new registroBeensP();
                regM.setId(rs.getInt("Idp"));
                regM.setNombres(rs.getString("nombres"));
                regM.setCosto(rs.getFloat("costo"));
                regM.setDescripcion(rs.getString("descripcion"));
                regM.setCantidad(rs.getInt("cantidad"));
                regM.setEstado(rs.getInt("estado"));
                regM.setId_categoria(rs.getInt("id_categoria"));
                regM.setImagen(rs.getBinaryStream("imagen"));

                lista.add(regM);

            }
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    
    //Otro método para listar todos los productos
    public List listar() {
        //Variable String para la consulta sql 
        String sql = "select * from productos";
        //Se declara una variable de tipo list que es del objeto registroBeensP
        List<registroBeensP> listica = new ArrayList<>();

        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                //Se isntancia la clase registroBeensP con la variable regM 
                registroBeensP regM = new registroBeensP();
                
                regM.setId(rs.getInt(1));
                regM.setNombres(rs.getString(2));
                regM.setCosto(rs.getFloat(3));
                regM.setDescripcion(rs.getString(4));
                regM.setCantidad(rs.getInt(5));
                regM.setEstado(rs.getInt(6));
                regM.setId_categoria(rs.getInt(7));
                regM.setImagen(rs.getBinaryStream(8));
                
                //Se agrega el objeto dentro de la lista
                //El nombre de la lista es listica. el metodo add y 
                //como parametro se envia el objeto registroBeensP (regM)
                listica.add(regM);

            }
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listica;
    }

    
    //Método para modificar los productos
    public int modificar(registroBeensP usua) {
        //se declara la variable de consulta
        String sql = "UPDATE productos SET nombres=?, costo=?, descripcion=?, cantidad=?, id_categoria=?, imagen=? " + "WHERE Idp=?";

        try {
            cnx = con.ConexBD();
            //prepara la sentencia sql
            ps = cnx.prepareStatement(sql);
            ps.setString(1, usua.getNombres());
            ps.setFloat(2, usua.getCosto());
            ps.setString(3, usua.getDescripcion());
            ps.setInt(4, usua.getCantidad());
            ps.setInt(5, usua.getId_categoria());
            ps.setBinaryStream(6, usua.getImagen());
            ps.setInt(7, usua.getId());

            //ejecuta la sentencia
            ps.executeUpdate();
        } catch (SQLException e) {

        }
        return resultado;
    }

    
    //Método para eliminar productos por  id
    public boolean eliminar(int id) {
        String sql = "delete from productos where Idp=" + id;
        try {
            cnx = con.ConexBD();
            Statement st = cnx.createStatement();
            int estado = st.executeUpdate(sql);
            if (estado > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    //Método para cargar productos por id
    public registroBeensP cargar(int id) {
        registroBeensP miRBeens = new registroBeensP();
        String sql = "select * from productos where Idp=" + id;

        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                miRBeens.setNombres(rs.getString(2));
                miRBeens.setCosto(rs.getFloat(3));
                miRBeens.setDescripcion(rs.getString(4));
                miRBeens.setCantidad(rs.getInt(5));
                miRBeens.setEstado(rs.getInt(6));
                miRBeens.setId_categoria(rs.getInt(7));
                miRBeens.setImagen(rs.getBinaryStream(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRBeens;
    }

}

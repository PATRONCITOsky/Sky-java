/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SENA-WS-H50-1
 */
public class ConexBD {
        Connection cnx;
    
    String url="jdbc:mysql://localhost/inventariosky";
    String usr="root";
    String pass="";
    
    public Connection ConexBD(){
        
          
         try {
            //se carga el driver mysql
              Class.forName("com.mysql.jdbc.Driver");
            //se hace la autentificacion de la bd
         cnx= (Connection) DriverManager.getConnection(url, usr, pass);
         if(cnx != null)
            {
                System.out.println("░█████╗░░█████╗░███╗░░██╗███████╗░█████╗░████████╗░█████╗░██████╗░░█████╗░  ██╗██╗░░\n" +
"██╔══██╗██╔══██╗████╗░██║██╔════╝██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗  ╚═╝╚██╗░\n" +
"██║░░╚═╝██║░░██║██╔██╗██║█████╗░░██║░░╚═╝░░░██║░░░███████║██║░░██║██║░░██║  ░░░░╚██╗\n" +
"██║░░██╗██║░░██║██║╚████║██╔══╝░░██║░░██╗░░░██║░░░██╔══██║██║░░██║██║░░██║  ░░░░██╔╝\n" +
"╚█████╔╝╚█████╔╝██║░╚███║███████╗╚█████╔╝░░░██║░░░██║░░██║██████╔╝╚█████╔╝  ██╗██╔╝░\n" +
"░╚════╝░░╚════╝░╚═╝░░╚══╝╚══════╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═════╝░░╚════╝░  ╚═╝╚═╝░░");
                return cnx;
            }
         } 
           
         catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
    }
    public static void main(String[] args){
    ConexBD miCone = new ConexBD();
    miCone.ConexBD();
    }
    
}

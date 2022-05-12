/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

/**
 *
 * @author SENA-WS-H50-1
 */
public class registroBeensUSU {
    private int Id;
 private String nombres;
 private String correo;
 private String contacto;
 private String password;
 private String role;

    public registroBeensUSU() {
    }

    public registroBeensUSU(int Id, String nombres, String correo, String contacto, String password) {
        this.Id = Id;
        this.nombres = nombres;
        this.correo = correo;
        this.contacto = contacto;
        this.password = password;
        
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
    

  
  
 
}

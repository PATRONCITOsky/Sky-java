/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

/**
 *
 * @author SENA
 */
public class registroBeensPC {
    private int Id;
    private String nombre;
    private int estado;

    public registroBeensPC() {
    }

    public registroBeensPC(int Id, String nombre, int estado) {
        this.Id = Id;
        this.nombre = nombre;
        this.estado = estado;
    }

    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
 
 
}

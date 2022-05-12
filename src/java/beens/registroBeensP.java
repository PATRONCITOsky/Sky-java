/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

import java.io.InputStream;

/**
 *
 * @author SENA
 */
public class registroBeensP {
    private int Id, cantidad, estado, id_categoria;
    private String nombres;
    private float costo;
    private String descripcion;
    private InputStream imagen;

    public registroBeensP() {
    }

    public registroBeensP( int cantidad, int estado, int id_categoria, String nombres, float costo, String descripcion, InputStream imagen) {
       
        this.cantidad = cantidad;
        this.estado = estado;
        this.id_categoria = id_categoria;
        this.nombres = nombres;
        this.costo = costo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }
    
    
    
    
}

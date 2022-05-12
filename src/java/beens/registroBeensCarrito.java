/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. hace falta la imagen
 */
package beens;



/**
 *
 * @author SENA
 */
public class registroBeensCarrito {
    private int item, Id, cantidad, cantidadP;
    private String nombres;
    private float costo;
    private String descripcion;
    private float pcompra, subtotal;

    public registroBeensCarrito() {
    }

    public registroBeensCarrito(int item, int Id, int cantidad, int cantidadP, String nombres, float costo, String descripcion, float pcompra, float subtotal) {
        this.item = item;
        this.Id = Id;
        this.cantidad = cantidad;
        this.cantidadP = cantidadP;
        this.nombres = nombres;
        this.costo = costo;
        this.descripcion = descripcion;
        this.pcompra = pcompra;
        this.subtotal = subtotal;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
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

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
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

    public float getPcompra() {
        return pcompra;
    }

    public void setPcompra(float pcompra) {
        this.pcompra = pcompra;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    
    
    
    
}

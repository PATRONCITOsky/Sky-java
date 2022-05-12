/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

import java.util.List;

/**
 *
 * @author User1
 */
public class registroBeensCompras {
    private int idCompra;
    private registroBeens idCliente;
    private int idPago;
    private String fecha;
    private Double monto;
    private String estado;
    
    //se hace una lista 
    //el objeto que tiene los datos del detalle correspondiente del detalle_compra es registroBeensCarrito
    private List<registroBeensCarrito>detallecompras;

    public registroBeensCompras() {
    }

    public registroBeensCompras( registroBeens idCliente, int idPago, String fecha, Double monto, String estado, List<registroBeensCarrito> detallecompras) {
        
        this.idCliente = idCliente;
        this.idPago = idPago;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
        this.detallecompras = detallecompras;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public registroBeens getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(registroBeens idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<registroBeensCarrito> getDetallecompras() {
        return detallecompras;
    }

    public void setDetallecompras(List<registroBeensCarrito> detallecompras) {
        this.detallecompras = detallecompras;
    }

    
    
    


    
    

    

    
    
}

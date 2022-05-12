/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

/**
 *
 * @author User1
 */
public class registroBeensPago {
    private int Id;
    private double monto;

    public registroBeensPago() {
    }

    public registroBeensPago(int Id, double monto) {
        this.Id = Id;
        this.monto = monto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
}

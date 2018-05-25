/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jackw
 */
public class Medio_Pago {
    private int id_medio_pago;
    private String nombre_medio_pago;

    public Medio_Pago() {
    }

    public Medio_Pago(int id_medio_pago, String nombre_medio_pago) {
        this.id_medio_pago = id_medio_pago;
        this.nombre_medio_pago = nombre_medio_pago;
    }

    public int getId_medio_pago() {
        return id_medio_pago;
    }

    public void setId_medio_pago(int id_medio_pago) {
        this.id_medio_pago = id_medio_pago;
    }

    public String getNombre_medio_pago() {
        return nombre_medio_pago;
    }

    public void setNombre_medio_pago(String nombre_medio_pago) {
        this.nombre_medio_pago = nombre_medio_pago;
    }
    
    
}

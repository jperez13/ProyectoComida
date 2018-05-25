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
public class Oferta {
    private int id_oferta;
    private String tiempo_inicio;
    private int precio;
    private String tiempo_termino;

    public Oferta() {
    }

    public Oferta(int id_oferta, String tiempo_inicio, int precio, String tiempo_termino) {
        this.id_oferta = id_oferta;
        this.tiempo_inicio = tiempo_inicio;
        this.precio = precio;
        this.tiempo_termino = tiempo_termino;
    }

    public int getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(int id_oferta) {
        this.id_oferta = id_oferta;
    }

    public String getTiempo_inicio() {
        return tiempo_inicio;
    }

    public void setTiempo_inicio(String tiempo_inicio) {
        this.tiempo_inicio = tiempo_inicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTiempo_termino() {
        return tiempo_termino;
    }

    public void setTiempo_termino(String tiempo_termino) {
        this.tiempo_termino = tiempo_termino;
    }
    
    
}

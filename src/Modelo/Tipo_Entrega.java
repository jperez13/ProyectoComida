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
public class Tipo_Entrega {
    private int id_tipo_entrega;
    private String nombre_tipo_entrega;

    public Tipo_Entrega() {
    }

    public Tipo_Entrega(int id_tipo_entrega, String nombre_tipo_entrega) {
        this.id_tipo_entrega = id_tipo_entrega;
        this.nombre_tipo_entrega = nombre_tipo_entrega;
    }

    public int getId_tipo_entrega() {
        return id_tipo_entrega;
    }

    public void setId_tipo_entrega(int id_tipo_entrega) {
        this.id_tipo_entrega = id_tipo_entrega;
    }

    public String getNombre_tipo_entrega() {
        return nombre_tipo_entrega;
    }

    public void setNombre_tipo_entrega(String nombre_tipo_entrega) {
        this.nombre_tipo_entrega = nombre_tipo_entrega;
    }
    
    
}

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
public class Tipo_Contrato {
    private int id_tipo_contrato;
    private String nombre_tipo_contrato;

    public Tipo_Contrato() {
    }

    public Tipo_Contrato(int id_tipo_contrato, String nombre_tipo_contrato) {
        this.id_tipo_contrato = id_tipo_contrato;
        this.nombre_tipo_contrato = nombre_tipo_contrato;
    }

    public int getId_tipo_contrato() {
        return id_tipo_contrato;
    }

    public void setId_tipo_contrato(int id_tipo_contrato) {
        this.id_tipo_contrato = id_tipo_contrato;
    }

    public String getNombre_tipo_contrato() {
        return nombre_tipo_contrato;
    }

    public void setNombre_tipo_contrato(String nombre_tipo_contrato) {
        this.nombre_tipo_contrato = nombre_tipo_contrato;
    }
    
    
}

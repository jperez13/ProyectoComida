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
public class Convenio {
    private int id_convenio;
    private String nombre_empresa;
    private int id_estado_conve;
    private Estado_Conv estado_conv_id_estado_conv;
    private String tiempo_inicio;
    private String tiempo_final;

    public Convenio() {
    }

    public Convenio(int id_convenio, String nombre_empresa, int id_estado_conve, Estado_Conv estado_conv_id_estado_conv, String tiempo_inicio, String tiempo_final) {
        this.id_convenio = id_convenio;
        this.nombre_empresa = nombre_empresa;
        this.id_estado_conve = id_estado_conve;
        this.estado_conv_id_estado_conv = estado_conv_id_estado_conv;
        this.tiempo_inicio = tiempo_inicio;
        this.tiempo_final = tiempo_final;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public int getId_estado_conve() {
        return id_estado_conve;
    }

    public void setId_estado_conve(int id_estado_conve) {
        this.id_estado_conve = id_estado_conve;
    }

    public Estado_Conv getEstado_conv_id_estado_conv() {
        return estado_conv_id_estado_conv;
    }

    public void setEstado_conv_id_estado_conv(Estado_Conv estado_conv_id_estado_conv) {
        this.estado_conv_id_estado_conv = estado_conv_id_estado_conv;
    }

    public String getTiempo_inicio() {
        return tiempo_inicio;
    }

    public void setTiempo_inicio(String tiempo_inicio) {
        this.tiempo_inicio = tiempo_inicio;
    }

    public String getTiempo_final() {
        return tiempo_final;
    }

    public void setTiempo_final(String tiempo_final) {
        this.tiempo_final = tiempo_final;
    }

    

    
    
 
    
    
    
}

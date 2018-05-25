package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackw
 */
public class Estado_Conv {
    private int id_estado_conv;
    private String nombreEstado_Conv;

    public Estado_Conv() {
    }

    public Estado_Conv(int id_estado_conv, String nombreEstado_Conv) {
        this.id_estado_conv = id_estado_conv;
        this.nombreEstado_Conv = nombreEstado_Conv;
    }

    public int getId_estado_conv() {
        return id_estado_conv;
    }

    public void setId_estado_conv(int id_estado_conv) {
        this.id_estado_conv = id_estado_conv;
    }

    public String getNombreEstado_Conv() {
        return nombreEstado_Conv;
    }

    public void setNombreEstado_Conv(String nombreEstado_Conv) {
        this.nombreEstado_Conv = nombreEstado_Conv;
    }
    
    
    
    
}

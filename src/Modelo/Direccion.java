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
public class Direccion {
    private int id_direccion;
    private String calle;
    private int numeracion;
    private int depto;
    private Comuna comuna_id_comuna;
    private Usuario usuario_id_usuario;

    public Direccion() {
    }

    public Direccion(int id_direccion, String calle, int numeracion, int depto, Comuna comuna_id_comuna, Usuario usuario_id_usuario) {
        this.id_direccion = id_direccion;
        this.calle = calle;
        this.numeracion = numeracion;
        this.depto = depto;
        this.comuna_id_comuna = comuna_id_comuna;
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public int getDepto() {
        return depto;
    }

    public void setDepto(int depto) {
        this.depto = depto;
    }

    public Comuna getComuna_id_comuna() {
        return comuna_id_comuna;
    }

    public void setComuna_id_comuna(Comuna comuna_id_comuna) {
        this.comuna_id_comuna = comuna_id_comuna;
    }

    public Usuario getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(Usuario usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }
    
    
}



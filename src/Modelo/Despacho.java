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
public class Despacho {
    private int id_despacho;
    private String tiempo_entrega;
    private Tipo_Entrega tipo_entrega_id_tipo_entrega;
    private Direccion direccion_id_direccion;
    private Usuario usuario_id_usuario;

    public Despacho() {
    }

    public Despacho(int id_despacho, String tiempo_entrega, Tipo_Entrega tipo_entrega_id_tipo_entrega, Direccion direccion_id_direccion, Usuario usuario_id_usuario) {
        this.id_despacho = id_despacho;
        this.tiempo_entrega = tiempo_entrega;
        this.tipo_entrega_id_tipo_entrega = tipo_entrega_id_tipo_entrega;
        this.direccion_id_direccion = direccion_id_direccion;
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public int getId_despacho() {
        return id_despacho;
    }

    public void setId_despacho(int id_despacho) {
        this.id_despacho = id_despacho;
    }

    public String getTiempo_entrega() {
        return tiempo_entrega;
    }

    public void setTiempo_entrega(String tiempo_entrega) {
        this.tiempo_entrega = tiempo_entrega;
    }

    public Tipo_Entrega getTipo_entrega_id_tipo_entrega() {
        return tipo_entrega_id_tipo_entrega;
    }

    public void setTipo_entrega_id_tipo_entrega(Tipo_Entrega tipo_entrega_id_tipo_entrega) {
        this.tipo_entrega_id_tipo_entrega = tipo_entrega_id_tipo_entrega;
    }

    public Direccion getDireccion_id_direccion() {
        return direccion_id_direccion;
    }

    public void setDireccion_id_direccion(Direccion direccion_id_direccion) {
        this.direccion_id_direccion = direccion_id_direccion;
    }

    public Usuario getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(Usuario usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

  

    
    
    
}

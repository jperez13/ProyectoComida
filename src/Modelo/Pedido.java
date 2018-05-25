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
public class Pedido {
    private int id_pedido;
    private String tiempo_pedido;
    private String tiempo_preparacion;
    private int min_estimado;
    private int total;
    private String observaciones;
    private Usuario usuario_id_usuario;
    private Despacho despacho_id_despacho;
    private Pago pago_id_pago;
    private Estado_Pedido estado_pedido_id_estado_pedido;

    public Pedido() {
    }

    public Pedido(int id_pedido, String tiempo_pedido, String tiempo_preparacion, int min_estimado, int total, String observaciones, Usuario usuario_id_usuario, Despacho despacho_id_despacho, Pago pago_id_pago, Estado_Pedido estado_pedido_id_estado_pedido) {
        this.id_pedido = id_pedido;
        this.tiempo_pedido = tiempo_pedido;
        this.tiempo_preparacion = tiempo_preparacion;
        this.min_estimado = min_estimado;
        this.total = total;
        this.observaciones = observaciones;
        this.usuario_id_usuario = usuario_id_usuario;
        this.despacho_id_despacho = despacho_id_despacho;
        this.pago_id_pago = pago_id_pago;
        this.estado_pedido_id_estado_pedido = estado_pedido_id_estado_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getTiempo_pedido() {
        return tiempo_pedido;
    }

    public void setTiempo_pedido(String tiempo_pedido) {
        this.tiempo_pedido = tiempo_pedido;
    }

    public String getTiempo_preparacion() {
        return tiempo_preparacion;
    }

    public void setTiempo_preparacion(String tiempo_preparacion) {
        this.tiempo_preparacion = tiempo_preparacion;
    }

    public int getMin_estimado() {
        return min_estimado;
    }

    public void setMin_estimado(int min_estimado) {
        this.min_estimado = min_estimado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Usuario getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(Usuario usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public Despacho getDespacho_id_despacho() {
        return despacho_id_despacho;
    }

    public void setDespacho_id_despacho(Despacho despacho_id_despacho) {
        this.despacho_id_despacho = despacho_id_despacho;
    }

    public Pago getPago_id_pago() {
        return pago_id_pago;
    }

    public void setPago_id_pago(Pago pago_id_pago) {
        this.pago_id_pago = pago_id_pago;
    }

    public Estado_Pedido getEstado_pedido_id_estado_pedido() {
        return estado_pedido_id_estado_pedido;
    }

    public void setEstado_pedido_id_estado_pedido(Estado_Pedido estado_pedido_id_estado_pedido) {
        this.estado_pedido_id_estado_pedido = estado_pedido_id_estado_pedido;
    }
    
    
}

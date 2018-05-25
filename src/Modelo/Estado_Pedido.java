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
public class Estado_Pedido {
    private int id_estado_pedido;
    private String nombre_estado_pedido;

    public Estado_Pedido() {
    }

    public Estado_Pedido(int id_estado_pedido, String nombre_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
        this.nombre_estado_pedido = nombre_estado_pedido;
    }

    public int getId_estado_pedido() {
        return id_estado_pedido;
    }

    public void setId_estado_pedido(int id_estado_pedido) {
        this.id_estado_pedido = id_estado_pedido;
    }

    public String getNombre_estado_pedido() {
        return nombre_estado_pedido;
    }

    public void setNombre_estado_pedido(String nombre_estado_pedido) {
        this.nombre_estado_pedido = nombre_estado_pedido;
    }
    
    
}

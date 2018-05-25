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
public class Detalle_Oferta {
    private int id_detalle_oferta;
    private Producto producto_id_producto;
    private Oferta oferta_id_oferta;

    public Detalle_Oferta() {
    }

    public Detalle_Oferta(int id_detalle_oferta, Producto producto_id_producto, Oferta oferta_id_oferta) {
        this.id_detalle_oferta = id_detalle_oferta;
        this.producto_id_producto = producto_id_producto;
        this.oferta_id_oferta = oferta_id_oferta;
    }

    public int getId_detalle_oferta() {
        return id_detalle_oferta;
    }

    public void setId_detalle_oferta(int id_detalle_oferta) {
        this.id_detalle_oferta = id_detalle_oferta;
    }

    public Producto getProducto_id_producto() {
        return producto_id_producto;
    }

    public void setProducto_id_producto(Producto producto_id_producto) {
        this.producto_id_producto = producto_id_producto;
    }

    public Oferta getOferta_id_oferta() {
        return oferta_id_oferta;
    }

    public void setOferta_id_oferta(Oferta oferta_id_oferta) {
        this.oferta_id_oferta = oferta_id_oferta;
    }
    
    
}

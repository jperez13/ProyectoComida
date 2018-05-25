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
public class Detalle_Pedido {
    private int id_detalle_pedido;
    private int precio;
    private int cantidad;
    private int subtotal;
    private Pedido pedido_id_pedido;
    private Producto producto_id_producto;
    private Oferta oferta_id_oferta;
    private Proveedor proveedor_id_proveedor;
    

    public Detalle_Pedido() {
    }

    public Detalle_Pedido(int id_detalle_pedido, int precio, int cantidad, int subtotal, Pedido pedido_id_pedido, Producto producto_id_producto, Oferta oferta_id_oferta, Proveedor proveedor_id_proveedor) {
        this.id_detalle_pedido = id_detalle_pedido;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.pedido_id_pedido = pedido_id_pedido;
        this.producto_id_producto = producto_id_producto;
        this.oferta_id_oferta = oferta_id_oferta;
        this.proveedor_id_proveedor = proveedor_id_proveedor;
    }

    public int getId_detalle_pedido() {
        return id_detalle_pedido;
    }

    public void setId_detalle_pedido(int id_detalle_pedido) {
        this.id_detalle_pedido = id_detalle_pedido;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public Pedido getPedido_id_pedido() {
        return pedido_id_pedido;
    }

    public void setPedido_id_pedido(Pedido pedido_id_pedido) {
        this.pedido_id_pedido = pedido_id_pedido;
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

    public Proveedor getProveedor_id_proveedor() {
        return proveedor_id_proveedor;
    }

    public void setProveedor_id_proveedor(Proveedor proveedor_id_proveedor) {
        this.proveedor_id_proveedor = proveedor_id_proveedor;
    }
    
    
}

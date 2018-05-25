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
public class Producto {
    private int id_producto;
    private String nombre_producto;
    private String descripcion;
    private int precio;
    private int min_preparacion;
    private String imagen;
    private Disponibilidad disponibilidad_id_disponibilidad;
    private int id_disponibilidad;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, String descripcion, int precio, int min_preparacion, String imagen, Disponibilidad disponibilidad_id_disponibilidad, int id_disponibilidad) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.min_preparacion = min_preparacion;
        this.imagen = imagen;
        this.disponibilidad_id_disponibilidad = disponibilidad_id_disponibilidad;
        this.id_disponibilidad = id_disponibilidad;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMin_preparacion() {
        return min_preparacion;
    }

    public void setMin_preparacion(int min_preparacion) {
        this.min_preparacion = min_preparacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Disponibilidad getDisponibilidad_id_disponibilidad() {
        return disponibilidad_id_disponibilidad;
    }

    public void setDisponibilidad_id_disponibilidad(Disponibilidad disponibilidad_id_disponibilidad) {
        this.disponibilidad_id_disponibilidad = disponibilidad_id_disponibilidad;
    }

    public int getId_disponibilidad() {
        return id_disponibilidad;
    }

    public void setId_disponibilidad(int id_disponibilidad) {
        this.id_disponibilidad = id_disponibilidad;
    }

    
    
}

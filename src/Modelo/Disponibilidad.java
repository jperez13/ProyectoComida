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
public class Disponibilidad {
    private int id_disponibilidad;
    private String nombre_disponibilidad;

    public Disponibilidad() {
    }

    public Disponibilidad(int id_disponibilidad, String nombre_disponibilidad) {
        this.id_disponibilidad = id_disponibilidad;
        this.nombre_disponibilidad = nombre_disponibilidad;
    }

    public int getId_disponibilidad() {
        return id_disponibilidad;
    }

    public void setId_disponibilidad(int id_disponibilidad) {
        this.id_disponibilidad = id_disponibilidad;
    }

    public String getNombre_disponibilidad() {
        return nombre_disponibilidad;
    }

    public void setNombre_disponibilidad(String nombre_disponibilidad) {
        this.nombre_disponibilidad = nombre_disponibilidad;
    }
    
    
}

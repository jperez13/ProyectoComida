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
public class Contrato {
    private int id_contrato;
    private String ruta;
    private Convenio convenio_id_convenio;
    private Tipo_Contrato tipo_contrato_id_tipo_contrato;
    private int id_tipo_contrato;
    private int id_convenio;

    public Contrato() {
    }

    public Contrato(int id_contrato, String ruta, Convenio convenio_id_convenio, Tipo_Contrato tipo_contrato_id_tipo_contrato, int id_tipo_contrato, int id_convenio) {
        this.id_contrato = id_contrato;
        this.ruta = ruta;
        this.convenio_id_convenio = convenio_id_convenio;
        this.tipo_contrato_id_tipo_contrato = tipo_contrato_id_tipo_contrato;
        this.id_tipo_contrato = id_tipo_contrato;
        this.id_convenio = id_convenio;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Convenio getConvenio_id_convenio() {
        return convenio_id_convenio;
    }

    public void setConvenio_id_convenio(Convenio convenio_id_convenio) {
        this.convenio_id_convenio = convenio_id_convenio;
    }

    public Tipo_Contrato getTipo_contrato_id_tipo_contrato() {
        return tipo_contrato_id_tipo_contrato;
    }

    public void setTipo_contrato_id_tipo_contrato(Tipo_Contrato tipo_contrato_id_tipo_contrato) {
        this.tipo_contrato_id_tipo_contrato = tipo_contrato_id_tipo_contrato;
    }

    public int getId_tipo_contrato() {
        return id_tipo_contrato;
    }

    public void setId_tipo_contrato(int id_tipo_contrato) {
        this.id_tipo_contrato = id_tipo_contrato;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }

    
    
    
}

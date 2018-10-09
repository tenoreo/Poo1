/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author kenda
 */
public class Mantenimiento {
    private String identificador;
    private Date fechaInicio;
    private Date fechaFinal;
    private int montoPagado;
    private String detalle;
    private String tipo;
    private Empresa empresa;

    public Mantenimiento(String identificador, Date fechaInicio, Date fechaFinal, int montoPagado, String detalle, String tipo, Empresa empresa) {
        this.identificador = identificador;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.montoPagado = montoPagado;
        this.detalle = detalle;
        this.tipo = tipo;
        this.empresa = empresa;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
        
}

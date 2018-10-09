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
public class Licencia {
    private int numero;
    private Date fechaEmision;
    private String tipo;
    private Date fechaExpiracion;

    public Licencia(int numero, Date fechaEmision, String tipo, Date fechaExpiracion) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    
    
}

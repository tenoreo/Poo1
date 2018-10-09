/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author kenda
 */
public class Empresa {
    private String razonSocial;
    private int numJuridico;
    private long telefono;
    private Direccion direccion;

    public Empresa(String razonSocial, int numJuridico, long telefono, Direccion direccion) {
        this.razonSocial = razonSocial;
        this.numJuridico = numJuridico;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNumJuridico() {
        return numJuridico;
    }

    public void setNumJuridico(int numJuridico) {
        this.numJuridico = numJuridico;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}

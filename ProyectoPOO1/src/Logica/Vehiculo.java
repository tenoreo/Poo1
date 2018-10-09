/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 *
 * @author kendall Tenorio Chévez
 */
public class Vehiculo {
    private String placa;
    private int anioFabricacion;
    private String color;
    private int capacidad;
    private int kilometraje;
    private int numVin;
    private String sede;
    private String estado;

    public Vehiculo(String placa, int anioFabricacion, String color, int capacidad, int kilometraje, 
            int numVin, String sede, String estado) {
        this.placa = placa;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
        this.numVin = numVin;
        this.sede = sede;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getNumVin() {
        return numVin;
    }

    public void setNumVin(int numVin) {
        this.numVin = numVin;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

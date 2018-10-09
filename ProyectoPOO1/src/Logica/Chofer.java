/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


/**
 *
 * @author kenda
 */
public class Chofer {
    private String nombre;
    private long telefono;
    private String correo;
    private long cedula;
    private Licencia licencias;

    public Chofer(String nombre, long telefono, String correo, long cedula, Licencia licencias) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
        this.licencias = licencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public Licencia getLicencias() {
        return licencias;
    }

    public void setLicencias(Licencia licencias) {
        this.licencias = licencias;
    }
    
}

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
public class Direccion {
    private String provincia;
    private String canton;
    private String distrito;
    private String senas;

    public Direccion(String provincia, String canton, String distrito, String senas) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.senas = senas;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getSenas() {
        return senas;
    }

    public void setSenas(String senas) {
        this.senas = senas;
    }
    
}

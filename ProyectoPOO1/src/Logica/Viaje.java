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
public class Viaje {
    private String puntoSalida;
    private Date fechaViaje;
    private String destino;
    private int kilometrajeInicial;
    private int kilometrajeFinal;
    private Chofer chofer;
    private Date horaInicio;
    private Date foraFinalizada;
    private String listaPasajero;
    private String identificador;
    private Date fechaSolicitada;

    public Viaje(String puntoSalida, Date fechaViaje, String destino, int kilometrajeInicial, int kilometrajeFinal, Chofer chofer, Date horaInicio, Date foraFinalizada, String listaPasajero, String identificador, Date fechaSolicitada) {
        this.puntoSalida = puntoSalida;
        this.fechaViaje = fechaViaje;
        this.destino = destino;
        this.kilometrajeInicial = kilometrajeInicial;
        this.kilometrajeFinal = kilometrajeFinal;
        this.chofer = chofer;
        this.horaInicio = horaInicio;
        this.foraFinalizada = foraFinalizada;
        this.listaPasajero = listaPasajero;
        this.identificador = identificador;
        this.fechaSolicitada = fechaSolicitada;
    }

    public String getPuntoSalida() {
        return puntoSalida;
    }

    public void setPuntoSalida(String puntoSalida) {
        this.puntoSalida = puntoSalida;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getKilometrajeInicial() {
        return kilometrajeInicial;
    }

    public void setKilometrajeInicial(int kilometrajeInicial) {
        this.kilometrajeInicial = kilometrajeInicial;
    }

    public int getKilometrajeFinal() {
        return kilometrajeFinal;
    }

    public void setKilometrajeFinal(int kilometrajeFinal) {
        this.kilometrajeFinal = kilometrajeFinal;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getForaFinalizada() {
        return foraFinalizada;
    }

    public void setForaFinalizada(Date foraFinalizada) {
        this.foraFinalizada = foraFinalizada;
    }

    public String getListaPasajero() {
        return listaPasajero;
    }

    public void setListaPasajero(String listaPasajero) {
        this.listaPasajero = listaPasajero;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Date getFechaSolicitada() {
        return fechaSolicitada;
    }

    public void setFechaSolicitada(Date fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }
    
}

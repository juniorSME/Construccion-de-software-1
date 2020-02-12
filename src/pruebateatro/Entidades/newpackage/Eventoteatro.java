/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebateatro.Entidades.newpackage;

import pruebateatro.Entidades.newpackage.Asistente;
import pruebateatro.Entidades.newpackage.Expositor;

/**
 *
 * @author 20162
 */
public class Eventoteatro {
    private String Titulo;
    private int duracionEvento;
    private Expositor Expositor;
    private Asistente Asistente;
    private String horaIngreso;
    private String horaSalida;
    private String temporadaEvento;
    private Double costoEntrada;
    private char ubicacionEvento;
    private MisConstantes constantes;

    
    public Eventoteatro(String Titulo, int duracionEvento, Expositor Expositor, Asistente Asistente, String horaIngreso, String horaSalida, String temporadaEvento, char ubicacionEvento) {
        this.Titulo = Titulo;
        this.duracionEvento = duracionEvento;
        this.Expositor = Expositor;
        this.Asistente = Asistente;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.temporadaEvento = temporadaEvento;
        this.costoEntrada = 0.0;
        this.ubicacionEvento = ubicacionEvento;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuracionEvento() {
        return duracionEvento;
    }

    public void setDuracionEvento(int duracionEvento) {
        this.duracionEvento = duracionEvento;
    }

    public Expositor getExpositor() {
        return Expositor;
    }

    public void setExpositor(Expositor Expositor) {
        this.Expositor = Expositor;
    }

    public Asistente getAsistente() {
        return Asistente;
    }

    public void setAsistente(Asistente Asistente) {
        this.Asistente = Asistente;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getTemporadaEvento() {
        return temporadaEvento;
    }

    public void setTemporadaEvento(String temporadaEvento) {
        this.temporadaEvento = temporadaEvento;
    }

    public Double getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(Double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

    public char getUbicacionEvento() {
        return ubicacionEvento;
    }

    public void setUbicacionEvento(char ubicacionEvento) {
        this.ubicacionEvento = ubicacionEvento;
    }

    public MisConstantes getConstantes() {
        return constantes;
    }

    public void setConstantes(MisConstantes constantes) {
        this.constantes = constantes;
    }
    
    
    public void costoPorUbicacion(){
      
        if(this.ubicacionEvento == 'P'){
            this.costoEntrada=constantes.Plantinum;
        }
        else if (this.ubicacionEvento == 'G'){
           this.costoEntrada=constantes.Gold;
        }
        else{
           this.costoEntrada=constantes.VIP;
        }

    }
    
    public double generarTotalConIGV(){
        costoEntrada=costoEntrada+(costoEntrada*constantes.IGV);
        return costoEntrada;
    }

    public double descuentoPorTemporada(){
        Double descuento = 0.0;
        if(temporadaEvento == "alta" ) {
        descuento = costoEntrada * 0.05;
        }
        
        if(temporadaEvento == "baja" ) {
        descuento = costoEntrada * 0.10;
        }
        return descuento;
    }
    
    
}

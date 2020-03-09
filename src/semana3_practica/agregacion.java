/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3_practica;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
//conceptual // especificacion // 
class cpu {
Scanner sc = new Scanner (System.in);
    private String cp;
    
    public cpu(String cp) {
        this.cp = cp;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}

class pantalla {
Scanner sc = new Scanner (System.in);
    private String mostrar;

    public pantalla(String mostrar) {
        this.mostrar = mostrar;
    }

    public String getMostrar() {
        return mostrar;
    }

    public void setMostrar(String mostrar) {
        this.mostrar = mostrar;
    }

}

class teclado {
Scanner sc = new Scanner (System.in);
    private String ingresar;

    public teclado(String ingresar) {
        this.ingresar = ingresar;
    }

    public String getIngresar() {
        return ingresar;
    }

    public void setIngresar(String ingresar) {
        this.ingresar = ingresar;
    }

}

class raton {
    Scanner sc = new Scanner (System.in);
    private String mover;

    public raton(String mover) {
        this.mover = mover;
    }

    public String getMover() {
        return mover;
    }

    public void setMover(String mover) {
        this.mover = mover;
    }

    public void mostrarraton() {
        System.out.println("Mouse ");
        this.mover= sc.next();
        System.out.println(this.mover);
    }
}

class ordenador {

    private int componentes;
    private cpu cp;
    private pantalla pan;
    private teclado tec;
    private raton mouse;

    public ordenador(cpu c, pantalla pant, teclado tecla, raton mous) {
        this.cp = c;
        this.pan = pant;
        this.tec = tecla;
        this.mouse = mous;
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }

    public cpu getCp() {
        return cp;
    }

    public void setCp(cpu cp) {
        this.cp = cp;
    }

    public pantalla getPan() {
        return pan;
    }

    public void setPan(pantalla pan) {
        this.pan = pan;
    }

    public teclado getTec() {
        return tec;
    }

    public void setTec(teclado tec) {
        this.tec = tec;
    }

    public raton getMouse() {
        return mouse;
    }

    public void setMouse(raton mouse) {
        this.mouse = mouse;
    }

    public void mostrar() {
        System.out.println("componentes :");
        setComponentes(6);
        System.out.println(getComponentes());
        System.out.println("CPU");
        cp.setCp("Core I7");
        System.out.println(cp.getCp());
        System.out.println("pantalla");
        pan.setMostrar("17 Pulgadas");
        System.out.println(pan.getMostrar());
        System.out.println("teclado");
        tec.setIngresar(" R Dragon Z9");
        System.out.println(tec.getIngresar());
        
    }
}

public class agregacion {

    public static void main(String[] args) {
        ordenador or = new ordenador(new cpu("Core I7"), new pantalla("17 pulgadas"), new teclado("R Dragon zt5"), new raton("evang 2017"));
        or.mostrar();
    }
}

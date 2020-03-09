/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado3;

import java.util.ArrayList;

/**
 *
 * @author 20162
 */
class num {

    private int n;

    public num() {
    }

    public num(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "numero: " + this.n;
    }
}

class numeros {

    ArrayList<num> ListaAlum = new ArrayList<>();

    public void agregar(num d) {
        ListaAlum.add(d);
    }

    public void mostrarcola() {
        for (int i = 0; i < ListaAlum.size(); i++) {
            System.out.println(ListaAlum.get(i).toString());
        }
    }

    public void mostrarPila() {
        for (int i = (ListaAlum.size()-1); i >= 0; i--) {
            System.out.println(ListaAlum.get(i).toString());
        }
    }
}

public class ejercicio7 {

    public static void main(String[] args) {
        numeros c = new numeros();
        num d1 = new num(4);
        num d2 = new num(3);
        num d3 = new num(5);
        num d4 = new num(6);
        c.agregar(d1);
        c.agregar(d2);
        c.agregar(d3);
        c.agregar(d4);
        System.out.println("COLA");
        c.mostrarcola();
        System.out.println("--------------------------------------------");
        System.out.println("PILA");
        c.mostrarPila();
    }
}

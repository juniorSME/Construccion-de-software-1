/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smana6practica;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author 20162
 */

interface Iimprecion {
    public void imprimir (Object o);
}
class laser implements Iimprecion{

    @Override
    public void imprimir(Object o) {
        System.out.println("imprecion a Laser");
    }
    
}
class termico implements Iimprecion{

    @Override
    public void imprimir(Object o) {
        System.out.println("impresion a Termico");
    }
    
}
class tinta implements Iimprecion{

    @Override
    public void imprimir(Object o) {
        System.out.println("impresion a tinta");
    }
    
}
class imprimir {
    private Iimprecion impri ;
    
    public void setImprimir(Iimprecion imprimir) {
        this.impri = imprimir;
    }
    public void saveImpresion (persona p){
        impri.imprimir(p);
    }
}

class persona{
    private String nombre;
    private double sueldo;
    public persona (){
        this.nombre =null;
        this.sueldo=0.0;
    }
    public persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
}
class padron<t> implements Iterable<t>{
    ArrayList <t> lista = new ArrayList(4);
    private int tope;
    void add(t p){
        if (lista.size()<=tope) {
            lista.add(p);
        }else{
            throw  new RuntimeException("no hay espacio ");
        }
    }
    @Override
    public Iterator<t> iterator() {
        return lista.iterator();
    }
}

public class ejericicio01 {
    public static void main(String[] args) {
        imprimir im =  new imprimir();
        padron<persona> lista =  new padron<>();
        persona p1 = new persona("naty", 1570);
        persona p2 =  new persona("Junior", 2154);
        lista.add(p1);
        lista.add(p2);
        im.saveImpresion(new persona());
        im.setImprimir(new tinta());

    }
}

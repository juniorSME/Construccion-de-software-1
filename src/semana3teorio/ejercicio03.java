/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3teorio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 20162
 */
class bolsa implements Iterable<Object>{
    ArrayList <Object> lista = new ArrayList <>(); 
    int tope;
    public bolsa (int x){
        super();
        this.tope=x;
    }
    public void add (Object o){
        
        if (lista.size()<=tope) {
            lista.add(o);
        }else {
            throw new RuntimeException(" no cabe mas");
        }
    }
    @Override
    public Iterator iterator() {
        return lista.iterator();
    }
    
}
 class golosina {
    private String marca;
    public golosina (String marca){
        this.marca= marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
class chocolatina {
    private String nombre;

    public chocolatina(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
public class ejercicio03 {
    public static void main(String[] args) {
        bolsa  merc = new bolsa (5);
        chocolatina c1 =  new chocolatina("mashemelo");
        chocolatina c2 =  new chocolatina("bombon");
        golosina go =  new golosina(" chupetin");
        golosina go1 = new golosina(" chicle");
        golosina go2= new golosina("chupete");
        merc.add(c1);
        merc.add(c2);
        merc.add(go);
        merc.add(go1);
        merc.add(go2);
        for (Object ob:merc ) {
            if (ob instanceof chocolatina) {
                System.out.println("chocolatina de nombre: "+ ((chocolatina)ob).getNombre());
            }else {
                System.out.println("golosina: "+ ((golosina)ob).getMarca());
            }
        }
    }
}

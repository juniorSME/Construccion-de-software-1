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
class bolsa2 <T> implements Iterable<T>{
    ArrayList<T> lista =  new ArrayList<T>();
    private int tope;
    public bolsa2(int x){
        this.tope=x;
    }
    void add(T p){
        if (lista.size()<=tope) {
            lista.add(p);
        }else{
            throw  new RuntimeException("no hay espacio ");
        }
    }
    @Override
    public Iterator<T> iterator() {
        return lista.iterator();
    }
    
}

public class ejercicio04 {
    public static void main(String[] args) {
         bolsa2<golosina> bols =  new bolsa2(4);
         bolsa2<chocolatina> chocol= new bolsa2(2);
         golosina g1 = new golosina(" caramelo");
         golosina g2 =  new golosina("galleta");
         golosina g3 = new golosina("chupetin");
         golosina g4 = new golosina("agua");
         chocolatina c1 = new chocolatina(" leche");
         chocolatina c2 = new chocolatina(" mineral");
         bols.add(g1);
         bols.add(g2);
         bols.add(g3);
         bols.add(g4);
         chocol.add(c1);
         chocol.add(c2);
         for (Object g:bols) {
             System.out.println(((golosina)g).getMarca());
        }
         for (Object g:chocol) {
             System.out.println(((chocolatina)g).getNombre());
        }
    }
}

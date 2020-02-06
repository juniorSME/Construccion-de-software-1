package semana2Teoria;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 20162
 */
public class Arraylist {
    public static void main(String[] args) {
        ArrayList <String> familia = new ArrayList <>();
        
        familia.add("junior");
        familia.add("lucio");
        familia.add("yolanda");
        familia.add("karina");
        familia.add("jhassyel");
        familia.add("abner");
        familia.add("jhoys");
        int contador=0;
        for (int i = 0; i <familia.size(); i++) {
            System.out.println(familia.get(i));
            //metodo para mostrar las ultimas letras de los nombres y contarlos
            String cadenaAux= familia.get(i);
            if (cadenaAux.endsWith("l")) {
                contador++;
            }
        }
        System.out.println("existen "+ contador+ " personas");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado1;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class ejercicio8 {
    // Una persona desea invertir su dinero en un banco, el cual le otorga un 2% de interés. 
    //Cual será la cantidad de dinero que esta persona tendrá al cabo de un año si la ganancia de cada mes es reinvertida?. 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("ingrese la cantidad de dinero a invertir");
        double cantidad =  sc .nextDouble();//25021
        double ahorrototal=0;
        double contador=0;
        double dinero=0;
        for (int mes = 1; mes<= 12; mes++) {
            dinero = cantidad*0.02;
            double aux = cantidad+dinero;
            ahorrototal=aux;
            System.out.println(ahorrototal);
            cantidad=aux;
        }
        System.out.println("el ahorro en un año sera: "+ ahorrototal);
    }
}

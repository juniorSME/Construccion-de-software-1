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
public class ejercicio38 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        //Calcular la suma siguiente:  100 + 98 + 96 + 94 + . . . + 0 en este orden 
        System.out.println("suma descendiente");
        System.out.println("ingrese el numero mayor ");
        int nummayor= sc.nextInt();
        int contador=0;
        for (int i =nummayor; i >0 ; i-=2) {
            System.out.print(i+"+");
            contador+=i;
        }
        System.out.println("0");
        System.out.println("\n el  resultado  de toda la suma es: "+contador);
    }
}

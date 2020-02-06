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
public class ejercicio3p1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("ingrese el numero del factorial mayor");
        int factorial =sc.nextInt();
        double total=1;
        double sumatoria=0;
        double resultado=0;
        int i=1;
        do {
            total *=i;
            sumatoria=1/total;
            resultado+=sumatoria;
            i++;
        }while(i<=factorial);
        System.out.println("el resultado  es: "+resultado );
    }
}

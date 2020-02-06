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
public class ejercicio3p2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("ingrese el numero maximo para hallar la sumatoria de sus factoriales");
        int factorial = sc.nextInt();
        double total=1;
        double sumatoria=0;
        double resultado=0;
        int i=1;
        while(i<=factorial) {
            total *=i;
            sumatoria=1/total;
            resultado+=sumatoria;
            i++;
        }
        System.out.println("el resultado  es: "+resultado );
    }
}

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
public class ejercicio3p {
    //Calcular la suma de 1+ 1/(2!) + 1/(3!) + 1/(4!) + .... + 1/(n!) para un n dado. 
    //Escriba el programa de tres formas diferentes: usando Repita mientras, Repita hasta y Repita para. 
    //repita para 
    public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);
        System.out.println("ingrese un numero para realizar la sumatoria de todos sus factoriales");
        int numero = sc.nextInt();
        System.out.println(factorial(numero));
    }
    public static double factorial(int numero) {
        double factorial = 1;
        double resultado=0;
        double total=0;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
            resultado =1/factorial;
            total+=resultado;
        }
        System.out.println("la suma total es de: "+total);
        return factorial;   
    }
}

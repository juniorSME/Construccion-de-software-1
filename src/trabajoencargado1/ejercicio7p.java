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
public class ejercicio7p {

    // Escriba un programa que lea un valor entero positivo y determine: 
    //a) Si el entero es un número primo.
    //b) Si el entero es un número de Fibonacci. 
    //(Los número de Fibonacci forman una secuencia en la cual cada número es igual a la suma de
    //los dos anteriores, siendo los dos primeros números iguales a 1) 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println(primo(numero));
    }

    public static int primo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("el numero ingresado es un numero primo");
        } else {
            System.out.println("el numero ingresado no es un numero primo");
        }
         return numero;
    }
    public static int fibonacci (int numero){
        
        return numero;
    }
}

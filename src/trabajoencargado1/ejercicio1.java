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
public class ejercicio1 {
    // Realizar un programa que promedie una lista indeterminada de números reales, hasta que se introduzca un número negativo. 
    //Escriba el programa de dos formas: usando el WHILE-DO y el REPEAT-UNTIL (WHILE). 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("ingrese la cantidad de numeros reales a ingresar:  ");
        int cantidad =  sc.nextInt();
        float num;
        int indice =1;
        float contador=0;
        float promedio=0;
        do{
            System.out.print("N°"+ indice+ ": ");
            num=sc.nextFloat();
            if (num>=0) {
                contador += num;
                promedio=contador/cantidad;
                indice++;
            }else {
                System.out.println("el numero ingresado  es negativo por lo tanto el programa se ha cerrado");
                break;
            }
        }while(indice<=cantidad);
        System.out.println("el  promedio  de los numeros reales ingresados es: "+ promedio);
    }
}

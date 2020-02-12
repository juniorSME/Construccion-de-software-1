/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado2;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int suma,valor,promedio;
        suma=0;
        int i=1;
        do{
            System.out.println("ingrese valor:");
            valor=teclado.nextInt();
            suma=suma+valor;
            i++;
        }while (i<=10);
        System.out.println("la suma es: "+suma);
        promedio = suma/10;
        System.out.println("el promedio  es: "+promedio);
        
    }
}

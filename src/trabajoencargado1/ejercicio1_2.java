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
public class ejercicio1_2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("ingrese la cantidad de numeros reales a promediar: ");
        int cantidad =  sc .nextInt();
        float num;
        int indice=1;
        float sumatoria=0;
        float promedio=0;
        
        while(indice<=cantidad){
            System.out.print("N° "+indice+":");
            num=sc.nextFloat();
            if (num>=0) {
                sumatoria += num;
                promedio=sumatoria/cantidad;
                indice++;
            }else {
                System.out.println("el programa ha detectado un numero negativo por lo tanto el programa se ha cerrado");
                break;
            }
        }
        System.out.println("el promedio  de los numeros reales ingresados es: "+promedio);
    }
}

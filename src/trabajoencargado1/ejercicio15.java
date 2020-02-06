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
public class ejercicio15 {
    //Encontrar el menor valor de un conjunto de n números dados.
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese cuantos numeros se desea generar");
        int cantidad =  sc.nextInt();
        int num;
        int aux=0;
        System.out.println("-----------------------------");
        for (int j = 0; j <=cantidad; j++) {
             num = (int)(Math.random()*100+0);
             System.out.println(num);
             if (aux==0) {
                aux=num;
            }else {
                 if (num<aux) {
                     aux=num;
                 }
             }
        }
        System.out.println("el numero menor del conjunto de numeros es : " + aux);
    }
}

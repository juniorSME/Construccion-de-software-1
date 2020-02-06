/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semena1Practica;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("ingrese la temperatura en fahrenheit para convertirlo a Celcius");
        float temperatura =  sc.nextFloat();
        float resultado=0;
        int i =1;
        while (i<temperatura){
            resultado =((temperatura-32)*5/9);
            i++;
        }
        System.out.println("la temperatura "+ temperatura +" en Celcius es igual a: "+ resultado);
    }
}

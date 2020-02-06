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
public class sumardosnumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" ingrese el primer numero");
        int num1, num2;
        num1=sc.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=sc.nextInt();
        int resultado =  num1+num2;
        System.out.println("el resultado de la suma es igual a "+ resultado);
    }
}

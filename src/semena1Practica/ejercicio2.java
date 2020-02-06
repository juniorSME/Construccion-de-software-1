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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("A: ingrese el primer valor");
        System.out.println("B: ingrese el  segundo valor ");
        float a, b ,c ,d; 
        a=sc.nextInt();
        b= sc.nextInt();
        c= (float) (((4*Math.pow(a, 2))+(3*a*b)+(Math.pow(b,2)))/((Math.pow(a, 2))-(Math.pow(b, 2))));
        float resultadoc = c;
        d= ((3*resultadoc*resultadoc+a+b)/4);
        float resultadod=d;
        System.out.println("el resultado de la ecuacion c es :" +resultadoc);
        System.out.println("el resultado de la ecuacion d es : "+ resultadod);
    }
}

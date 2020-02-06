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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1,num2,num3,num4,num5;
        int suma;
        //DecimalFormad formato =  new DecimalFormat ("###.##%");
        System.out.println("ingrese el primer numero ");
        num1=sc.nextInt();
        System.out.println("ingrese el segundo numero ");
        num2=sc.nextInt();
        System.out.println("ingrese el tercer numero");
        num3=sc.nextInt();
        System.out.println("ingrese el cuarto numero");
        num4=sc.nextInt();
        System.out.println("ingrese el quinto numero");
        num5=sc.nextInt();
        suma=num1+num2+num3+num4+num5;
        System.out.println("el porcentaje total del numero "+num1+" es : "+(num1*100/suma));
        System.out.println("el porcentaje total del numero "+num2+" es : "+(num2*100/suma));
        System.out.println("el porcentaje total del numero "+num3+" es : "+(num3*100/suma));
        System.out.println("el porcentaje total del numero "+num4+" es : "+(num4*100/suma));
        System.out.println("el porcentaje total del numero "+num5+" es : "+(num5*100/suma));
        
    }
}

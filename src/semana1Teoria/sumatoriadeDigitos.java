/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1Teoria;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class sumatoriadeDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, acumulador=0;
        System.out.println("ingrese el numero");
        num=sc.nextInt();
        int auxiliar = num;
        while(num>0){
            acumulador +=num%10;
            num/=10;
            }
        System.out.println("el resultado de la suma de los digitos del numero  : "+auxiliar+" es "+acumulador);
    }
}

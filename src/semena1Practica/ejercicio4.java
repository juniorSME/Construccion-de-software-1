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
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese la cantidad de horas a convertir en minutos y segundos");
        int hora =  sc.nextInt();
        int min=0, seg=0;
        //int i = 1;
        //while (i<hora){
            //1 hora = 60 minutos
            min = hora*60;
            // 1 minuto = 60 segundos 
            // resultado = (hora*minutos)*segundo;
            seg =hora*3600;
            //i++;
       // }
        System.out.println(hora+"  horas tiene:  "+min+" minuos");
        System.out.println(hora+"  horas tiene: "+seg+" segundos");
    }
}

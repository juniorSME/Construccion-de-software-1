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
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese la cantidad de milimetros a transformar: ");
        int dato = sc.nextInt();
        //1000 milimetros = 1 metro
        //10 decimetros = 1 metro 
        //100 centimetros = 1 metro 
        //1 milimetro = 0.10 centimetros
        //1 milimetro = 0.010 decimetros
        //1 milimetro =0.0010 metros
        int metro =0;
        int centimetro=0;
        int decimetro= 0;
        int milimetro=0;
        //int auxiliar = milimetros;
        while (dato>0) {
            //milimetros = 51500054
            metro =dato/1000;
            //metro = 51500
            dato%=1000;

            decimetro = dato/100;
            dato%=100;

//            decimetro = 0
            centimetro= dato/10;
            dato%=10;

//            centimetro = 5
            milimetro =  dato/1;
            dato%=1;
            // milimetro = 4
        }
        System.out.println(": "+ metro +" metros ");
        System.out.println(": "+ decimetro+ " decimetro ");
        System.out.println(": "+centimetro+ " centimetro");
        System.out.println(": "+ milimetro + " milimetros");
    }
}

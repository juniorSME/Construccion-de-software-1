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
public class ejercicio5_1a {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("---ESTACIONAMIENTO  T&Q ---");
        System.out.println("ingrese cuantas horas desea estacionar el cliente: ");
        int aux=0, aux2=0, aux3=0, aux4=0, aux5, aux6, aux7, aux8,aux9;
        int total=0;
        int resultado=0;
        int hora =sc.nextInt();
        if (hora<=2) {
            aux=hora*5;
            System.out.println("el  total a pagar por las "+hora+" horas de estacionamiento  es: $"+aux);
        }else if (hora<=8){
            aux=2*5;
            aux2=hora-2;
            aux3 = aux2*4;
            total=aux+aux3;
            System.out.println("el  total a pagar por las: "+hora+" horas de estacinamiento es: $"+total);
        }else if (hora<=14){
            aux=2*5;
            aux2=hora-2;
            aux3=aux2-4;
            total=aux3*3;
            aux4=aux2-aux3;
            aux5=aux4*4;
            resultado=aux+total+aux5;
            System.out.println("el  total a pagar por las: "+hora+" horas de estacionamiento es: $"+resultado);
        }else {
            aux=2*5;
            aux2=hora-2;
            aux3=aux2-4;
            aux4=aux3-5;
            aux5=aux4*2;
            aux6=aux3-aux4;
            aux7=aux6*3;
            aux8=aux2-aux3;
            aux9=aux8*4;
            total=aux+aux5+aux7+aux9;
            System.out.println("el  total a pagar por las: "+hora+" horas de estacionamiento es: $"+total);
        }
    }
}

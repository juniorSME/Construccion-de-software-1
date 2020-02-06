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
public class ejercicio12 {
    //Determinar la cantidad semanal de dinero que recibirá cada uno de los n obreros de una empresa. 
    //Se sabe que cuando las horas que trabajo un obrero exceden de 40, el resto se convierte en horas extras que se pagan al doble
    //de una hora normal, cuando no exceden de 8; cuando las horas extras exceden de 8 se pagan las primeras 8 al doble de lo que se
    //paga por una hora normal y el resto al triple. 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("contructora eliot");
        System.out.println("ingrese la cantidad de obreros  que trabajan");
        int cantidad = sc.nextInt();
        int i=1;
        int aux =0;
        int remuneracion=0;
        int aux2=0;
        int aux3=0;
        int resultado1=0;
        int aux4=0;
        int resultado=0;
        while (i<=cantidad){
            ///por default el pago por hora es de $ 50
            System.out.println("ingrese la cantidad de horas que trabajo durante la semana el obrero "+i);
            int hora = sc.nextInt();
            
            if (hora<=40) {
                remuneracion=hora*50;
                System.out.println("la remuneracion semanal del obrero "+ i +" es de: "+remuneracion);
            }else if (hora<=48){
                remuneracion=40*50;
                aux=hora - 40;
                aux2=aux*100;
                resultado =remuneracion+aux2;
                System.out.println("la remuneracion  semanal del obrero "+ i + "es de : "+ resultado);
            }else {
                    //hora normal
                    remuneracion=40*50;
                    //remuneracion == 2000
                    aux=hora - 40;
                    //aux = 150-40 ==110
                    aux2=aux-8;
                    //aux2 =110-8 ==102
                    //hora triple 50*3 = 150
                    resultado1=aux2*150;
                    //resultado = 102*150 ==15300
                    aux3=aux-aux2;
                    //aux3= 110-102 ==8
                    //hora doble 50*2 = 100
                    aux4=aux3*100;
                    // aux4 = 8*100==800
                    resultado=remuneracion+resultado1+aux4;
                    System.out.println("la remuneracion  semanal del obrero "+ i+ "es de : "+ resultado);
                
            }
            i++;
        }
        
    }
}

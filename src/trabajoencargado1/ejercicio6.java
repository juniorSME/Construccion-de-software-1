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
public class ejercicio6 {
    // En una empresa se requiere calcular el salario semanal de cada uno de los n obreros que laboran en ella. 
    //El salario se obtiene de la sig. forma:  Si el obrero trabaja 40 horas o menos se le paga $20 por hora  
    //Si trabaja mas de 40 horas se le paga $20 por cada una de las primeras 40 horas y $25 por cada hora extra. 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("----EMPRESA EL EMPRENDEDOR------");
        System.out.println("ingrese la cantidad de horas que labora el obrero");
        int hora =sc.nextInt();
        int salario;
        int dia;
        int salariototal;
        if (hora<=40) {
            //5 representa a los dias laborables de la semana 
            salariototal= (hora)*20;
            System.out.println("el obrero  que trabaja "+ hora+ " recibe una remuneracion de: "+salariototal);
        }else {
            //40 representa al limite de horas a pagarse $20,  sobrepasado ese limite se le paga $25 por hora
            salariototal= (40)*20;
            dia = hora -40;
            salario = dia *25;
            int aux = salario+salariototal;
            System.out.println("el obrero  que trabaja "+ hora + " recibe una remuneracion de "+ aux);
        }
        
    }
}

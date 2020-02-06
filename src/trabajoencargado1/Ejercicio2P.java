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
public class Ejercicio2P {
    //Suponga que se piden X soles prestados a un banco, con el acuerdo de devolver Y soles cada
    //mes hasta devolver el préstamo completo. Parte del pago mensual serán intereses, calculados 
    //como el i por ciento del capital por devolver en ese momento. El resto del pago mensual se aplica 
    //a reducir el capital a devolver. El programa debe determinar: 
    //a.- La cantidad de intereses pagada cada mes. 
    //b.- La cantidad de dinero aplicada cada mes al capital por devolver 
    //c.- La cantidad acumulada de intereses pagados al final de cada mes. 
    //d.- La cantidad del préstamo aún pendiente al final de cada mes.
    //e.- El número necesario de pagos mensuales para devolver el préstamo completo. 
    //f.- La cantidad del último pago (probablemente menor que Y) 
    //Compruebe el programa usando los siguientes datos: X = 7.200.000, Y = 360.000, i= 1% 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" ingrese la cantidad de dinero a prestar: ");
        float dinero = sc.nextFloat();
        //modificar
        System.out.println("ingrese la cantidad de meses a devolver: ");
        int mes = sc.nextInt();
        float interes=0;
        //100/5=20
        int deuda = (int) (dinero/mes);
        System.out.println("en total a pagar canda mese es de "+deuda);
        //mes=deuda
        for (int i = 1; i <=mes; i++) {
            interes = (float) (dinero*0.01);
            System.out.println(" el interes a pagar es de : "+ interes);
            float neto = deuda+interes;
            System.out.println("el mes: "+ i + " tendra que pagar un total  de: "+neto);
            dinero = dinero-neto;
            System.out.println("la cantidad de dinero que se debe a un es de: "+dinero);
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("la cantidad de interes pagada por cada mes es de: "+interes);
        
    }
}

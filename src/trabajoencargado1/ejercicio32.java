/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class ejercicio32 {
    //Un jefe de casilla desea determinar cuantas personas de cada una de las secciones que componen su zona
    //asisten el día de las votaciones. Las secciones son: norte, sur y centro. También desea determinar cual 
    //es la sección con mayor numero de votantes. 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        DecimalFormat decimal = new DecimalFormat("###.##%");
        System.out.println("ingrese la cantidad de personas que van  las votaciones");
        int cantidad = sc.nextInt();
        int secciones;
        int contadornorte=0, contadorsur=0, contadorcentro=0;
        for (int i = 1; i <= cantidad; i++) {
            secciones = (int )(Math.random()*3+1);
            if (secciones==1) {
                System.out.println("el elector N°: "+ i +" pertenece a la zona NORTE");
                contadornorte++;
            }else if (secciones==2){
                System.out.println("el elector N°: "+ i +" pertenece a la zona SUR");
                contadorsur++;
            }else {
                System.out.println("el elector N°: "+ i +" pertenece a la zona CENTRO");
                contadorcentro++;
            }
        }
        System.out.println("la zona NORTE tiene "+ contadornorte+ " votantes que es equivalente a: "+decimal.format((double)contadornorte/(double)cantidad));
        System.out.println("la zona SUR tiene "+ contadorsur+ " votantes que es equivalente a: "+decimal.format((double)contadorsur/(double)cantidad));
        System.out.println("la zona CENTRO tiene "+ contadorcentro+ " votantes que es equivalente a: "+decimal.format((double)contadorcentro/(double)cantidad));
    }
}

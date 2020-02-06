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
public class ejercicio11 {
    // Leer 50 calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje de reprobados. 
    // Tomando en cuenta que la calificación mínima aprobatoria es de 70. 
    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);
        DecimalFormat decimal = new DecimalFormat("###.##%");
        System.out.println("ingrese la cantidad de alumnos a promediar");
        int cantidad= sc .nextInt();
        
        int notagenerar=0;
        int  contadordesaprobado=0;
        int promedio=0;
        int cantidadnota;
        int i=1;
        int aux=0;
        while(i<=cantidad){
            System.out.println("ingrese cuantas notas desea generar");
            cantidadnota =sc.nextInt();
            System.out.println("nota del alumno: "+i );
            for (int j = 1; j <=cantidadnota; j++) {
                //en este caso vamos a generar un random para que sea mas facil
                notagenerar = (int)(Math.random()*20+0);
                System.out.println(notagenerar);
                 aux= aux+notagenerar;
                 promedio=aux/cantidadnota; 
            }
            System.out.println("="+promedio );
            if (aux<70) {
                    contadordesaprobado++;   
            }
            System.out.println("total: "+aux);
            i++;
        }
        System.out.println("desaprobado: "+ contadordesaprobado);
        System.out.println("el porcentaje de alumnos desaprobados es de : "+decimal.format((double)contadordesaprobado/(double)cantidad));
    }   
}

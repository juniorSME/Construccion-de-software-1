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
public class ejercicio14 {
    // Calcular el promedio de edades de hombres, mujeres y de todo un grupo de alumnos. 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("calcular promedio  de edades ");
        System.out.println("ingresar la cantidad  total de personas aglomeradas");
        int cantidad = sc.nextInt();
        int i = 1;
        int sexo ; 
        int edad;
        int edadacumuladamasculino = 0, edadacumuladafemenino=0, edadacumuladototal =0;
        int contadormasculino=0, contadorfemenino=0, contadortotal=0;
        int contM=0, contF=0, contT=0;
        while (i<=cantidad){
            sexo = (int)(Math.random()*2+1);
            edad = (int) (Math.random()*80+1);
            if (sexo==1) {
                System.out.println("Masculino: "+edad +" años");
                contM++;
                edadacumuladamasculino+=edad;
                contadormasculino=edadacumuladamasculino/contM;  
            }else {
                System.out.println("Femenino: "+edad +" años");
                contF++;
                edadacumuladafemenino+=edad;
                contadorfemenino=edadacumuladafemenino/contF;
            }
            contT++;
            edadacumuladototal+=edad;
            contadortotal=edadacumuladototal/cantidad;
            i++;
        }
        System.out.println("promedio  de edad del  genero masculino  es de : "+ contadormasculino);
        System.out.println("promedio  de edad del genero  femenino  es de :"+ contadorfemenino);
        System.out.println("promedio  de la edad en general  es de : "+ contadortotal);
    }
}

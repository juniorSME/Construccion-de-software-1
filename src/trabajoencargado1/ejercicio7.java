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
public class ejercicio7 {
    // Obtener el promedio de calificaciones de un grupo de n alumnos. 
    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);
        System.out.println("ingrese la cantidad de alumnos a  promediar ");
        int cantidad = sc.nextInt();
        System.out.println("ingrese cuantas notas va a ingresar por alumno");
        int cantidadnota= sc.nextInt();
        float contador=0;
        float nota;
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidadnota; j++) {
                System.out.println("Alumno N:"+(i+1)+" :");
                nota=sc.nextFloat();
                contador +=nota;
            }
        }
        float promedio=0;
        promedio = contador/cantidad;
        System.out.println("el  promedio  los "+ cantidad + " de alumnos es:  "+ promedio);
    }
}

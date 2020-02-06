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
public class ejercicio2 {
    //Determinar cuantos hombres y cuantas mujeres se encuentran en un grupo de n personas,
    //suponiendo que los datos son extraídos alumno por alumno
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese la cantidad de personas aconglomeradas en el lugar  a calcular");
        int cantidad = sc.nextInt();
        int i =1;
        int sexo;
        int contm=0, contf=0;
        while (i<=cantidad){
            sexo = (int) (Math.random()*2+1);
            if (sexo==1) {
                contm++;
            }else {
                contf++;
            }
            i++;
        }
        System.out.println("en el grupo  existe "+contm+ " personas del  genero masculino");
        System.out.println("en el grupo existe "+ contf + "personas del genero femenino");
    }
}

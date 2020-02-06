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
public class ejercicio9p {
    // En un centro de verificación de automóviles se desea saber el promedio de puntos contaminantes 
    //de los primeros 25 automóviles que lleguen. Asimismo se desea saber los puntos contaminantes del
    //carro que menos contamino y del que mas contamino. 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        int mayor, menor;
        mayor=0;
        menor=1000000000;
        int contaminacion=0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("ingrese el grado de contaminacion del automovil: "+ i);
            contaminacion=sc.nextInt();
            if (contaminacion>mayor) {
                mayor=contaminacion;
            }else if (contaminacion<menor){
                menor=contaminacion;
            }
            
        }
        System.out.println("el auto que mas contamino obtuvo "+mayor);
        System.out.println("el auto que menos contamino obtuvo "+menor);
    }
    }


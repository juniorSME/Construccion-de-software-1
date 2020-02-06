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
public class ejercicio10p {

    //Un entrenador le ha propuesto a un atleta recorrer una ruta de cinco kilómetros durante 10 días,
    //para determinar si es apto para la prueba de 5 Kilómetros o debe buscar otra especialidad.
    //Para considerarlo apto debe cumplir por lo menos una de las siguientes condiciones:  
    //- Que en ninguna de las pruebas haga un tiempo mayor a 16 minutos.
    //- Que al menos en una de las pruebas realice un tiempo mayor a 16 minutos.  
    //- Que su promedio de tiempos sea menor o igual a 15 minutos. 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("ingrese la cantidad de dias a evaluar");
        int dia= sc.nextInt();
        int tiempoprueba=0;
        int resultado=0;
        double total=0;
          int contador=0;
        System.out.println("ingrese la cantidad de minutos que toma en realizar alguna de las pruebas");
        for (int i = 1; i <=dia; i++) {
            System.out.println("dia "+i+":");
            tiempoprueba=sc.nextInt();
            contador+=tiempoprueba;
        }
        System.out.println(contador);
        total=contador/dia;
        System.out.println(total);
        if (total<=15||tiempoprueba>=16) {
            System.out.println("es apto");
        }else {
            System.out.println("no  es apto");
        }
    }

}
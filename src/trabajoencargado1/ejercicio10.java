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
public class ejercicio10 {
    // Leer los 250,000 votos otorgados a los 3 candidatos a gobernador e imprimir el numero del candidato ganador y su cantidad de votos.
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ONPË");
        System.out.println("ingrese el numero  de votantes ");
        int electores = sc.nextInt();
        int contador1=0, contador2=0, contador3=0;
        int ganador=electores;
        for (int i = 0; i < electores; i++) {
            //supongamos que los 3 cantidados sean 1 2 y 3
            
            int opc = (int)(Math.random()*3+1);
            if (opc ==1) {
                contador1++;
            }else if (opc==2){
                contador2++;
            }else {
                 contador3++;
            }
            
            System.out.println("voto N°"+(i+1)+ " es :"+opc);
        }
        System.out.println(" el candidato N° 1 obtuvo: "+contador1 +" votos");
        System.out.println("el  candidato N° 2 obtuvo: "+ contador2+" votos");
        System.out.println("el candidato N°3 obtuvo: "+contador3+" votos");
        if (contador1==contador2 && contador2 ==contador3) {
            System.out.println("empate");
        }else if (contador1>contador2&&contador1>contador3){
            System.out.println("el  ganador de las elecionnes es el candidato N°1 con "+ contador1 + " votos");
        }else if(contador2>contador1&&contador2>contador3){
            System.out.println("el ganador de las elecciones el  el candidato N°2 con "+ contador2 + " votos");
        }else {
            System.out.println("el  ganador de las elecciones es el  candidato N°3 con "+ contador3 + " votos ");
        }
    }
}

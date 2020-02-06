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
public class ejercicio9 {
    //En la Cámara de Diputados se levanta una encuesta con todos los integrantes con el fin de determinar 
    //que porcentaje de los n diputados esta a favor del Tratado de Libre Comercio, que porcentaje esta en contra 
    //y que porcentaje se abstiene de opinar. 
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("ingrese la cantidad de diputados que se encuentran  en la  Camara");
        DecimalFormat decimal = new DecimalFormat("###.##%");
        int cantidad = sc.nextInt();
        int i =1;
        int voto;
        int favor=0, contra=0, abstinencia=0;
        int porcentajefavor=0, porcentajecontra=0, porcentajeabstinencia=0;
        while (i<=cantidad){
            voto= (int) (Math.random()*3+1);
            if (voto==1) {
                favor++;
            }else if(voto==2){
                contra++;
            }else {
                abstinencia++;
            }
            i++;
        }
        //decimal.format((double)contadordesaprobado/(double)cantidad)
        System.out.println("Diputados que estan a favor son "+ favor+ " obteniendo un porcentaje de: "+decimal.format((double)favor/(double)cantidad));
        System.out.println("Diputados  que estan  en contra son : "+ contra+" obteniendo un pocentaje de: "+ decimal.format((double)contra/(double)cantidad));
        System.out.println("Diputados que se encuentran en  abstinencia son : "+ abstinencia+ " obteniendo un porcentaje de : "+ decimal.format((double)abstinencia/(double)cantidad));
    }
}

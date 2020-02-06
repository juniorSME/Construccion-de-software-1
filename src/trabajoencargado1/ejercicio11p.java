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
public class ejercicio11p {

    // Un Zoólogo pretende determinar el porcentaje de animales que hay en las siguientes tres categorías de edades: 
    //de 0 a 1 año, de mas de 1 año y menos de 3 y de 3 o mas años. 
    //El  zoológico todavía no esta seguro del animal que va a estudiar. 
    //Si se decide por elefantes solo tomara una muestra de 20 de ellos; 
    //si se decide por las jirafas, tomara 15 muestras, y si son chimpancés tomara 40. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("opcion 1: elefante");
        System.out.println("opcion 2: jirafas");
        System.out.println("opcion 3: chimpances");
        int opc = sc.nextInt();
        int cat;
        int cantidadtotalelefante=0, cantidadtotaljirafa=0, cantidadtotalchimpance=0;
        int cantidadelefante0=0,cantidadelefante1=0,cantidadelefante3=0;
        int cantidadjirafa0=0,cantidadjirafa1=0,cantidadjirafa3=0;
        int cantidadchimpance0=0, cantidadchimpance1=0,cantidadchimpance3=0;
        double porcentajeelefante1=0,porcentajejirafa=0, porcentajechimpance3=0;
        int cantidadedad0=0,cantidadedad1=0,cantidadedad3=0;
        while (opc != 3) {
            switch (opc) {
                case 1:
                    System.out.println("categoria 1: de 0 a 1 año");
                    System.out.println("categoria 2:  de 1 a 3 años");
                    System.out.println("categoria 3: de 3 a mas");
                    cat=sc.nextInt();
                    if (cat==1) {
                        System.out.println("ingrese cuantos elefantes as de registrar ");
                        cantidadelefante0=sc.nextInt();
                        cantidadelefante0++;
                    }else if (cat==2){
                        System.out.println("ingrese cuantos elefantes as de registrar ");
                        cantidadelefante1=sc.nextInt();
                        cantidadelefante1++;
                    }else {
                        System.out.println("ingrese cuantos elefantes as de registrar ");
                        cantidadelefante3=sc.nextInt();
                        cantidadelefante3++;
                    }
                    cantidadtotalelefante=cantidadelefante0+cantidadelefante1+cantidadelefante3;
                    break;
                case 2:
                    System.out.println("categoria 1: de 0 a 1 año");
                    System.out.println("categoria 2:  de 1 a 3 años");
                    System.out.println("categoria 3: de 3 a mas");
                    cat=sc.nextInt();
                    if (cat==1) {
                        System.out.println("ingrese cuantos jirafas as de registrar ");
                        cantidadjirafa0=sc.nextInt();
                        cantidadjirafa0++;
                    }else if (cat==2){
                        System.out.println("ingrese cuantos jirafas as de registrar ");
                        cantidadjirafa1=sc.nextInt();
                        cantidadjirafa1++;
                    }else {
                        System.out.println("ingrese cuantos jirafas as de registrar ");
                        cantidadjirafa3=sc.nextInt();
                        cantidadjirafa3++;
                    }
                cantidadtotaljirafa=cantidadjirafa0+cantidadjirafa1+cantidadjirafa3;
                    break;
                case 3:
                    System.out.println("categoria 1: de 0 a 1 año");
                    System.out.println("categoria 2:  de 1 a 3 años");
                    System.out.println("categoria 3: de 3 a mas");
                    cat=sc.nextInt();
                    if (cat==1) {
                        System.out.println("ingrese cuantos chimpance as de registrar ");
                        cantidadchimpance0=sc.nextInt();
                        cantidadchimpance0++;
                    }else if (cat==2){
                        System.out.println("ingrese cuantos chimpance as de registrar ");
                        cantidadchimpance1=sc.nextInt();
                        cantidadchimpance1++;
                    }else {
                        System.out.println("ingrese cuantos chimpance as de registrar ");
                        cantidadchimpance3=sc.nextInt();
                        cantidadchimpance3++;
                    }
                    cantidadtotalchimpance=cantidadchimpance0+cantidadchimpance1+cantidadchimpance3;
                    break;
                case 4:
                    break;
            }
            cantidadedad0=cantidadchimpance0+cantidadelefante0+cantidadjirafa0;
            cantidadedad1=cantidadchimpance1+cantidadelefante1+cantidadjirafa1;
            cantidadchimpance3=cantidadchimpance3+cantidadelefante3+cantidadjirafa3;
        }
        porcentajeelefante1=cantidadelefante0/(cantidadtotalchimpance+cantidadtotalelefante+cantidadtotaljirafa);
        porcentajejirafa=cantidadtotaljirafa/(cantidadtotalchimpance+cantidadtotalelefante+cantidadtotaljirafa);
    }
}

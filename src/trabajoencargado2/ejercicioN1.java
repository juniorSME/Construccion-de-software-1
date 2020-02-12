/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado2;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class ejercicioN1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("--FRABRICA DE PANTALONES G&F----");
        System.out.println("ingrese el costo  de tela por metro:");
        int tela=sc.nextInt();
        int cantidad;
        double cantidada=0, cantidadb=0;
        System.out.println("ingrese la cantidad de pantalones a vender:");
        int pantalones=sc.nextInt();
        int i=1;
        double contador1=0,contador2=0;
        double total=0;
        double manodeobra;
        while(i<=pantalones){
            System.out.println("OPCION 1: MODELO A ");
            System.out.println("OPCION 2: MODELO B" );
            int opc = sc.nextInt();
            if (opc==1) {
                cantidada=tela*0.80;
                manodeobra=tela+cantidada;
                contador1+=manodeobra;
                System.out.println("el total a pagar por el pantalon es: "+manodeobra);
            }else if (opc==2){
                cantidadb=tela*0.95;
                manodeobra=tela+cantidadb;
                contador2+=manodeobra;
                System.out.println("el total a pagar por el pantalon es: "+manodeobra);
            }else {
                System.out.println("ingrese otra opcion:");
                i--;
            }
            i++;
        }
        total=contador1+contador2;
        System.out.println("en total se logro vender: "+total);
    }
}

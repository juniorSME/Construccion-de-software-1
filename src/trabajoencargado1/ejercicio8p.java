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
public class ejercicio8p {
    // Al cerrar un expendio de naranjas, 15 clientes que aun no han pagado recibirán un 15% de descuento 
    //si compran mas de 10 kilos. Determinar cuanto pagara cada cliente y cuanto percibirá la tienda por esas compras. 
    public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);
        int i=1;
        int cantidad;
        double descuento;
        double costo=0;
        double total=0;
        while (i<=15){
            System.out.println("ingrese cuantos kilos de naranjas esta llevando la persona : "+i );
            cantidad=sc.nextInt();
            //suponiendo que el kilo  de naranja esta $ 5
            if (cantidad>=10) {
                descuento = cantidad*0.15;
                costo = (cantidad*5)+descuento;
                System.out.println("usted tiene un descuento del 15%  que equivale a: "+descuento+" en  total  a pagar es: "+costo);
                total+=costo;
            }
            i++;
            
        }
        
        System.out.println("en  total la tienda percibira un total  de: "+total+ " soles");
    }
}

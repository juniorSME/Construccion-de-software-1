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
public class ejercicio13 {
    //En una tienda de descuento las personas que van a pagar el importe de su compra llegan a la caja y sacan una bolita de color, 
    //que les dirá que descuento tendrán sobre el total de su compra. Determinar la cantidad que pagara cada cliente desde que 
    //la tienda abre hasta que cierra. Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de descuento; 
    //si es amarilla un 25% y si es blanca no obtendrá descuento. 
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.println("MiniMarket Junior");
        int color;
        int i =1;
        float cantidad;
        float total;
        System.out.println("presione 1 para obtener una bolita");
        int opc  = sc.nextInt();
        while (i<=opc){
            color = (int) (Math.random()*3+1);
            System.out.println("ingrese la cantidad total  a pagar por los productos comprados: ");
            cantidad =sc.nextInt();
            if (color==1) {
                System.out.println("obutvo la bola de color rojo y se hace acreedor del 40% de descuento  de su  compra total");
                total=cantidad*40/100;
                total =cantidad-total;
                System.out.println("aplicando  el 40% de "+cantidad+ " en total  a pagar sera: "+total);
            }else if (color==2){
                System.out.println("obtuvo la bola de color amarillo y se hace acreedor del 25% de descuento  de su compra total");
                total=cantidad*25/100;
                total =cantidad-total;
                System.out.println("aplicando  el 25% de "+cantidad+ " en total  a pagar sera: "+total);
            }else {
                System.out.println("obtuvo la bola de color blanco, no fue acreedor de ningun descuento");
                System.out.println("por lo tanto a pagar sera :  "+ cantidad);
            }
            i++;
        }
        
        
    }
}

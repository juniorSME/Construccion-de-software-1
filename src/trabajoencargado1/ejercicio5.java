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
public class ejercicio5 {
    // Los surtidores de una gasolinera registran las ventas por galones, pero el precio de la gasolina está fijada en litros. 
    //El programa debe calcular lo que los clientes deben pagar y el total recaudado por la gasolinera, tomando en cuenta lo siguiente: 
    //• Cada galón tiene 3,785 litros 
    //• El precio del litro es para el Tipo A 50 Soles, para el Tipo B 55 Soles y para el Tipo C 60 Soles. 
    //• El programa finaliza cuando se introduce una D como tipo de gasolina. 
    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);
        System.out.println("---GRIFO LUCHITO----");
        int a=0;
        String opc=" ";
        do{
            System.out.println("elija las siguientes opciones de venta de combustible");
            System.out.println("opcion A: Gasolina de tipo A");
            System.out.println("opcion B: Gasolina de tipo B");
            System.out.println("opcion C: Gasolina de tipo C");
        
            double total=0.0;
            double contador=0.0;
            int cantidad;
           
            opc = sc.next();
            if (opc.equals("A")||opc.equals("a")) {
                System.out.println("ingrese cuantos galones se desea vender");
                cantidad =sc.nextInt();
                total=((cantidad*3.785)*50);
                System.out.println("la cantidad en total  a pagar por "+cantidad+ " galones es: "+ total);
                contador+=total;
            } if (opc.equals("B")||opc.equals("b")) {
                System.out.println("ingrese cuantos galones se desea vender");
                cantidad = sc.nextInt();
                total=((cantidad*3.785)*55);
                System.out.println("la cantidad en total  a pagar por "+cantidad+ " galones es: "+ total);
                contador+=total;
            } if (opc.equals("C")||opc.equals("c")){
                System.out.println("ingrese cuantos galones se desea vender");
                cantidad = sc.nextInt();
                total=((cantidad*3.785)*60);
                System.out.println("la cantidad en total  a pagar por "+cantidad+ " galones es: "+ total);
                contador+=total;
            }
        }while (opc.equals("D"));
        System.out.println("muchas gracias por preferirnos vuelva pronto! :)");
    }
}

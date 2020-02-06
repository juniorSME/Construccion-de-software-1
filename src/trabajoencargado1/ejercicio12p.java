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
public class ejercicio12p {
   // Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la semana.
    //Su política de pagos es que un vendedor recibe un sueldo base, y un 10% extra por comisiones de sus ventas.
    //El gerente de su compañía desea saber cuanto dinero obtendrá en la semana cada vendedor por concepto 
    //de comisiones por las tres ventas realizadas, y cuanto tomando en cuenta su sueldo base y sus comisiones. 
    public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);
        System.out.println("ingrese la cantidad de vendedores");
        int asegurados = sc.nextInt();
//        System.out.println("ingrese el  sueldo  basico  de los vendedores: ");
//        int base =sc.nextInt();
        int dia;
        int ventadeldia=0;
        int salariobase=0;
        int salariototal=0;
        int porcentaje = 0;
        for (int i = 1; i <=asegurados; i++) {
            System.out.println("el vendedor: "+ i);
//            System.out.println("ingresa los dias que lavora el vendedor: "+i);
//            dia=sc.nextInt();
            for (int j = 1; j <=3; j++) {
                System.out.println("ingresa la venta total  del dia: "+j);
                ventadeldia=sc.nextInt();
                porcentaje=(int) (ventadeldia*0.1);
                System.out.println("el vendedor "+ i +" obtuvo "+porcentaje+" en el dia: "+j);
                //suponiendo que los vendedores tienen un salario base estable de 200 soles
                salariobase=200+porcentaje;
                salariototal=salariobase*3;
                
            }
            
            
            System.out.println("el vendedor "+ i + " debe de recibir "+ salariototal +" soles por haber laborado "+ 3+" dias");
        }
    }
}

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
public class ejercicio8_2_1 {
    //8.2.	Un teatro otorga descuentos según la edad del cliente. Determinar la cantidad de dinero que el teatro deja de percibir por cada una de las categorías. 
    //Tomar en cuenta que los niños menores de 5 años no pueden entrar al teatro y que existe un precio único en los asientos. Los descuentos se hacen tomando en cuenta el siguiente cuadro: 
	 //	 	 	 	 	Edad 	 	 	Descuento 
	 //	 	Categoría 1 	 	  5 – 14  	 	   35 % 
	 //	 	Categoría 2 	 	15 - 19  	 	   25 % 
	 //	 	Categoría 3 	 	20 - 45  	 	   10 % 
	 //	 	Categoría 4 	 	46 - 65  	 	   25 % 
	 //	 	Categoría 5 	 	66 en adelante 	 	   35 % 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("---TEATRO EL CUCU---");
        System.out.println("ingrese el costo general");
        int costo=sc.nextInt();
        System.out.println("ingrese la cantidad de taburetes disponibles");
        int taburete=sc.nextInt();
        int persona=1;
        int edad;
        int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0;
        double total1=0,total2=0,total3=0,total4=0,total5=0;
        double descuento;
        double perdida;
        int ganancia;
        double sumatoria;
        while (persona<=taburete){
            System.out.println("ingrese la edad de la persona :"+persona);
            edad=sc.nextInt();
            if (edad<5) {
                System.out.println("solo esta permitido personas mayores de 5 años");
                persona--;
            }else if(edad>=5&&edad<=14){
                descuento=costo*35/100;
                total1=costo-descuento;
                contador1+=total1;
                System.out.println("la persona debera de pagar en total: "+total1);
            }else if (edad>=15&&edad<=19){
                descuento=costo*0.25;
                total2=costo-descuento;
                contador2+=total2;
                System.out.println("la persona debera de pagar un total de: "+total2);
            }else if (edad>=20&&edad<=45){
                descuento=costo*0.1;
                total3=costo-descuento;
                contador3+=total3;
                System.out.println("la persona debe de pagar un monto total de: "+total3);
            }else if (edad>=46&&edad<=65){
                descuento=costo*0.25;
                total4=costo-descuento;
                contador4+=total4;
                System.out.println("la persona debe de pagar un importe total de: "+total4);
            }else if (edad>=66){
                descuento=costo*0.35;
                total5=costo-descuento;
                contador5+=total5;
                System.out.println("la persona debe de pagar un total de ::"+total5);
            }
            persona++;
        }
        
        ganancia=costo*taburete;
        sumatoria=total1+total2+total3+total4+total5;
        perdida =ganancia-sumatoria;
        System.out.println("el teatro percibio un total de:"+sumatoria);
        System.out.println("el teatro perdioo un total de: "+perdida);
        System.out.println("el teatro deberia de haber ganado un total  de: "+ganancia);
    }
}

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
public class ejercicio33 {

    // Un negocio de copias tiene un limite de producción diaria de 10 000 copias si el tipo de impresión 
    //es offset y de 50 000 si el tipo es estándar. Si hay una solicitud de un el empleado tiene que verificar
    //que las copias pendientes hasta el momento y las copias solicitadas no excedan del limite de producción. 
    //Si el limite de producción se excediera el trabajo solicitado no podría ser aceptado. El empleado necesita 
    //llevar un buen control de las copias solicitadas hasta el momento para decidir en forma rápida si los trabajos
    //que se soliciten en el día se deben aceptar o no. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("FOTOCOPIAS  PEPE");
        int opc;
        int op;
        int opcio;
        int cantidadoffset, cantidadstandar;
        int contadoroffset = 0, contadorestandar = 0;
        System.out.println("presione 1 para ingresar al  programa");
        opc = sc.nextInt();
        while (opc==1){
            System.out.println("seleccione una de las siguientes opciones");
            System.out.println("opcion 1: realizar una impresion");
            System.out.println("opcion 2: listar la cantidad de ordenes realizadas");
            System.out.println("opcion 3: salir");
            op = sc.nextInt();
            if (op==3) {
                break;
            }
            switch (op) {
            case 1:
                    System.out.println("ingrese una de las siguientes opciones:");
                    System.out.println("opcion 1 : Impresion offset");
                    System.out.println("opcion 2 : Impresion estandar");
                    opcio = sc.nextInt();
                    switch (opcio) {
                        case 1:
                            System.out.println("ingrese la cantidad de copias a imprimir ");
                            cantidadoffset = sc.nextInt();
                            if (cantidadoffset <= 10000) {
                                contadoroffset += cantidadoffset;
                                System.out.println("su pedido fue registrado exitosamente");
                            } else {
                                System.out.println("su pedido no pudo ser procesado ya que exede la maxima cantidad de copias a sacar ");
                            }
                            break;
                        case 2:
                            System.out.println("ingrese la cantidad de copias a imprimir ");
                            cantidadstandar = sc.nextInt();
                            if (cantidadstandar <= 50000) {
                                contadoroffset += cantidadstandar;
                                System.out.println("su pedido fue registrado exitosamente");
                            } else {
                                System.out.println("su pedido no pudo ser procesado ya que se exede la maxima cantidad de copias a sacar");
                            }
                            break;
                    }
                    break;
            case 2:
                System.out.println("opcion 1: listar total  de pedidos realizados para imprimir offset");
                System.out.println("opcion 2: listar total  de pedidos realizados para imprimir estandart");
                int opci = sc.nextInt();
                    switch (opci) {
                        case 1:
                            System.out.println("el  total de pedidos en esta impresion offset es de :" + contadoroffset);
                            break;
                        case 2:
                            System.out.println("el total de pedidos en esta impresion  estandart es de " + contadorestandar);
                            break;
                        case 3:
                            break;
                    }
                    break;
            
            }   
        }
            
        }
    }


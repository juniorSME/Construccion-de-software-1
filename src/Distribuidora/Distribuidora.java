/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distribuidora;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 20162
 */

public class Distribuidora {
    private Producto pr;
    public static void menu (ArrayList<Producto> pr){
        Scanner sc = new Scanner (System.in);
        int opc;
        do {
            System.out.println("******* MINI MARKET ELLA Y YO*******");
            System.out.println("opcion 1: Registrar productos");
            System.out.println("opcion 2: vender productos");
            System.out.println("opcion 3: salir");
            opc=sc.nextInt();
            switch (opc){
                case 1:
                    productos(pr);
                    break;
                case 2:
                    menuprincipal(pr);
                    break;
                case 3:
                    System.out.println("gracias!! por preferirnos");
                    break;
                
                default:
                    System.out.println("error");
                    break;
            }
        }while (opc!=3);
    }
    public static void productos (ArrayList<Producto> pr){
        Scanner sc = new Scanner (System.in);
        String respuesta = "no";
        do {
            System.out.println("*****Menu de registrar productos*****");
            pr.add(new Producto());
            System.out.println("¿Desea agregar otro producto? (si/no)");
            respuesta=sc.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));
    }
    public static void menuprincipal(ArrayList<Producto> pr){
        Scanner sc = new Scanner (System.in);
        cliente cl = new cliente();
        persona per = new persona();
        int opc;
        int unidades=0;
        String respuesta;
        double factura=0;
        do {
            ////
            cl.llenar();
            System.out.println("*****Menu de venta de productos*****");
            System.out.println("");
            for (int i = 0; i < pr.size(); i++) {
                System.out.println("Puse: "+i+" para comprar: "+ pr.get(i).getNombre()+ " cuyo precio es de: "+pr.get(i).getCostounitario()+ " y el stock es de: "+pr.get(i).getCantidad()+" unidades");
            }
            opc=sc.nextInt();
            System.out.println("Ha elegido comprar: "+pr.get(opc).getNombre());
            for (int i = opc; i < pr.size(); i++) {
                unidades=unidades(pr);
                if (pr.get(i).verificarStock(unidades)==true) {
                    pr.get(i).modificarStock(unidades);
                    unidades = (int) (unidades*pr.get(i).getCostounitario());
                }
                break;
            }
            factura=factura+ unidades;
            System.out.println("¿Desea realizar otra compra? (si/no)");
            respuesta=sc.next();
        }while(respuesta.equalsIgnoreCase("si"));
        // agregar datos del cliente 
        //
        
        System.out.println("===================datos del cliente=========================== ");
        System.out.println(cl.ToString());
        System.out.print("producto llevado: "+ unidades);
        for (int i = 0; i < pr.size(); i++) {
            System.out.println(pr.get(i).getNombre());
        }
        System.out.println(" el total de su compra es: s/."+ factura);
        
    }
    public static int unidades (ArrayList<Producto> pr){
        Scanner sc = new Scanner (System.in);
        int unidades;
        System.out.println("¿Cuantas unidades va a llevar?");
        unidades=sc.nextInt();
        return unidades;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        ArrayList<Producto> pr = new ArrayList<>();
        menu(pr);
    }
}

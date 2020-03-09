/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distribuidora;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class Producto {
    Scanner sc = new Scanner (System.in);
    private int codigo;
    private String nombre;
    private double costounitario;
    private Proveedor probedor;
    private int cantidad;
    private cliente cl;
    Proveedor probe;
    public Producto (){
        provedor();
        ingresarnombre();
        stock();
        precio();
        
    }

    public Producto(int codigo, String nombre, double costounitario,int cantidad, Proveedor probedor) {
        probedor = new Proveedor();
        this.codigo = codigo;
        this.nombre = nombre;
        this.costounitario = costounitario;
        this.probedor = probedor;
        this.cantidad=cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostounitario() {
        return costounitario;
    }

    public void setCostounitario(double costounitario) {
        this.costounitario = costounitario;
    }

    public Proveedor getProbedor() {
        return probedor;
    }
    
    public void setProbedor(Proveedor probedor) {
        this.probedor = probedor;
    }
    public int getCantidad (){
        return  cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad= cantidad;
    }
    public void provedor (){
        System.out.println("======PROVEEDOR=======");
        Proveedor pr = new Proveedor();
        pr.llenar();
    }
    public static int pedir (){
        Scanner sc = new Scanner (System.in);
        int can ;
        System.out.println("cuantos productos desea llevar ?");
        can = sc.nextInt();
        return can;
    }
    public void ingresarnombre(){
        System.out.println("--------PRODUCTO------");
        System.out.println("ingrese el nombre del producto: ");
        setNombre(sc.nextLine());
    }
    public void stock (){
        System.out.println("ingrese el stock de: "+getNombre()+ " : ");
        setCantidad(sc.nextInt());
    }
    public void precio (){
        System.out.println(" ingrese el precio de :"+getNombre()+" : ");
        setCostounitario(sc.nextDouble());
    }
    public void modificarStock(int stock){
        cantidad=cantidad-stock;
        System.out.println("venta realizada!!");
    }
    public boolean verificarStock(int stock){
        if (cantidad>=stock) {
            return true;
        }else {
            System.out.println("error!!. solo quedan: "+ cantidad + " unidades");
            return false;
        }
    }
    
//   
//    public String ToString(){
//        return "Codigo: "+getCodigo()+"\n producto: "+getNombre()+"\n costo por unidad: "+getCostounitario()+"\n";
//    }
}


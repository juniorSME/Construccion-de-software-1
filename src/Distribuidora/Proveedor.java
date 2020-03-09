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

public class Proveedor extends persona {
    Scanner sc = new Scanner (System.in);
    private int codigo;
    private String ruc;
    public Proveedor (){
        this.codigo=0;
        this.ruc="";
    }

    public Proveedor(int codigo, String ruc, int dni, String nombre, String apellido, String direccion, String nacimiento) {
        super(dni, nombre, apellido, direccion, nacimiento);
        this.codigo = codigo;
        this.ruc = ruc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

   public void llenar (){
            
           System.out.print("Codigo: ");
           setCodigo(sc.nextInt());
           System.out.print("RUC: ");
           setRuc(sc.next());
           System.out.print("Dni: ");
           super.setDni(sc.nextInt());
           System.out.print("Apellido: ");
           super.setApellido(sc.next());
           System.out.print("Nombre: ");
           super.setNombre(sc.next());
           System.out.print("Direccion: ");
           super.setDireccion(sc.nextLine());
           System.out.print("Fecha de nacimiento: ");
           super.setNacimiento(sc.next());
       
   }
    
    protected String ToString(){
        return super.ToString()+" Codigo de proveedor: "+getCodigo()+" \n RUC: "+getRuc()+"\n";
    }
}


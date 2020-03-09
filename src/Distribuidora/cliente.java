/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distribuidora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 20162
 */


public class cliente extends persona {
    List <String> per = new ArrayList<String>(); 
    Scanner sc = new Scanner (System.in);
    private int codigo;
    public cliente(){
        super();
        this.codigo=0;
    }

    public cliente(int codigo, int dni, String nombre, String apellido, String direccion, String nacimiento) {
        super(dni, nombre, apellido, direccion, nacimiento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void llenar (){
            System.out.println("==================== RELLENAR DATOS DEL CLIENTE =================");
            System.out.print("Codigo: ");
            setCodigo(sc.nextInt());
            System.out.print("DNI: ");
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
        return super.ToString()+" Codigo de cliente: "+getCodigo()+"\n";
    }
}


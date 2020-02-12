/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lechera;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class personaNatural extends persona{
    Scanner sc= new Scanner (System.in);
    private String dni;
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private producto p;
    private String pedido;
    public personaNatural() {
    }

    public personaNatural(String dni, String nombre, String apellidoMaterno, String apellidoPaterno, producto p, String pedido, String correo, String direccion, String telefono) {
        super(correo, direccion, telefono);
        this.dni = dni;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.p = p;
        this.pedido = pedido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
    public void llenar (){
        p= new producto();
        System.out.println("N° de pedido: ");
        setPedido(sc.next());
        System.out.println("ingrese el correo electronico  de la persona : ");
        super.setCorreoelectronico(sc.next());
        System.out.println("ingrese su direccion: ");
        super.setDireccion(sc.next());
        System.out.println("ingrese su numero  de telefono :");
        setTelefono(sc.next());
        System.out.println("ingrese su DNI");
        setDni(sc.next());
        System.out.println("ingrese su nombre");
        setNombre(sc.next());
        System.out.println("ingrese su apellido paterno: ");
        setApellidoPaterno(sc.next());
        System.out.println("ingrese su  apellido materno");
        setApellidoMaterno(sc.next());
        
    }
    @Override
    String mostrar (){
        return "DNI: "+this.dni+"\n Nombre:"+this.nombre+" \n Apellido Paterno: "+this.apellidoPaterno+" \n Apellido Materno: "+this.apellidoMaterno+"\n"+super.mostrar();
    }
}

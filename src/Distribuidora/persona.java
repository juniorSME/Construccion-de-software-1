/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Distribuidora;

/**
 *
 * @author 20162
 */
public class persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String nacimiento;
    public persona (){
        this.dni=0;
        this.nombre="";
        this.apellido="";
        this.direccion="";
        this.nacimiento="";
    }

    public persona(int dni, String nombre, String apellido, String direccion, String nacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
    }

    protected int getDni() {
        return dni;
    }

    protected void setDni(int dni) {
        this.dni = dni;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected String getDireccion() {
        return direccion;
    }

    protected void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    protected String getNacimiento() {
        return nacimiento;
    }

    protected void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    protected String ToString(){
        return "DNI: "+getDni()+" \n Nombre: "+getNombre()+"\n Apellido: "+getApellido()+"\n Direccion: "+getDireccion()+"\n Fecha de Nacimiento: "+getNacimiento()+"\n";
    }
}


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
public class persona {
    Scanner sc =  new Scanner (System.in);
    private String correoelectronico;
    private String direccion;
    private String telefono;
    public persona (){
        
    }
    public persona (String correo, String direccion, String telefono){
        this.correoelectronico=correo;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    String mostrar (){
        return "Correo: "+this.correoelectronico+"\n Direccion: "+ this.direccion+"\n Telefono "+ this.telefono;
    }
}

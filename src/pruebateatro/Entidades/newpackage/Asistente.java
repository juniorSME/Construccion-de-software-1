/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebateatro.Entidades.newpackage;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class Asistente extends Personateatro {
    Scanner sc = new Scanner (System.in);
    String telefonoAsistente;
    String direccionAsistente;
    
    public Asistente (){
        
    }
    public Asistente(String codigoPersona, String nombrePersona, String apellidoPersona, String correoPersona, String telefonoAsistente, String direccionAsistente) {
        super(codigoPersona, nombrePersona, apellidoPersona, correoPersona);
        this.telefonoAsistente=telefonoAsistente;
        this.direccionAsistente=direccionAsistente;
    }

    public String getTelefonoAsistente() {
        return telefonoAsistente;
    }

    public void setTelefonoAsistente(String telefonoAsistente) {
        this.telefonoAsistente = telefonoAsistente;
    }

    public String getDireccionAsistente() {
        return direccionAsistente;
    }

    public void setDireccionAsistente(String direccionAsistente) {
        this.direccionAsistente = direccionAsistente;
    }

    public String getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(String codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

  
    public  void llenarDatosAsistente (){
        System.out.println("ingrese el codigo del asistente:");
        setCodigoPersona(sc.next());
        System.out.println("ingrese el nombre del asistente: ");
        setNombrePersona(sc.next());
        System.out.println("ingrese el apellido paterno del asistente: ");
        setApellidoPersona(sc.next());
        System.out.println("ingrese el  correo electronico del asistente: ");
        setCorreoPersona(sc.next());
        System.out.println("ingrese el telefono  del  asistente:");
        setTelefonoAsistente(sc.next());
        System.out.println("ingrese la direccion del asistente:");
        setDireccionAsistente(sc.next());
        
    }
   
  
    
}

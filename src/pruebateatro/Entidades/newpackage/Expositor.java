/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebateatro.Entidades.newpackage;

/**
 *
 * @author cliwfshowardfigueroavaleriano
 */
public class Expositor extends Personateatro {
    
    public Expositor(String codigoPersona, String nombrePersona, String apellidoPersona, String correoPersona) {
        super(codigoPersona, nombrePersona, apellidoPersona, correoPersona);
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


    
   
}

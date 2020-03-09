/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4Practico;

/**
 *
 * @author 20162
 */
public class genero extends multimedia{
    private String nombregenero;
    public genero (){
        this.nombregenero=null;
    }

    public genero(String titulo, String autor,String nombregenero) {
        super(titulo,autor);
        this.nombregenero = nombregenero;
    }
    

    public String getNombregenero() {
        return nombregenero;
    }

    public void setNombregenero(String nombregenero) {
        this.nombregenero = nombregenero;
    }
    public void llenarg (){
        super.llenar();
        System.out.println("Genero: ");
        this.nombregenero=sc.next();
    }

    public String toStringg() {
        return super.toStringd()+"\n Genero=" + this.nombregenero ;
    }
    
}

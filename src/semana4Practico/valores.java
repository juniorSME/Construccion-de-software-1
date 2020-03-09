/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4Practico;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class valores extends formato{
    private double costo ; 
     public valores (){
         this.costo=0.0;
     }
     
     public Scanner sc(){
         Scanner sc = new Scanner (System.in);
         return sc;
     }
     
    public valores (String titulo, String autor, String genero, String formato,double costo){
        super(titulo,autor,genero,formato);
        this.costo=costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public void llenarv (){
        super.llenarf();
        System.out.println("costo: ");
        this.costo=sc.nextDouble();
    }
    public String mostrar() {
        return super.toStringf()+ "\ncosto=" + this.costo;
    }
    
}

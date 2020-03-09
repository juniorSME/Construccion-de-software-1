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
public class formato extends genero {
    private String format;
    public formato (){
        this.format=null;
    }
    public formato (String titulo, String autor, String genero,String fotm){
        super(titulo,autor,genero);
        this.format= fotm;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public void llenarf (){
        super.llenarg();
        System.out.println("Formato: ");
        this.format=sc.next();
    }
    public String toStringf() {
        return super.toStringg()+"\nformat=" + this.format;
    }
    
}

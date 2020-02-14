/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3_practica;

/**
 *
 * @author 20162
 */
//La clase Club debe tener como atributos 3 objetos 
//de la clase Socio. Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.
public class club {
    private socio_club socio1, socio2,socio3;
    public club(){
        socio1=new socio_club("Junior", 8);
        socio2=new socio_club("Naty", 5);
        socio3=new socio_club("Yolanda", 10);
    }
    
    public static void main(String[] args) {
        club cl =  new club();
        
    }
}

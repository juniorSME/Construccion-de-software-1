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
//Plantear una clase Club y otra clase Socio:
//La clase Socio debe tener los siguientes atributos privados: nombre y la antigüedad en el club (en años). 
//En el constructor pedir la carga del nombre y su antigüedad. La clase Club debe tener como atributos 3 objetos 
//de la clase Socio. Definir una responsabilidad para imprimir el nombre del socio con mayor antigüedad en el club.
public class socio_club {
    private String nombre;
    private int edadEnElClub;
    public socio_club(String nom, int edad){
        this.nombre=nom;
        this.edadEnElClub=edad;
    }
    public void imprimir (){
        System.out.println("el socio "+ this.nombre+ " tiene "+ this.edadEnElClub +" años en el club");
    }
}

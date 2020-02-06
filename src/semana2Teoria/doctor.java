/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2Teoria;

/**
 *
 * @author 20162
 */
public class doctor {
    private int id;
    private String nombe;
    public  doctor (int id, String nombre){
        this.id=id;
        this.nombe=nombre;
    }
    String ToString (){
        return "Id: "+ this.id+" \nNombre: "+this.nombe;
    }
}

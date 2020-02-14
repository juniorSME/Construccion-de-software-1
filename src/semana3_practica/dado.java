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
public class dado {
    private int valor;
    public void lanzar(){
        this.valor=(int)(Math.random()*6+1);
    }
    public void imprimir (){
        System.out.println("el valor del dado es: "+ this.valor);
    }
    public int retornar (){
        return this.valor;
    }
}

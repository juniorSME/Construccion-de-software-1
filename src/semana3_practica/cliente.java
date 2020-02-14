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
public class cliente {
    private String nombre;
    private int monto;
    public cliente (String nombre){
        this.nombre=nombre;
        monto=0;
    }
    public void depositar (int mon){
        this.monto =  this.monto +mon;
    }
    public void retirar (int mon){
        this.monto=this.monto-mon;
    }
    public int retornarMonto (){
        return this.monto;
    }
    public void imprimir (){
        System.out.println(this.nombre+" tiene depositado la suma de : "+ this.monto);
    }
}

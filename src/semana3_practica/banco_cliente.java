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
public class banco_cliente {
    private cliente cliente1,cliente2,cliente3;
    private banco_cliente (){
        cliente1= new cliente("junior");
        cliente2= new cliente ("jhoys");
        cliente3= new cliente ("lucio");
    }
    public void operar (){
        cliente1.depositar(100);
        cliente2.depositar(250);
        cliente3.depositar(270);
        cliente2.retirar(170);
    }
    public void depositosTotal(){
        int i= cliente1.retornarMonto()+cliente2.retornarMonto()+cliente3.retornarMonto();
        System.out.println("el total  de dinero  en el banco  es: "+ i);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }
    public static void main(String[] args) {
        banco_cliente banc =  new banco_cliente();
        banc.operar();
        banc.depositosTotal();
    }
}

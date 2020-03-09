/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3_practica;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
class atributo {
    Scanner sc=  new Scanner (System.in);
    private int numero;
    public atributo(){
        
    }
    public atributo( int numero) {

        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    void llenar (int cantidad){
        for (int i = 0; i < cantidad; i++) {
            this.numero=sc.nextInt();
        }
        System.out.println(this.numero);
    }
//    void mostrar (){
//        
//    }
}
public class figura {
    public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);
        atributo at=  new atributo();
        System.out.println("ingrese la cantidad de elementos a ingresar: ");
        int cantidad= sc.nextInt();
        at.llenar(cantidad);
    }
    
}

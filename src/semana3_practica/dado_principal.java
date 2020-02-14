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
public class dado_principal {

    private dado dado1, dado2, dado3;

    public dado_principal() {
        dado1 = new dado();
        dado2 = new dado();
        dado3 = new dado();
    }

    public void jugar() {
        dado1.lanzar();
        dado1.imprimir();
        dado2.lanzar();
        dado2.imprimir();
        dado3.lanzar();
        dado3.imprimir();
        if (dado1.retornar() == dado2.retornar() && dado2.retornar() == dado3.retornar()) {
            System.out.println("ganaste =)");
        } else {
            System.out.println("perdiste ;(");
        }
    }

    public static void main(String[] args) {
        dado_principal dad = new dado_principal();
        dad.jugar();
    }
}

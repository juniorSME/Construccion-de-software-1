/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3teorio;

import java.util.ArrayList;

/**
 *
 * @author 20162
 */
class persona {

    private int x, y;

    public persona(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

public class ejemplo02 {

    public static void main(String[] args) {
        ArrayList<persona> lista = new ArrayList<>();
        lista.add(new persona(5, 2));
    }
}
//juegos de dado
//banco
//propuesto
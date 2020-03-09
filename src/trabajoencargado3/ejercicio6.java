/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author 20162
 */
class palabra {

    String palabra;

    palabra(String p) {
        palabra = p;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

}

public class ejercicio6 {
    public static void main(String[] args) {
        ArrayList<palabra> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        lista.add(new palabra("Junior"));
        lista.add(new palabra("Yolanda"));
        lista.add(new palabra("Naty"));
        lista.add(new palabra("Neyva"));
        lista.add(new palabra("Thayli"));
        lista.add(new palabra("Karina"));
        lista.add(new palabra("Lucio"));
        lista.add(new palabra("Abner"));

        for (palabra e : lista) {
            System.out.println(e.getPalabra());
        }
        System.out.println(" mostrar lista de una determinada longitud");
        System.out.println("ingresar el indice:_ ");
        int x = sc.nextInt();
        for (int i = 0; i < lista.size() + i; i++) {
            if (x == -1) {
                break;
            }
            lista.remove(x--);
        }
        ///comparator = Una función de comparación, que impone un orden total en alguna colección de objetos.
        Collections.sort(lista, new Comparator<palabra>() {
            public int compare(palabra p1, palabra p2) {
                return p1.getPalabra().compareTo(p2.getPalabra());
            }
        });
        for (palabra e : lista) {
            System.out.println(e.getPalabra());
        }
    }
}
   
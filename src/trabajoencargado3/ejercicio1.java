/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 20162
 */
class Lista extends Exception {

    ArrayList<Integer> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public void Insertar(int e) {
        lista.add(e);
    }

    public void mostrar() {
        System.out.println("\n impresion por lista");
        Collections.sort(lista);
        System.out.println(lista);
    }

    public void mostrar_valores() {
        System.out.println("Valores Insertados:  ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("[" + lista.get(i) + "]  ");
        }
    }
}

class Pila extends Exception {

    ArrayList<Integer> lista_pila;

    public Pila() {
        lista_pila = new ArrayList<>();
    }

    public void Insertar(int e) {
        lista_pila.add(e);
    }

    public void mostrar() {
        System.out.println("\n impresion por pila");
        for (int i = 0; i < lista_pila.size(); i++) {
            System.out.println(lista_pila.get(i));
        }
    }

    public void mostrar_valores() {
        System.out.println("Valores Insertados:  ");
        for (int i = 0; i < lista_pila.size(); i++) {
            System.out.print("[" + lista_pila.get(i) + "]  ");
        }
    }
}

class Cola extends Exception {

    ArrayList<Integer> lista_cola;

    public Cola() {
        lista_cola = new ArrayList<>();
    }

    public void Insertar(int e) {
        lista_cola.add(e);
    }

    public void mostrar() {
        System.out.println("\n impresion por cola");
        for (int i = (lista_cola.size() - 1); i >= 0; i--) {
            System.out.println(lista_cola.get(i));
        }
    }

    public void mostrar_valores() {
        System.out.println("Valores Insertados:  ");
        for (int i = 0; i < lista_cola.size(); i++) {
            System.out.print("[" + lista_cola.get(i) + "]  ");
        }
    }
}

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("opcion 1: llenar en lista");
            System.out.println("opcion 2: llenar en pila");
            System.out.println("opcion 3: llenar en cola");
            System.out.println("opcion 4: salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                try {
                    Lista list = new Lista();
                    boolean valor = true;
                    while (valor) {
                        System.out.println("Ingresa 1 para insertar:  ");
                        System.out.println("Ingresa 2 para Finalizar:  ");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println("Ingresa un numero");
                                list.Insertar(sc.nextInt());
                                break;

                            case 2:
                                list.mostrar_valores();
                                list.mostrar();
                                valor = false;
                                break;
                            default:
                                System.out.println("opcion invalida");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error en la Clase Lista");
                }

                break;
                case 2:
                try {
                    Pila p = new Pila();
                    boolean valor1 = true;
                    while (valor1) {
                        System.out.println("Ingresa 1 para insertar:  ");
                        System.out.println("Ingresa 2 para Finalizar:  ");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println("Ingresa un numero");
                                p.Insertar(sc.nextInt());
                                break;
                            case 2:
                                p.mostrar_valores();
                                p.mostrar();
                                valor1 = false;
                                break;
                            default:
                                System.out.println("Opcion  ingresada incorrecta");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("hubo un error en pila");
                }
                break;
                case 3:
                try {
                    Cola c = new Cola();
                    boolean valor2 = true;
                    while (valor2) {
                        System.out.println("Ingresa 1 para insertar:  ");
                        System.out.println("Ingresa 2 para Finalizar:  ");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println("Ingresa el numero");
                                c.Insertar(sc.nextInt());
                                break;
                            case 2:
                                c.mostrar_valores();
                                c.mostrar();
                                valor2 = false;
                                break;
                            default:
                                System.out.println("Opcion incorrecta ");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("existio un error en la clase cola");
                }
                break;
                default:

            }
        } while (opc !=4);
    }

}

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
public class Alumno {

    Scanner sc = new Scanner(System.in);
    private String nombre;
    private int edad;

    public Alumno() {

    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void llenar() {
        System.out.println("ingrese el nombre: ");
        this.nombre = sc.next();
        System.out.println("ingrese su edad: ");
        this.edad = sc.nextInt();

    }

    public int verificar() {
        if (this.edad >= 18) {
            System.out.println(this.nombre + " es mayor de edad");
        } else {
            System.out.println(this.nombre + " es menor de edad");
        }
        return this.edad;
    }

    String mostrar() {
        System.out.println("Datos ");
        System.out.println("------------------------------------");

        return "nombre: " + this.nombre + " \n edad: " + this.edad;
    }

    public static void main(String[] args) {
        Alumno al = new Alumno();
        al.llenar();
        System.out.println(al.mostrar());
        al.verificar();
    }
}

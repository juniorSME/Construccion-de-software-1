/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3_practica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 20162
 *
 */
public class ejercicio01generic<p> implements Iterable<p> {

    ArrayList<p> result1 = new ArrayList<>();
    private int topeX;
    private int topeY;

    public ejercicio01generic(int x, int y) {
        super();
        this.topeX = x;
        this.topeY = y;
    }

    public void add(p obj) {
        if (result1.size() <= this.topeX) {
            if (result1.size() <= this.topeY) {
                result1.add(obj);
            } else {
                throw new RuntimeException("No hay espacio en Y");
            }
        } else {
            throw new RuntimeException("No hay mas espacio en X");
        }
    }

    @Override
    public Iterator<p> iterator() {
        return result1.iterator();
    }

    public static void main(String[] args) {

        ejercicio01generic<Float> op1 = new ejercicio01generic<>(5, 5);
        ejercicio01generic<Integer> op2 = new ejercicio01generic<>(4, 5);

        Suma s2 = new Suma(1, 5);
        Resta r2 = new Resta(1, 2);
        Producto p2 = new Producto(3, 6);

        Suma s1 = new Suma(0.78f, 89f);
        Resta r1 = new Resta(0.78f, 89f);
        Producto p1 = new Producto(8f, 5f);

        //agregando elementos a Integer
        op2.add(s2.getSuma());
        op2.add(r2.getResta());
        op2.add(p2.getProducto());

        //agregando elementos a FLoat
        op1.add(s1.getSumaFloat());
        op1.add(r1.getRestaFloat());
        op1.add(p1.getProductoFloat());

        System.out.println("OPERACION CON DATOS DE TIPO INTEGER");
        for (Integer integer : op2) {

            System.out.println("Operacion con Integer: " + integer.toString());
        }
        System.out.println("\n");
        System.out.println("OPERACION CON DATOS DE TIPO FLOAT");
        for (Float f : op1) {

            System.out.println("Operacion con FLoat: " + f.toString());
        }
    }
}

class Suma {

    private int num1, num2;
    private Float n1, n2;
    private int suma1;
    private Float suma2;

    public Suma(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        this.suma1 = this.num1 + this.num2;
    }

    public Suma(Float n1, Float n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.suma2 = this.n1 + this.n2;
    }

    public int getSuma() {
        return suma1;
    }

    public Float getSumaFloat() {
        return suma2;
    }
}

class Resta {

    private int num1, num2;
    private Float n1, n2;
    private int resta1;
    private Float resta2;

    public Resta(int nu1, int nu2) {
        this.num1 = nu1;
        this.num2 = nu2;
        this.resta1 = this.num1-this.num2;
    }

    public Resta(Float n1, Float n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.resta2 = this.n1 - this.n2;
    }

    public int getResta() {
        return resta1;
    }

    public Float getRestaFloat() {
        return resta2;
    }
}

class Producto {

    private int num1, num2;
    private Float n1, n2;
    private int producto1;
    private Float producto2;

    public Producto(int nu1, int nu2) {
        this.num1 = nu1;
        this.num2 = nu2;
        this.producto1 = this.num1 * this.num2;
    }

    public Producto(Float n1, Float n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.producto2 = this.n1 * this.n2;
    }

    public int getProducto() {
        return producto1;
    }

    public Float getProductoFloat() {
        return producto2;
    }
}

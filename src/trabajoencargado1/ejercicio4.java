/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado1;

import java.util.Scanner;

/**
 *
 * @author 20162
 */
public class ejercicio4 {
    //realizar la tabla de multiplicar de un numero n
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("ingrese el numero  de la tabla de multiplicar a generarse: ");
        int num = sc.nextInt();
        for (int i = 0; i <=12; i++) {
            System.out.println(num+"X"+i+"="+(i*num));
        }
    }
}

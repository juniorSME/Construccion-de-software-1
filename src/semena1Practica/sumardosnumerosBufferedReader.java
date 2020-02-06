/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semena1Practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 20162
 */
public class sumardosnumerosBufferedReader {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ingrese el primer numero a sumar");
        int num1, num2;
        //integer.parseint
        num1=Integer.parseInt(br.readLine());
        System.out.println("ingrese el segundo numero a sumar");
        num2=Integer.parseInt(br.readLine());
        int resultado= num1+num2;
        System.out.println("el resultado de la suma es: "+resultado);
    }
}

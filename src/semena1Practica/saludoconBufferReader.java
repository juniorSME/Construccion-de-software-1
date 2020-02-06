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
public class saludoconBufferReader {
    public static void main(String[] args)throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader (System.in));
        System.out.println("ingrese su nombre ");
        String nombre = br.readLine();
        System.out.println("hola "+ nombre +" que tenga un maravilloso dia ");
        
    }
}

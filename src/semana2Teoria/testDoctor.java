/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2Teoria;

import java.util.ArrayList;

/**
 *
 * @author 20162
 */
public class testDoctor {
    public static void main(String[] args) {
        ArrayList <doctor> doc=  new ArrayList<>();
        doc.add(new doctor(1,"lucho"));
        doc.add(new doctor(2, "Junior"));
        for (doctor dato:doc) {
            System.out.println(dato.ToString());
        }
    }
}

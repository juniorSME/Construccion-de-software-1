/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2Teoria;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 20162
 */
public class arraylistciclowhile {
    public static void main(String[] args) {
        ArrayList <String> familia = new ArrayList <>();
        
        familia.add("junior");
        familia.add("lucio");
        familia.add("yolanda");
        familia.add("karina");
        familia.add("jhassyel");
        familia.add("abner");
        familia.add("jhoys");
        Iterator it =  familia.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}

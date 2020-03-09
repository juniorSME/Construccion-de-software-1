/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.SecondaryLoop;
import javax.swing.JFrame;

/**
 *
 * @author 20162
 */
public class dosmarcos extends JFrame{
    public dosmarcos(){
        this.setTitle("Primer marco");
        setSize(350,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SecondFrame two =  new SecondFrame();
        setVisible(true);
        two.setVisible(true);
        
    }
    public static void main(String[] args) {
        dosmarcos ds =  new dosmarcos();
    }
}
class SecondFrame extends JFrame {
    public SecondFrame(){
        this.setTitle("segundo marco");
        setSize(150,80);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author 20162
 */
public class Areatexto extends JFrame{
    public Areatexto (){
        super("area texto");
        setSize(500, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextArea ar  =  new JTextArea(8,40);
        FlowLayout di =  new FlowLayout();
        setLayout(di);
        add(ar);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Areatexto ar =  new Areatexto();
        ar.setVisible(true);
        
    }
}

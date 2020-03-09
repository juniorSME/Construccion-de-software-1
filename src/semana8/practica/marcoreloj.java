/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author 20162
 */
public class marcoreloj extends JFrame{
    public marcoreloj(){
        this.setTitle("reloj");
        setSize(300,75);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        PanelReloj tiempo =  new PanelReloj();
        add(tiempo);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        marcoreloj mr = new marcoreloj();
    }
}

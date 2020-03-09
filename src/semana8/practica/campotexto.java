/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 20162
 */
public class campotexto extends JFrame {
    public campotexto(){
        this.setTitle("campo texto");
        setSize(400,80);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel etiqueta = new JLabel("Direccion página web: ", JLabel.RIGHT);
        JTextField direccion =  new JTextField("escribe aqui",30);
        FlowLayout fl =  new FlowLayout();
        setLayout(fl);
        add(etiqueta);
        add(direccion);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        campotexto cp =  new campotexto();
    }
}

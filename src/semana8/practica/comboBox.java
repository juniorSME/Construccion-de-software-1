/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author 20162
 */
public class comboBox extends JFrame{
    public comboBox(){
        this.setTitle("Combo box");
        setSize(345, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JComboBox curso  =  new JComboBox();
        FlowLayout fl = new FlowLayout();
        curso.setBounds(10, 10, 160, 20);
        curso.addItem("Seleccione una opcion");
        curso.addItem("Curso Java");
        curso.addItem("curso C++");
        curso.addItem("curso PHP");
        curso.addItem("cursp PHP");
        curso.addItem("Curso flash");
        curso.addItem("curso Java");
        setLayout(fl);
        add(curso);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        comboBox cb = new comboBox();
    }
}

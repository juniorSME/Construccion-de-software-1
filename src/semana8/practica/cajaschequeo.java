/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author 20162
 */
public class cajaschequeo extends JFrame {
    public cajaschequeo(){
        this.setTitle("Cajas chequeo");
        this.setSize(345, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        JCheckBox cursojava = new JCheckBox("Curso de Java", true);
        JCheckBox cursoflash =  new JCheckBox("curso Flash", true);
        JCheckBox cursophp  = new JCheckBox("curso PHP", false);
        JCheckBox cursoRuby = new JCheckBox("curso de Ruby", false);
        ButtonGroup cursos =  new ButtonGroup();
        FlowLayout dis = new FlowLayout();
        cursos.add(cursojava);
        cursos.add(cursoflash);
        cursos.add(cursophp);
        cursos.add(cursoRuby);
        setLayout(dis);
        add(cursojava);
        add(cursoflash);
        add(cursophp);
        add(cursoRuby);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        cajaschequeo c = new cajaschequeo();
        
    }
}

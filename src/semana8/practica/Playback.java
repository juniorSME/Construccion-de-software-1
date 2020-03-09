/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8.practica;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 20162
 */
public class Playback extends JFrame {
    public Playback(){
        this.setTitle("playback");
        setSize(225,80);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        FlowLayout dis  = new FlowLayout();
        setLayout(dis);
        JButton play = new JButton("Play");
        JButton stop = new JButton("stop");
        JButton pausa =  new JButton("pausa");
        add(play);
        add(stop);
        add(pausa);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        Playback pl = new Playback();
    }
}

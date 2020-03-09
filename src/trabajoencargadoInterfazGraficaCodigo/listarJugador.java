/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargadoInterfazGraficaCodigo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author 20162
 */
public class listarJugador extends JFrame implements ActionListener {

    JPanel panel;
    JLabel lbltitulo;
    JTextArea txtareajugador;
    JButton btnlistar;
    JButton btnvolver;
    public ArrayListJugador añadirjugador = new ArrayListJugador();

    public listarJugador() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Lista de Jugadores");
        this.setLocationRelativeTo(null);
        this.setSize(630, 380);
        init();
    }

    public void init() {
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);

        lbltitulo = new JLabel("Lista De jugadores");
        lbltitulo.setBounds(50, 20, 120, 20);
        panel.add(lbltitulo);

        txtareajugador = new JTextArea("");
        txtareajugador.setBounds(10, 50, 580, 250);
        panel.add(txtareajugador);
        txtareajugador.setEditable(false);

        btnlistar = new JButton("Listar");
        btnlistar.addActionListener(this);
        btnlistar.setBounds(50, 320, 80, 20);
        panel.add(btnlistar);

        btnvolver = new JButton("Volver");
        btnvolver.addActionListener(this);
        btnvolver.setBounds(140, 320, 80, 20);
        panel.add(btnvolver);
    }
    ArrayListJugador listajugador = new ArrayListJugador();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnlistar) {
            txtareajugador.setText("ID\tNombres\tNacionalidades\t\tSexo\n");
            for (jugador ju : añadirjugador.listajugador) {
                txtareajugador.append(ju.DatosDelJugador());
            }
        }
        if (e.getSource() == btnvolver) {
            añadirJugador aj = new añadirJugador();
            aj.setVisible(true);
            this.dispose();
        }
    }

//    public static void main(String[] args) {
//        listarJugador lj = new listarJugador();
//        lj.setVisible(true);
//
//    }
}

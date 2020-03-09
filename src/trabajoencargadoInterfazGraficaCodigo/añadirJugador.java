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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 20162
 */
public class añadirJugador extends JFrame implements ActionListener{
    JPanel panel;
    JLabel lbltitulo;
    JLabel lblId;
    JLabel lblnombre;
    JLabel lblnacionalidad;
    JLabel lblGenero;
    JTextField txtId;
    JTextField txtnombre;
    JTextField txtnacionalidad;
    JTextField txtgenero;
    JButton btnregistrar;
    JButton btnlistar;
    public listarJugador listajuga =  new listarJugador();
    public añadirJugador (){
        this.setLocationRelativeTo(null);
        this.setSize(350, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }
    public void init (){
        panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setLayout(null);
        
        lbltitulo = new JLabel("Registrar Jugador");
        lbltitulo.setBounds(50,20,200,20);
        panel.add(lbltitulo);
        
        lblId = new JLabel("ID:");
        lblId.setBounds(20,50,50,20);
        panel.add(lblId);
        
        txtId =  new JTextField("");
        txtId.setBounds(100, 50, 50, 20);
        panel.add(txtId);
        
        
        lblnombre =  new JLabel("Nombre: ");
        lblnombre.setBounds(20, 80, 80, 20);
        panel.add(lblnombre);
        
        txtnombre =  new JTextField("");
        txtnombre.setBounds(100,80,80,20);
        panel.add(txtnombre);
        
        lblnacionalidad = new JLabel("Nacionalidad: ");
        lblnacionalidad.setBounds(20,110,80,20);
        panel.add(lblnacionalidad);
        
        txtnacionalidad = new JTextField("");
        txtnacionalidad.setBounds(100, 110  ,80, 20);
        panel.add(txtnacionalidad);
        
        lblGenero = new JLabel("Genero");
        lblGenero.setBounds (20,140,80,20);
        panel.add(lblGenero);
        
        txtgenero  =  new JTextField("");
        txtgenero.setBounds(100, 140, 80, 20);
        panel.add(txtgenero);
        
        btnregistrar =  new JButton("Regitrar");
        btnregistrar.addActionListener(this);
        btnregistrar.setBounds(60, 200, 80, 20);
        panel.add(btnregistrar);
        
        btnlistar = new JButton("Listar");
        btnlistar.addActionListener(this);
        btnlistar.setBounds(180, 200, 80, 20);
        panel.add(btnlistar);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnregistrar) {
            String id = txtId.getText();
            String nombre = txtnombre.getText();
            String nacionalidad = txtnacionalidad.getText();
            String sexo = txtgenero.getText();
            listajuga.añadirjugador.AñadirJugador(new jugador(id, nombre, nacionalidad, sexo));
            JOptionPane.showMessageDialog(null, "jugador registrado exitosamente");
            limpiar();
            
        }
        if (e.getSource()==btnlistar) {
            listajuga.setVisible(true);
            this.dispose();
            
        }
    }
    public static void main(String[] args) {
        añadirJugador aj=  new añadirJugador();
        aj.setVisible(true);
    }
    public void limpiar (){
        txtId.setText("");
        txtnombre.setText("");
        txtnacionalidad.setText("");
        txtgenero.setText("");
        txtId.requestFocus();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoencargado4;

import java.util.ArrayList;

/**
 *
 * @author 20162
 */
public class ejercicio09 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio09
     */
    ArrayList<Integer> lista;
    int tope;
    public ejercicio09() {
        initComponents();
        lista  =  new ArrayList<>();
        tope=0;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("ejercicio 09");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtingresarnumero = new javax.swing.JTextField();
        btngrabar = new javax.swing.JButton();
        btnanalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaresultante = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtanalisis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingresar Numero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        getContentPane().add(txtingresarnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, -1));

        btngrabar.setText("GRABAR");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btngrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        btnanalizar.setText("ANALIZAR");
        btnanalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnanalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel2.setText("Vector Resultante");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        txtaresultante.setColumns(20);
        txtaresultante.setRows(5);
        jScrollPane1.setViewportView(txtaresultante);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 130, 160));

        jLabel3.setText("Analisi:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        getContentPane().add(txtanalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 210, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        // TODO add your handling code here:
        lista.clear();
        this.txtanalisis.setText("");
        tope = Integer.parseInt(this.txtingresarnumero.getText());
        llenado();
        this.txtaresultante.setText(cad());
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btnanalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanalizarActionPerformed
        // TODO add your handling code here:
        analisis();
    }//GEN-LAST:event_btnanalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ejercicio09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio09.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio09().setVisible(true);
            }
        });
    }
    private int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    public void restricLim(int num){
        if(lista.size()<=tope)
            lista.add(num);
    }
    
    public void llenado(){
        for(int i=0;i<tope;i++)
            restricLim(aleatorio(0, 10));        
    }
       
    
    public String cad(){
        String cad = "";
        for(Integer i: lista)
            cad+=i+"\n";
        return cad;
    }
    
    
    public boolean ordenado(){
        boolean ban = false;
        int menor = lista.get(0);
        for(int i=1;i<lista.size();i++){
            if(lista.get(i)>=menor){
                menor = lista.get(i);
                ban = true;
            }                
            else 
                return  false;
        }
        return ban;
    }
    
    public void analisis(){
        if(ordenado())
            this.txtanalisis.setText("SI");
        else
            this.txtanalisis.setText("NO");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanalizar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtanalisis;
    private javax.swing.JTextArea txtaresultante;
    private javax.swing.JTextField txtingresarnumero;
    // End of variables declaration//GEN-END:variables
}
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
public class ejercicio7 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio7
     */
    ArrayList<Integer> vecInicial;
    ArrayList<Integer> vecFinal;
    int tope;
    public ejercicio7() {
        initComponents();
        vecInicial = new ArrayList<>();
        vecFinal = new ArrayList<>();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
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
        txtingresarnum = new javax.swing.JTextField();
        btngrabar = new javax.swing.JButton();
        btnmostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareafinal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareainicial = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingresar un numero:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 29, -1, -1));
        getContentPane().add(txtingresarnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, -1));

        btngrabar.setText("GRABAR");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });
        getContentPane().add(btngrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btnmostrar.setText("MOSTRAR");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel2.setText("Vector inicial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setText("Vector Invertido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        txtareafinal.setColumns(20);
        txtareafinal.setRows(5);
        jScrollPane1.setViewportView(txtareafinal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, 130));

        txtareainicial.setColumns(20);
        txtareainicial.setRows(5);
        jScrollPane2.setViewportView(txtareainicial);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        // TODO add your handling code here:
        tope = Integer.parseInt(txtingresarnum.getText());
        llenar();
        this.txtareainicial.setText(cad());
        this.txtareainicial.setEditable(false);
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        // TODO add your handling code here:
        reinicia();
        this.txtareafinal.setText("");
        this.txtareafinal.setEditable(false);
        vectorInverso();
        this.txtareafinal.setText(cad2());
    }//GEN-LAST:event_btnmostrarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio7().setVisible(true);
            }
        });
    }
    public int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    private void condicion(int num){
        if(vecInicial.size()<=tope)
            vecInicial.add(num);
    }
    
    public void llenar(){
        for(int i=0;i<tope;i++){
            condicion(aleatorio(0, 30));            
        }            
    }
    
    public String cad(){
        String cad = "";
        for(Integer i: vecInicial)
            cad+=i+"\n";
        return cad;
    }
    
    public void vectorInverso(){
        int j=0;
        for(int i=vecInicial.size()-1;i>=0;i--){
            vecFinal.add(vecInicial.get(i));
            j++;
        }        
    }
    
    public String cad2(){
        String cad = "";
        for(Integer i: vecFinal)
            cad+=i+"\n";
        return cad;
    }
    
    public void reinicia(){
        vecFinal.clear();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtareafinal;
    private javax.swing.JTextArea txtareainicial;
    private javax.swing.JTextField txtingresarnum;
    // End of variables declaration//GEN-END:variables
}

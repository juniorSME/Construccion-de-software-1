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
public class ejercicio10 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio10
     */
    ArrayList<Integer> listaNum;
    int tope;
    public ejercicio10() {
        initComponents();
        listaNum = new ArrayList<>();
        tope=0;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("ejercicio 10");
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtingresarnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsumanegativa = new javax.swing.JTextField();
        txtcantidadpositivo = new javax.swing.JTextField();
        txtcantidadnegativa = new javax.swing.JTextField();
        txtcantidadcero = new javax.swing.JTextField();
        txtsumapositiva = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareanumero = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingresar numero");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 11, -1, -1));

        jButton1.setText("GRABAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jButton2.setText("MOSTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));
        getContentPane().add(txtingresarnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, -1));

        jLabel2.setText("Cantidad de N° positivos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Cantidad de N° negativos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setText("cantidad de N° ceros");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setText("Suma de N° positivos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel6.setText("Suma de N° negativos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));
        getContentPane().add(txtsumanegativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 100, -1));
        getContentPane().add(txtcantidadpositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, -1));
        getContentPane().add(txtcantidadnegativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, -1));
        getContentPane().add(txtcantidadcero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 100, -1));
        getContentPane().add(txtsumapositiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 100, -1));

        jLabel7.setText("Numeros");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        txtareanumero.setColumns(20);
        txtareanumero.setRows(5);
        jScrollPane1.setViewportView(txtareanumero);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 120, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listaNum.clear();
        tope =  Integer.parseInt(txtingresarnum.getText());
        llenado();
        txtingresarnum.setText("");
        txtingresarnum.requestFocus();
        this.txtareanumero.setText("");
        txtcantidadcero.setText("");
        txtcantidadnegativa.setText("");
        txtcantidadpositivo.setText("");
        txtsumanegativa.setText("");
        txtsumapositiva.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mostrar ();
        this.txtareanumero.setText(cad());
        txtareanumero.setEditable(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio10().setVisible(true);
            }
        });
    }
    private int aleatorio(int min, int max){
        return (int)((max-min+1)*Math.random()+min);
    }
    
    private void restricTam(int num){
        if(listaNum.size()<=tope)
            listaNum.add(num);
    }
    
    public void llenado(){
        for(int i=0;i<tope;i++)
            restricTam(aleatorio(-30, 30));        
    }
    
    public String cad(){
        String cad = "";
        for(Integer i: listaNum)
            cad+=i+"\n";
        return cad;
    }
    
    public int cantidadPositivos(){
        int cont=0;
        for(int i=0;i<listaNum.size();i++){
            if(listaNum.get(i)>=1)
                cont++;
        }            
        return cont;
    }
    
    public int cantidadNegativos(){
        int cont=0;
        for(int i=0;i<listaNum.size();i++){
            if(listaNum.get(i)<=-1)
                cont++;
        }            
        return cont;
    }
    
    public int cantidadCeros(){
        int cont=0;
        for(int i=0;i<listaNum.size();i++){
            if(listaNum.get(i)==0)
                cont++;
        }            
        return cont;
    }
    
    public int sumaPositivos(){
        int suma = 0;
        for(int i=0;i<listaNum.size();i++){
            if(listaNum.get(i)>0)
                suma+=listaNum.get(i);
        }            
        return suma;
    }
    
    public int sumaNegativos(){
        int suma = 0;
        for(int i=0;i<listaNum.size();i++){
            if(listaNum.get(i)<0)
                suma+=listaNum.get(i);
        }            
        return suma;
    }
    public void mostrar(){
        this.txtcantidadpositivo.setText(cantidadPositivos()+"");
        this.txtcantidadpositivo.setEditable(false);
        this.txtcantidadnegativa.setText(cantidadNegativos()+"");
        this.txtcantidadnegativa.setEditable(false);
        this.txtcantidadcero.setText(cantidadCeros()+"");
        this.txtcantidadcero.setEditable(false);
        this.txtsumapositiva.setText(sumaPositivos()+"");
        this.txtsumapositiva.setEditable(false);
        this.txtsumanegativa.setText(sumaNegativos()+"");
        this.txtsumanegativa.setEditable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtareanumero;
    private javax.swing.JTextField txtcantidadcero;
    private javax.swing.JTextField txtcantidadnegativa;
    private javax.swing.JTextField txtcantidadpositivo;
    private javax.swing.JTextField txtingresarnum;
    private javax.swing.JTextField txtsumanegativa;
    private javax.swing.JTextField txtsumapositiva;
    // End of variables declaration//GEN-END:variables
}

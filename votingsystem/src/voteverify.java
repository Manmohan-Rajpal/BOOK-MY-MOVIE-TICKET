/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author SMPS
 */
public class voteverify extends javax.swing.JFrame {
Connection cn= null;
Statement st= null;
ResultSet rs =null;
    /**
     * Creates new form voteverify
     */
String uid="";
    public voteverify(String s) {
        uid=s;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNoV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfVid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSEX = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("VOTEVERIFY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 180, 51);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nameofthevoter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 114, 30);
        getContentPane().add(tfNoV);
        tfNoV.setBounds(206, 74, 121, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 27, 30);
        getContentPane().add(tfAge);
        tfAge.setBounds(210, 120, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("VOterid");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(32, 162, 53, 40);
        getContentPane().add(tfVid);
        tfVid.setBounds(200, 170, 111, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("sex");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(22, 205, 23, 30);
        getContentPane().add(tfSEX);
        tfSEX.setBounds(200, 210, 84, 20);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(128, 257, 55, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
         Class.forName("java.sql.Driver");
         cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","1234");
         st = cn.createStatement();
         String query= "SELECT * FROM votverify WHERE Nameofthevoter='" + tfNoV.getText()+"'&& age=" + Integer.parseInt(tfAge.getText())+" && SEX='" + tfSEX.getText()+"'&& voterID=" + Integer.parseInt(tfVid.getText())+";" ;
         rs = st.executeQuery(query);
         if(rs.next())
         { 
         vote vt =new vote(uid);
         vt.setVisible(true);
         }        
           }
         catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
                         }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(voteverify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(voteverify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(voteverify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(voteverify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new voteverify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfNoV;
    private javax.swing.JTextField tfSEX;
    private javax.swing.JTextField tfVid;
    // End of variables declaration//GEN-END:variables
}
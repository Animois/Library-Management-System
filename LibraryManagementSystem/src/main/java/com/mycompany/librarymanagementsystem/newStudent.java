

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;
import java.sql.*;
import Project.ConnectionProvider;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Shrayas Chakma
 */
public class newStudent extends javax.swing.JFrame {

    static Object studentID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form newStudent
     */
    public newStudent() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(770, 446));
        setPreferredSize(new java.awt.Dimension(790, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 75, -1));

        jLabel2.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 168, 75, -1));

        jLabel3.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel3.setText("Department");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jLabel4.setText("Series");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 277, 75, -1));

        jTextField1.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 106, 247, -1));

        jTextField2.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 247, -1));

        jComboBox1.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "EEE", "CE", "ME", "ETE", "MTE", "IPE", "CFPE", "MSE", "Arch", "URP", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 247, -1));

        jComboBox2.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "22", "21", "20", "19", "18", "Other" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 274, 247, -1));

        jButton1.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 335, -1, -1));

        jButton2.setFont(new java.awt.Font("Pristina", 1, 18)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 335, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Shrayas Chakma\\Downloads\\pexels-element-digital-1370295.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
String studentID = jTextField1.getText();
String name = jTextField2.getText();
String department = Objects.toString(jComboBox1.getSelectedItem(), "");
String series = Objects.toString(jComboBox2.getSelectedItem(), "");

// Concatenate the information with line breaks
String message = "Student ID: " + studentID + "\nName: " + name + "\nDepartment: " + department + "\nSeries: " + series;

// Display the information in a JOptionPane
JOptionPane.showMessageDialog(this, message, "Student Information", JOptionPane.INFORMATION_MESSAGE);
setVisible(false);
new home().setVisible(true);
//  if(jTextField1.getText().equals("")){
//            JOptionPane.showMessageDialog(null, "Please Enter Your ID");
//        }
//        else if(jTextField2.getText().equals("")){
//             JOptionPane.showMessageDialog(null, "Please Enter Your Name");
//        }
//       else if (
//    jTextField1.getText().equals("2110061") &&
//    jTextField2.getText().equals("Shrayas") &&
//    jComboBox1.getSelectedItem().equals("ECE") &&
//    jComboBox2.getSelectedItem().equals("21")
//) {
//    JOptionPane.showMessageDialog(null, "Succesfully Save");
//           setVisible(false);
//    new home().setVisible(true);
//}
//
//        else{
//            JOptionPane.showMessageDialog(null,"Please provide the correct data!!!","Message",JOptionPane.ERROR_MESSAGE);
//        }
// String id = jTextField1.getText();
//    String name = jTextField2.getText();
//    String selectedDepartment = (String) jComboBox1.getSelectedItem();
//    String selectedBatch = (String) jComboBox2.getSelectedItem();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //System.exit(0);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

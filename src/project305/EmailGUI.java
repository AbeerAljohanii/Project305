/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ra52m
 */
public class EmailGUI extends javax.swing.JFrame {

    public EmailGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Email_jTextField1 = new javax.swing.JTextField();
        Back_jButton1 = new javax.swing.JButton();
        email_jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(520, 924));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Email_jTextField1.setBorder(null);
        Email_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(Email_jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 250, 30));

        Back_jButton1.setContentAreaFilled(false);
        jPanel1.add(Back_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 50, 40));

        email_jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        email_jButton1.setText("Next");
        email_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(email_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Email.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Email_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_jTextField1ActionPerformed
    }//GEN-LAST:event_Email_jTextField1ActionPerformed

    private void email_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_jButton1ActionPerformed
        String email = Email_jTextField1.getText();
        DataBase database = new DataBase();
        ResetPasswordGUI reset = new ResetPasswordGUI();
        Verification verificationCode = new Verification();
        Runnable waitInput = () -> {
            try {
                if (database.checkEmail(email)) {
                    reset.email(email);
                    verificationCode.verification(email);
                    VerificationGUI verification = new VerificationGUI();
                    verification.show(true);
                    this.show(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Email does not exists");
                }
                Thread.sleep(20000); // wait for 60 seconds
                if (evt.getSource() != (VerificationGUI.Verification_jButton1)) {
                    LoginGUI login = new LoginGUI();
                    this.show(false);
                    login.show(true);
                }
            } catch (SQLException | InterruptedException ex) {
            }
        };
        Thread thread = new Thread(waitInput);
        thread.start();

    }//GEN-LAST:event_email_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_jButton1;
    private javax.swing.JTextField Email_jTextField1;
    private javax.swing.JButton email_jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

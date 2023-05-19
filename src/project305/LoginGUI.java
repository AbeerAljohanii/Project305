/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserName_jTextField1 = new javax.swing.JTextField();
        Login_jButton1 = new javax.swing.JButton();
        Signup = new javax.swing.JButton();
        Forget_jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 924));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName_jTextField1.setBorder(null);
        UserName_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(UserName_jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 250, 40));

        Login_jButton1.setBackground(new java.awt.Color(255, 255, 255));
        Login_jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Login_jButton1.setText("Login");
        Login_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Login_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 670, 140, 40));

        Signup.setBackground(new java.awt.Color(255, 255, 255));
        Signup.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        Signup.setText("Signup");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel1.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 725, -1, -1));

        Forget_jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Forget_jButton1.setText("Forget Password ?");
        Forget_jButton1.setContentAreaFilled(false);
        Forget_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Forget_jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Forget_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 230, 30));

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Login.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 520, 940));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserName_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName_jTextField1ActionPerformed

    private void Login_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_jButton1ActionPerformed
        String name = UserName_jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        loginClass login = new loginClass();
        boolean flag = false;
        try {
            flag = login.isValid(name, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*if the username and password correct 
            show the home frame and close this one */
        if (flag) {
            HomeGUI homePage = new HomeGUI();
            this.show(false);
            homePage.show(true);
        }
    }//GEN-LAST:event_Login_jButton1ActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        SignupGUI signupPage = new SignupGUI();
        this.show(false);
        signupPage.show(true);

    }//GEN-LAST:event_SignupActionPerformed

    private void Forget_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Forget_jButton1ActionPerformed
        EmailGUI Email = new EmailGUI();
        Email.show(true);
        this.show(false);
    }//GEN-LAST:event_Forget_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Forget_jButton1;
    private javax.swing.JButton Login_jButton1;
    private javax.swing.JButton Signup;
    private javax.swing.JTextField UserName_jTextField1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}

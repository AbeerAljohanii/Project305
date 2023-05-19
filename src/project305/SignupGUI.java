package project305;

import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;

public class SignupGUI extends javax.swing.JFrame {

    /**
     * Creates new form SignGUI
     */
    public SignupGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        UserName_jTextField1 = new javax.swing.JTextField();
        FirstName_jTextField2 = new javax.swing.JTextField();
        LName_jTextField3 = new javax.swing.JTextField();
        Email_jTextField4 = new javax.swing.JTextField();
        PhoneNumber_jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        ConfirmjPasswordField2 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        Signup = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(520, 924));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 924));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName_jTextField1.setBorder(null);
        UserName_jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(UserName_jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 270, 30));

        FirstName_jTextField2.setBorder(null);
        FirstName_jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(FirstName_jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 280, 30));

        LName_jTextField3.setBorder(null);
        LName_jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LName_jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(LName_jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 280, 40));

        Email_jTextField4.setBorder(null);
        Email_jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(Email_jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 280, 30));

        PhoneNumber_jTextField5.setBorder(null);
        PhoneNumber_jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumber_jTextField5ActionPerformed(evt);
            }
        });
        PhoneNumber_jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNumber_jTextField5KeyPressed(evt);
            }
        });
        jPanel1.add(PhoneNumber_jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 280, 30));

        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 270, 30));

        ConfirmjPasswordField2.setBorder(null);
        jPanel1.add(ConfirmjPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 270, 30));

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 743, -1, 20));

        Signup.setBackground(new java.awt.Color(255, 255, 255));
        Signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Signup.setText("Signup");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel1.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 770, 110, 30));

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 810, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Signup.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 920));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LName_jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LName_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LName_jTextField3ActionPerformed

    private void FirstName_jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_jTextField2ActionPerformed

    private void Email_jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_jTextField4ActionPerformed

    private void UserName_jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName_jTextField1ActionPerformed

    private void PhoneNumber_jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumber_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumber_jTextField5ActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        boolean flag = false;
        String Username = UserName_jTextField1.getText();
        String Fname = FirstName_jTextField2.getText();
        String Lname = LName_jTextField3.getText();
        String password = new String(jPasswordField1.getPassword());
        String passwordConf = new String(ConfirmjPasswordField2.getPassword());
        String Email = Email_jTextField4.getText();
        String Phone = PhoneNumber_jTextField5.getText();
        SignUp signupOb = new SignUp();
        try {
            flag = signupOb.isValid(Username, Fname, Lname, Email, Phone, password, passwordConf);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        if (flag) {
            //open home page and close this page 
            HomeGUI homePage = new HomeGUI();
            this.show(false);
            homePage.show(true);
        }

    }//GEN-LAST:event_SignupActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        LoginGUI loginPage = new LoginGUI();
        this.show(false);
        loginPage.show(true);
    }//GEN-LAST:event_LoginActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
            ConfirmjPasswordField2.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
            ConfirmjPasswordField2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void PhoneNumber_jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumber_jTextField5KeyPressed
        String phone = PhoneNumber_jTextField5.getText();
        int length = phone.length();
        char c = evt.getKeyChar();
        // check for number 0 to 9
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            // check for length not more than 10 digits
            if (length < 10) {
                PhoneNumber_jTextField5.setEditable(true);
            } else {
                PhoneNumber_jTextField5.setEditable(false);
            }
        } else {
            // not allow for keys "back space" and "delete" for edit
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                // allow editable 
                PhoneNumber_jTextField5.setEditable(true);
            } else {
                PhoneNumber_jTextField5.setEditable(false);
                getToolkit().beep();
            }
        }

    }//GEN-LAST:event_PhoneNumber_jTextField5KeyPressed

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
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmjPasswordField2;
    private javax.swing.JTextField Email_jTextField4;
    private javax.swing.JTextField FirstName_jTextField2;
    private javax.swing.JTextField LName_jTextField3;
    private javax.swing.JButton Login;
    private javax.swing.JTextField PhoneNumber_jTextField5;
    private javax.swing.JButton Signup;
    private javax.swing.JTextField UserName_jTextField1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}

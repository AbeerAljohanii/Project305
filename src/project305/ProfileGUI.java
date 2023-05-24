/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

/**
 *
 * @author ra52m
 */
public class ProfileGUI extends javax.swing.JFrame {

    public ProfileGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SignOut_jButton1 = new javax.swing.JButton();
        Back_jButton1 = new javax.swing.JButton();
        ProfileName = new javax.swing.JLabel();
        ProfileEmail = new javax.swing.JLabel();
        NumberOfCurrentRead = new javax.swing.JLabel();
        NumberOfWantRead = new javax.swing.JLabel();
        NumberOfRead = new javax.swing.JLabel();
        Logout_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(520, 924));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignOut_jButton1.setContentAreaFilled(false);
        SignOut_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOut_jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(SignOut_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 613, 30, 30));

        Back_jButton1.setContentAreaFilled(false);
        Back_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Back_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 123, 40, 30));

        ProfileName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ProfileName.setText("jLabel2");
        jPanel1.add(ProfileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 170, 20));
        ProfileName.getAccessibleContext().setAccessibleName("ProfileName");

        ProfileEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ProfileEmail.setText("jLabel2");
        jPanel1.add(ProfileEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 200, 20));

        NumberOfCurrentRead.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NumberOfCurrentRead.setText("jLabel2");
        jPanel1.add(NumberOfCurrentRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 50, -1));

        NumberOfWantRead.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NumberOfWantRead.setText("jLabel2");
        jPanel1.add(NumberOfWantRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        NumberOfRead.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NumberOfRead.setText("jLabel2");
        jPanel1.add(NumberOfRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 557, 50, 20));

        Logout_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Logout_label.setText("Log out");
        jPanel1.add(Logout_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Profile.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void Back_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_jButton1ActionPerformed

        HomeGUI home = new HomeGUI();
        home.show(true);
        this.show(false);

    }//GEN-LAST:event_Back_jButton1ActionPerformed

    private void SignOut_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOut_jButton1ActionPerformed

        LoginGUI login = new LoginGUI();
        login.show(true);
        this.show(false);

    }//GEN-LAST:event_SignOut_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_jButton1;
    private javax.swing.JLabel Logout_label;
    public static javax.swing.JLabel NumberOfCurrentRead;
    public static javax.swing.JLabel NumberOfRead;
    public static javax.swing.JLabel NumberOfWantRead;
    public static javax.swing.JLabel ProfileEmail;
    public static javax.swing.JLabel ProfileName;
    private javax.swing.JButton SignOut_jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

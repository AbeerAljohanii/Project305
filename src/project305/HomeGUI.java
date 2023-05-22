/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

import java.util.StringTokenizer;

/**
 *
 * @author ra52m
 */
public class HomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form HomeGUI
     */
    public HomeGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Read = new javax.swing.JButton();
        CurrentlyReading = new javax.swing.JButton();
        WantToRead = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        Books_jButton2 = new javax.swing.JButton();
        Community_jButton1 = new javax.swing.JButton();
        Profile_jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(520, 924));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Read.setBackground(new java.awt.Color(255, 255, 255));
        Read.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Read.setText("Read");
        Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadActionPerformed(evt);
            }
        });
        jPanel1.add(Read, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 220, 40));

        CurrentlyReading.setBackground(new java.awt.Color(255, 255, 255));
        CurrentlyReading.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CurrentlyReading.setText("Currently Reading");
        CurrentlyReading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentlyReadingActionPerformed(evt);
            }
        });
        jPanel1.add(CurrentlyReading, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 220, 40));

        WantToRead.setBackground(new java.awt.Color(255, 255, 255));
        WantToRead.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        WantToRead.setText("Want To Read");
        WantToRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WantToReadActionPerformed(evt);
            }
        });
        jPanel1.add(WantToRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 220, 40));

        jToolBar1.setBackground(new java.awt.Color(255, 204, 204));
        jToolBar1.setRollover(true);

        Books_jButton2.setBackground(new java.awt.Color(255, 255, 255));
        Books_jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Books_jButton2.setText("Books");
        Books_jButton2.setFocusable(false);
        Books_jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Books_jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Books_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Books_jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(Books_jButton2);

        Community_jButton1.setBackground(new java.awt.Color(255, 255, 255));
        Community_jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Community_jButton1.setText("Community");
        Community_jButton1.setFocusable(false);
        Community_jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Community_jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Community_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Community_jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(Community_jButton1);

        Profile_jButton1.setBackground(new java.awt.Color(255, 255, 255));
        Profile_jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Profile_jButton1.setText("Profile");
        Profile_jButton1.setToolTipText("");
        Profile_jButton1.setFocusable(false);
        Profile_jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Profile_jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Profile_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Profile_jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(Profile_jButton1);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Home.png"))); // NOI18N
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

    private void CurrentlyReadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentlyReadingActionPerformed
        CurrentReadGUI CurrentRead = new CurrentReadGUI();
        CurrentRead.show(true);
        this.show(false);

    }//GEN-LAST:event_CurrentlyReadingActionPerformed

    private void WantToReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WantToReadActionPerformed
        WantToReadGUI WantToRead = new WantToReadGUI();
        WantToRead.show(true);
        this.show(false);

    }//GEN-LAST:event_WantToReadActionPerformed

    private void ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadActionPerformed
        ReadGUI Read = new ReadGUI();
        Read.show(true);
        this.show(false);

    }//GEN-LAST:event_ReadActionPerformed

    private void Profile_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Profile_jButton1ActionPerformed
        ProfileGUI profile = new ProfileGUI();
        DataBase db = new DataBase();
        StringTokenizer tokenizer;
        try {
            tokenizer = new StringTokenizer(db.ProfileInfo(LoginGUI.name));

            profile.ProfileName.setText(tokenizer.nextToken());
            profile.ProfileEmail.setText(tokenizer.nextToken());
            profile.NumberOfCurrentRead.setText(tokenizer.nextToken());
            profile.NumberOfWantRead.setText(tokenizer.nextToken());
            profile.NumberOfRead.setText(tokenizer.nextToken());
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
       }
        profile.show(true);
        this.show(false);
    }//GEN-LAST:event_Profile_jButton1ActionPerformed

    private void Books_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Books_jButton2ActionPerformed
        BooksGUI books = new BooksGUI();
        books.show(true);
        this.show(false);

    }//GEN-LAST:event_Books_jButton2ActionPerformed

    private void Community_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Community_jButton1ActionPerformed
        CommunityGUI Community = new CommunityGUI();
        Community.show(true);
        this.show(false);
    }//GEN-LAST:event_Community_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Books_jButton2;
    private javax.swing.JButton Community_jButton1;
    private static javax.swing.JButton CurrentlyReading;
    private javax.swing.JButton Profile_jButton1;
    private javax.swing.JButton Read;
    private javax.swing.JButton WantToRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

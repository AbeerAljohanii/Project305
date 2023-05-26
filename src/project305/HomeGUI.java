/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;

public class HomeGUI extends javax.swing.JFrame {

    DataBase database = new DataBase();

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
        BooksMenu = new javax.swing.JButton();
        CommunityMenu = new javax.swing.JButton();
        ProfileMenu = new javax.swing.JButton();
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

        BooksMenu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BooksMenu.setText("Books");
        BooksMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BooksMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        CommunityMenu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CommunityMenu.setText("Community");
        CommunityMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityMenuActionPerformed(evt);
            }
        });
        jPanel1.add(CommunityMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        ProfileMenu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ProfileMenu.setText("Profile");
        ProfileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileMenuActionPerformed(evt);
            }
        });
        jPanel1.add(ProfileMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

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
        try {
            ResultSet rs = database.PrintUser_Books("CurrentlyReading");
            if (CurrentReadGUI.BooksTable.getModel().getRowCount() == 0) {
                while (rs.next()) {
                    String title = rs.getString("title");
                    String author = rs.getString("authorName");
                    String publishDate = rs.getString("publishDate");

                    String inputString = publishDate;
                    String wordToRemove = "published";
                    String remainingString = inputString.replace(wordToRemove, "");

                    String BookTable[] = {title, author, remainingString};
                    CurrentReadGUI.BooksTable.getColumnModel().getColumn(0).setPreferredWidth(180);
                    CurrentReadGUI.BooksTable.getColumnModel().getColumn(1).setPreferredWidth(100);

                    DefaultTableModel models = (DefaultTableModel) CurrentReadGUI.BooksTable.getModel();
                    models.addRow(BookTable);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
        CurrentRead.show(true);
        this.show(false);
    }//GEN-LAST:event_CurrentlyReadingActionPerformed

    private void WantToReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WantToReadActionPerformed
        WantToReadGUI WantToRead = new WantToReadGUI();
        try {
            ResultSet rs = database.PrintUser_Books("WantToRead");
            if (WantToReadGUI.BooksTable.getModel().getRowCount() == 0) {
                while (rs.next()) {
                    String title = rs.getString("title");
                    String author = rs.getString("authorName");
                    String publishDate = rs.getString("publishDate");

                    String inputString = publishDate;
                    String wordToRemove = "published";
                    String remainingString = inputString.replace(wordToRemove, "");

                    String BookTable[] = {title, author, remainingString};
                    WantToReadGUI.BooksTable.getColumnModel().getColumn(0).setPreferredWidth(180);
                    WantToReadGUI.BooksTable.getColumnModel().getColumn(1).setPreferredWidth(100);

                    DefaultTableModel models = (DefaultTableModel) WantToReadGUI.BooksTable.getModel();
                    models.addRow(BookTable);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
        WantToRead.show(true);
        this.show(false);

    }//GEN-LAST:event_WantToReadActionPerformed

    private void ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadActionPerformed
        ReadGUI Read = new ReadGUI();
        try {
            ResultSet rs = database.PrintUser_Books("Read");
            if (Read.BooksTable.getModel().getRowCount() == 0) {
                while (rs.next()) {
                    String title = rs.getString("title");
                    String author = rs.getString("authorName");
                    String publishDate = rs.getString("publishDate");

                    String inputString = publishDate;
                    String wordToRemove = "published";
                    String remainingString = inputString.replace(wordToRemove, "");

                    String BookTable[] = {title, author, remainingString};
                    Read.BooksTable.getColumnModel().getColumn(0).setPreferredWidth(180);
                    Read.BooksTable.getColumnModel().getColumn(1).setPreferredWidth(100);

                    DefaultTableModel models = (DefaultTableModel) Read.BooksTable.getModel();
                    models.addRow(BookTable);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
        Read.show(true);
        this.show(false);
    }//GEN-LAST:event_ReadActionPerformed

    private void BooksMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksMenuActionPerformed
        // TODO add your handling code here:
        DataBase database = new DataBase();
        BooksGUI booksGUI = new BooksGUI();
        try {
            ResultSet rs = database.books();
            if (booksGUI.BooksTable.getModel().getRowCount() == 0) {
                while (rs.next()) {
                    String title = rs.getString("title");
                    String author = rs.getString("authorName");
                    String publishDate = rs.getString("publishDate");

                    String inputString = publishDate;
                    String wordToRemove = "published";
                    String remainingString = inputString.replace(wordToRemove, "");

                    String BookTable[] = {title, author, remainingString};
                    booksGUI.BooksTable.getColumnModel().getColumn(0).setPreferredWidth(180);
                    booksGUI.BooksTable.getColumnModel().getColumn(1).setPreferredWidth(100);

                    DefaultTableModel models = (DefaultTableModel) booksGUI.BooksTable.getModel();
                    models.addRow(BookTable);

                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }

        booksGUI.show(true);
        this.show(false);
    }//GEN-LAST:event_BooksMenuActionPerformed

    private void CommunityMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityMenuActionPerformed
        CommunityGUI community = new CommunityGUI();
        DataBase database = new DataBase();
        try {
            ResultSet rs = database.community(LoginGUI.name);
            if (community.ReviewsTable.getModel().getRowCount() == 0) {

                while (rs.next()) {
                    String Name = rs.getString("fname") + " " + rs.getString("lname");
                    String Tital = rs.getString("title");
                    String Review = rs.getString("Review");

                    String ReviewTable[] = {Name, Tital, Review};
                    community.ReviewsTable.getColumnModel().getColumn(0).setPreferredWidth(80);
                    community.ReviewsTable.getColumnModel().getColumn(1).setPreferredWidth(100);

                    DefaultTableModel models = (DefaultTableModel) community.ReviewsTable.getModel();
                    models.addRow(ReviewTable);
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
        community.show(true);
        this.show(false);

    }//GEN-LAST:event_CommunityMenuActionPerformed

    private void ProfileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileMenuActionPerformed
        // TODO add your handling code here:
        ProfileGUI profile = new ProfileGUI();
        DataBase db = new DataBase();
        StringTokenizer tokenizer;
        try {
            tokenizer = new StringTokenizer(db.ProfileInfo(LoginGUI.name)); // ||SignupGUI.user
            ProfileGUI.ProfileName.setText(tokenizer.nextToken());
            ProfileGUI.ProfileEmail.setText(tokenizer.nextToken());
            ProfileGUI.NumberOfCurrentRead.setText(tokenizer.nextToken());
            ProfileGUI.NumberOfWantRead.setText(tokenizer.nextToken());
            ProfileGUI.NumberOfRead.setText(tokenizer.nextToken());

        } catch (ClassNotFoundException ex) {
        }
        profile.show(true);
        this.show(false);

    }//GEN-LAST:event_ProfileMenuActionPerformed

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
    private javax.swing.JButton BooksMenu;
    private javax.swing.JButton CommunityMenu;
    private static javax.swing.JButton CurrentlyReading;
    private javax.swing.JButton ProfileMenu;
    private javax.swing.JButton Read;
    private javax.swing.JButton WantToRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

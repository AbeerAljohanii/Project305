/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BooksGUI extends javax.swing.JFrame {

    DataBase database = new DataBase();

    /**
     * Creates new form BooksGUI
     */
    public BooksGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Back_jButton1 = new javax.swing.JButton();
        Read = new javax.swing.JButton();
        CurrentlyReading = new javax.swing.JButton();
        WantToRead = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(520, 924));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back_jButton1.setContentAreaFilled(false);
        Back_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Back_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 123, 50, 40));

        Read.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Read.setText("Read");
        Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadActionPerformed(evt);
            }
        });
        jPanel1.add(Read, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        CurrentlyReading.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CurrentlyReading.setText("Currently Reading");
        CurrentlyReading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentlyReadingActionPerformed(evt);
            }
        });
        jPanel1.add(CurrentlyReading, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        WantToRead.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        WantToRead.setText("Want To Read");
        WantToRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WantToReadActionPerformed(evt);
            }
        });
        jPanel1.add(WantToRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 130, -1));

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Publish Date"
            }
        ));
        BooksTable.setFocusCycleRoot(true);
        jScrollPane1.setViewportView(BooksTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 320, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Books.jpg"))); // NOI18N
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
        HomeGUI Home = new HomeGUI();
        Home.show(true);
        this.show(false);
        //BooksTable

    }//GEN-LAST:event_Back_jButton1ActionPerformed

    private void ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadActionPerformed

        ReadGUI read = new ReadGUI();
        TableModel model1 = BooksTable.getModel();
        int index = BooksTable.getSelectedRow(); // + 1 to access book id 

        String value = BooksTable.getModel().getValueAt(index, 0).toString();
        index += 1;

        Object[] row = new Object[3];
        DefaultTableModel model2 = (DefaultTableModel) ReadGUI.BooksTable.getModel();
        row[0] = model1.getValueAt(index, 0);
        row[1] = model1.getValueAt(index, 1);
        row[2] = model1.getValueAt(index, 2);
        model2.addRow(row);
        try {
            if (!database.BookID_Statusdupicate("read", index, LoginGUI.name) && !database.BookID_Statusdupicate("WantToRead", index, LoginGUI.name) && !database.BookID_Statusdupicate("CurrentlyReading", index, LoginGUI.name)) {
                String Review = JOptionPane.showInputDialog(null, "Enter Review: ");
                database.insert_user_book(LoginGUI.name, index, "read", 0, Review);
            } else {
                JOptionPane.showMessageDialog(null, "The book already added.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }

    }//GEN-LAST:event_ReadActionPerformed

    private void WantToReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WantToReadActionPerformed

        WantToReadGUI want = new WantToReadGUI();
        TableModel model1 = BooksTable.getModel();
        int index = BooksTable.getSelectedRow(); // + 1 to access book id 

        String value = BooksTable.getModel().getValueAt(index, 0).toString();
        index += 1;

        Object[] row = new Object[3];
        DefaultTableModel model2 = (DefaultTableModel) WantToReadGUI.BooksTable.getModel();
        row[0] = model1.getValueAt(index, 0);
        row[1] = model1.getValueAt(index, 1);
        row[2] = model1.getValueAt(index, 2);
        model2.addRow(row);
        try {
            if (!database.BookID_Statusdupicate("read", index, LoginGUI.name) && !database.BookID_Statusdupicate("WantToRead", index, LoginGUI.name) && !database.BookID_Statusdupicate("CurrentlyReading", index, LoginGUI.name)) {
                database.insert_user_book(LoginGUI.name, index, "WantToRead", 0, null);
            } else {
                JOptionPane.showMessageDialog(null, "The book already added.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }


    }//GEN-LAST:event_WantToReadActionPerformed

    private void CurrentlyReadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentlyReadingActionPerformed
        CurrentReadGUI current = new CurrentReadGUI();
        TableModel model1 = BooksTable.getModel();
        int index = BooksTable.getSelectedRow(); // + 1 to access book id 
        String value = BooksTable.getModel().getValueAt(index, 0).toString();
        index += 1;
        Object[] row = new Object[3];
        DefaultTableModel model2 = (DefaultTableModel) CurrentReadGUI.BooksTable.getModel();
        row[0] = model1.getValueAt(index, 0);
        row[1] = model1.getValueAt(index, 1);
        row[2] = model1.getValueAt(index, 2);
        model2.addRow(row);
        try {
            if (!database.BookID_Statusdupicate("read", index, LoginGUI.name) && !database.BookID_Statusdupicate("WantToRead", index, LoginGUI.name) && !database.BookID_Statusdupicate("CurrentlyReading", index, LoginGUI.name)) {
                String Page_number = JOptionPane.showInputDialog(null, "Enter Page Number:");
                int page = Integer.valueOf(Page_number);
                database.insert_user_book(LoginGUI.name, index, "CurrentlyReading", page, null);
            } else {
                JOptionPane.showMessageDialog(null, "The book already added.");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }

    }//GEN-LAST:event_CurrentlyReadingActionPerformed

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
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BooksGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_jButton1;
    public javax.swing.JTable BooksTable;
    private javax.swing.JButton CurrentlyReading;
    private javax.swing.JButton Read;
    private javax.swing.JButton WantToRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}

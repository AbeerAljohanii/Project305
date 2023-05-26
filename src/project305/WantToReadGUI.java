/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project305;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author ra52m
 */
public class WantToReadGUI extends javax.swing.JFrame {

    DataBase database = new DataBase();

    /**
     * Creates new form WantToReadGUI
     */
    public WantToReadGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back_jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        CurrentRead = new javax.swing.JButton();
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
        jPanel1.add(Back_jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 60, 40));

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Author", "Publish Date"
            }
        ));
        BooksTable.setFocusCycleRoot(true);
        jScrollPane1.setViewportView(BooksTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 320, 510));

        CurrentRead.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CurrentRead.setText("Current Read");
        CurrentRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentReadActionPerformed(evt);
            }
        });
        jPanel1.add(CurrentRead, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/WantToRead.png"))); // NOI18N
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

    }//GEN-LAST:event_Back_jButton1ActionPerformed

    private void CurrentReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentReadActionPerformed
        TableModel model1 = BooksTable.getModel();
        int index = BooksTable.getSelectedRow(); // + 1 to access book id
        String Page_number = JOptionPane.showInputDialog(null, "Enter Page Number:");
        int page = Integer.valueOf(Page_number);

        String value = BooksTable.getModel().getValueAt(index, 0).toString();
        database.SearchUpdateStatus(value, "CurrentlyReading");
        database.SearchUpdatepage(value, page);

    }//GEN-LAST:event_CurrentReadActionPerformed

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
            java.util.logging.Logger.getLogger(WantToReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WantToReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WantToReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WantToReadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WantToReadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_jButton1;
    public static javax.swing.JTable BooksTable;
    public javax.swing.JButton CurrentRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

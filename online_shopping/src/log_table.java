
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
public class log_table extends javax.swing.JFrame {

         Connection conn = mysql_connect.ConnectDb();
        ResultSet rs = null;
        PreparedStatement pst = null;
    public log_table() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jdisplay = new javax.swing.JButton();
        jcategories = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "table_name", "action_performed"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 402));

        jdisplay.setText("DISPLAY");
        jdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdisplayActionPerformed(evt);
            }
        });
        getContentPane().add(jdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 100, -1));

        jcategories.setText("CATEGORIES");
        jcategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcategoriesActionPerformed(evt);
            }
        });
        getContentPane().add(jcategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 100, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel1.setText("LOG_TABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdisplayActionPerformed
        String sql = "SELECT * FROM `online_shopping`.`log_table`";
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(log_table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jdisplayActionPerformed

    private void jcategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcategoriesActionPerformed
         this.setVisible(false);
        categories C = new categories();
        C.setVisible(true); 
    }//GEN-LAST:event_jcategoriesActionPerformed

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
            java.util.logging.Logger.getLogger(log_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log_table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jcategories;
    private javax.swing.JButton jdisplay;
    // End of variables declaration//GEN-END:variables
}

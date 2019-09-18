
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
public class SPORTS extends javax.swing.JFrame {

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
    public SPORTS() {
        
        initComponents();
        show_user9();
    }

   public ArrayList<user9> userList9()
    {
        ArrayList<user9> userList9 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM SPORTS2";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            user9 user9;
            while(rs.next())
            {
                user9 = new user9(rs.getString("sportswear_id"), rs.getString("sportswear_name"), rs.getString("sportswear_color"),  rs.getString("amount"));
                userList9.add(user9);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList9;
    }
    
    public void show_user9()
    {
        ArrayList<user9> list = userList9();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User9.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0] = list.get(i).getsportswear_id(); 
           row[1] = list.get(i).getsportswear_name();
           row[2] = list.get(i).getsportswear_color();
           
           row[3] = list.get(i).getamount();
          
           
           model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jsportswear_id = new javax.swing.JTextField();
        jsportswear_name = new javax.swing.JTextField();
        jsportswear_color = new javax.swing.JTextField();
        jamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User9 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel2.setText("SPORTSWEAR_DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 440, 50));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("SPORTSWEAR_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("SPORTSWEAR_NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("SPORTSWEAR_COLOR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("AMOUNT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        getContentPane().add(jsportswear_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 150, 30));
        getContentPane().add(jsportswear_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 150, 30));
        getContentPane().add(jsportswear_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 150, 30));
        getContentPane().add(jamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 150, 30));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jinsert.setText("INSERT");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        jButton6.setText("BILL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\PHOTOS\\ooty\\IMG_7008.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 470));

        jTable_Display_User9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SPORTSWEAR_ID", "SPORTSWEAR_NAME", "SPORTSWEAR_COLOR", "AMOUNT"
            }
        ));
        jTable_Display_User9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User9MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User9);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 610, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
 conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into SPORTS2 (sportswear_id, sportswear_name, sportswear_color, amount)values(?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, jsportswear_id.getText());
           pst.setString(2, jsportswear_name.getText());
           pst.setString(3, jsportswear_color.getText());
          
           pst.setString(4, jamount.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User9.getModel();
           model.setRowCount(0);
           show_user9();
           JOptionPane.showMessageDialog(null,"Inserted Successfully!!!");
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }     
    }//GEN-LAST:event_jinsertActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
           try
        {
            conn = mysql_connect.ConnectDb();
            int row = jTable_Display_User9.getSelectedRow();
            String value = (jTable_Display_User9.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE SPORTS2 SET sportswear_id = ?, sportswear_name = ?, sportswear_color=?, amount = ? where sportswear_id=\'"+value+"\'";
            
              pst = conn.prepareStatement(Sql1);
              pst.setString(1, jsportswear_id.getText());
              pst.setString(2, jsportswear_name.getText());
              pst.setString(3, jsportswear_color.getText());
              
              pst.setString(4, jamount.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User9.getModel();
           model.setRowCount(0);
           show_user9();
           JOptionPane.showMessageDialog(null,"UPDATED Successfully!!!");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }     
    }//GEN-LAST:event_jupdateActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                jsportswear_id.setText(null);
                jsportswear_name.setText(null);
                jsportswear_color.setText(null);
                
                jamount.setText(null); 
    }//GEN-LAST:event_jresetActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
             int opt = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO DELETE", "DELETE", JOptionPane.YES_NO_OPTION);
        if (opt==0)
        {
            try
            {
                conn = mysql_connect.ConnectDb();
                int row = jTable_Display_User9.getSelectedRow();
                String value = (jTable_Display_User9.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM SPORTS2 where sportswear_id =\'"+value+"\'";
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User9.getModel();
                model.setRowCount(0);
                show_user9();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.setVisible(false);
        categories C = new categories();
        C.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable_Display_User9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User9MouseClicked
        int i = jTable_Display_User9.getSelectedRow();
        TableModel model = jTable_Display_User9.getModel();
        jsportswear_id.setText(model.getValueAt(i,0).toString());
        jsportswear_name.setText(model.getValueAt(i,1).toString());
        jsportswear_color.setText(model.getValueAt(i,2).toString());
        
        jamount.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTable_Display_User9MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ArrayList<String> s = new ArrayList<>();
        s.add(jsportswear_id.getText());
        s.add(jsportswear_name.getText());
        s.add(jsportswear_color.getText());
        
        s.add(jamount.getText());
        new SPORTS_RECIPT(s).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(SPORTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPORTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPORTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPORTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPORTS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User9;
    private javax.swing.JTextField jamount;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jinsert;
    private javax.swing.JButton jreset;
    private javax.swing.JTextField jsportswear_color;
    private javax.swing.JTextField jsportswear_id;
    private javax.swing.JTextField jsportswear_name;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}

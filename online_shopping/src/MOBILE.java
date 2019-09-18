
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
public class MOBILE extends javax.swing.JFrame {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;

    
    public MOBILE() {
        initComponents();
        show_user6();
    }
      public ArrayList<User6> userList6()
    {
        ArrayList<User6> userList6 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM MOBILE";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            User6 user6;
            while(rs.next())
            {
                user6 = new User6(rs.getString("mobile_id"), rs.getString("mobile_name"), rs.getString("mobile_color"),  rs.getString("amount"));
                userList6.add(user6);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList6;
    }
    
    public void show_user6()
    {
        ArrayList<User6> list = userList6();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User6.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0] = list.get(i).getmobile_id(); 
           row[1] = list.get(i).getmobile_name();
           row[2] = list.get(i).getmobile_color();
           
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
        jmobile_id = new javax.swing.JTextField();
        jmobile_name = new javax.swing.JTextField();
        jmobile_color = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User6 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jamount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("MOBILE_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jLabel3.setText("MOBILE_NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setText("MOBILE_COLOR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        getContentPane().add(jmobile_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, -1));
        getContentPane().add(jmobile_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, -1));
        getContentPane().add(jmobile_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, -1));

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 80, -1));

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jButton5.setText("BILL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable_Display_User6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MOBILE_ID", "MOBILE_NAME", "MOBILE_COLOR", "AMOUNT"
            }
        ));
        jTable_Display_User6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User6MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User6);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 400));

        jLabel1.setText("AMOUNT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));
        getContentPane().add(jamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into MOBILE(mobile_id, mobile_name, mobile_color, amount)values(?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, jmobile_id.getText());
           pst.setString(2, jmobile_name.getText());
           pst.setString(3, jmobile_color.getText());
         
           pst.setString(4, jamount.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User6.getModel();
           model.setRowCount(0);
           show_user6();
           JOptionPane.showMessageDialog(null,"Inserted Successfully!!!");
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             try
        {
            conn = mysql_connect.ConnectDb();
            int row = jTable_Display_User6.getSelectedRow();
            String value = (jTable_Display_User6.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE MOBILE SET mobile_id = ?, mobile_name = ?, mobile_color=?, amount = ? where mobile_id=\'"+value+"\'";
            
              pst = conn.prepareStatement(Sql1);
              pst.setString(1, jmobile_id.getText());
              pst.setString(2, jmobile_name.getText());
              pst.setString(3, jmobile_color.getText());
              
              pst.setString(4, jamount.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User6.getModel();
           model.setRowCount(0);
           show_user6();
           JOptionPane.showMessageDialog(null,"UPDATED Successfully!!!");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               int opt = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO DELETE", "DELETE", JOptionPane.YES_NO_OPTION);
        if (opt==0)
        {
            try
            {
                conn = mysql_connect.ConnectDb();
                int row = jTable_Display_User6.getSelectedRow();
                String value = (jTable_Display_User6.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM MOBILE where mobile_id =\'"+value+"\'";
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User6.getModel();
                model.setRowCount(0);
                show_user6();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jmobile_id.setText(null);
                jmobile_name.setText(null);
                jmobile_color.setText(null);
                
                jamount.setText(null); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        categories C = new categories();
        C.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        ArrayList<String> s = new ArrayList<>();
        s.add(jmobile_id.getText());
        s.add(jmobile_name.getText());
        s.add(jmobile_color.getText());
        
        s.add(jamount.getText());
        new MOBILE_RECIPT(s).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable_Display_User6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User6MouseClicked
         int i = jTable_Display_User6.getSelectedRow();
        TableModel model = jTable_Display_User6.getModel();
        jmobile_id.setText(model.getValueAt(i,0).toString());
        jmobile_name.setText(model.getValueAt(i,1).toString());
        jmobile_color.setText(model.getValueAt(i,2).toString());
       
        jamount.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTable_Display_User6MouseClicked

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
            java.util.logging.Logger.getLogger(MOBILE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MOBILE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MOBILE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MOBILE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MOBILE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User6;
    private javax.swing.JTextField jamount;
    private javax.swing.JTextField jmobile_color;
    private javax.swing.JTextField jmobile_id;
    private javax.swing.JTextField jmobile_name;
    // End of variables declaration//GEN-END:variables
}

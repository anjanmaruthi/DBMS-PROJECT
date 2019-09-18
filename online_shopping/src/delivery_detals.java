
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
public class delivery_detals extends javax.swing.JFrame
{
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public delivery_detals() 
    {
        initComponents();
        show_user3();
    }
    
     
     public ArrayList<User3> userList3()
    {
        ArrayList<User3> userList3 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM delivery_details";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            User3 user3;
            while(rs.next())
            {
                user3 = new User3(rs.getString("user_id"), rs.getString("pincode"), rs.getString("complete_address"));
                userList3.add(user3);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList3;
    }
    
    public void show_user3()
    {
        ArrayList<User3> list = userList3();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User3.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0]=list.get(i).getuser_id(); 
           row[1]=list.get(i).getpincode();
           row[2]=list.get(i).getcomplete_address();
          
           
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
        juser_id = new javax.swing.JTextField();
        jpincode = new javax.swing.JTextField();
        jcomplete_address = new javax.swing.JTextField();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jnext = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELIVERY DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 570, 60));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USER_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 220, -1));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PINCODE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, -1));

        jLabel5.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DELIVERY_ADDRESS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 450, -1));
        getContentPane().add(juser_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 210, 40));
        getContentPane().add(jpincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 210, 30));
        getContentPane().add(jcomplete_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 210, 40));

        jinsert.setText("INSERT");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        jnext.setText("NEXT");
        jnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnextActionPerformed(evt);
            }
        });
        getContentPane().add(jnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 57, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 10, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOOMY\\Downloads\\images_(1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 400));

        jTable_Display_User3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "user_id", "pincode", "delivery_address"
            }
        ));
        jTable_Display_User3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 470, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
          conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into delivery_details(user_id,pincode,complete_address)values(?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, juser_id.getText());
           pst.setString(2, jpincode.getText());
           pst.setString(3, jcomplete_address.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User3.getModel();
           model.setRowCount(0);
           show_user3();
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
            int row = jTable_Display_User3.getSelectedRow();
            String value = (jTable_Display_User3.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE delivery_details SET user_id = ?, pincode = ?,complete_address = ? where pincode"+value;
            
              pst = conn.prepareStatement(Sql1);
              pst.setString(1, juser_id.getText());
              pst.setString(2, jpincode.getText());
              pst.setString(3, jcomplete_address.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User3.getModel();
           model.setRowCount(0);
           show_user3();
           JOptionPane.showMessageDialog(null,"UPDATED Successfully!!!");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
   
    }//GEN-LAST:event_jupdateActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
                  int opt = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO DELETE", "DELETE", JOptionPane.YES_NO_OPTION);
        if (opt==0)
        {
            try
            {
                conn = mysql_connect.ConnectDb();
                int row = jTable_Display_User3.getSelectedRow();
                String value = (jTable_Display_User3.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM delivery_details where pincode ="+value;
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User3.getModel();
                model.setRowCount(0);
                show_user3();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                juser_id.setText(null);
                jpincode.setText(null);
                jcomplete_address.setText(null);
    }//GEN-LAST:event_jresetActionPerformed

    private void jTable_Display_User3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User3MouseClicked
      int i = jTable_Display_User3.getSelectedRow();
        TableModel model = jTable_Display_User3.getModel();
        juser_id.setText(model.getValueAt(i,0).toString());
        jpincode.setText(model.getValueAt(i,1).toString());
        jcomplete_address.setText(model.getValueAt(i,2).toString());
    }//GEN-LAST:event_jTable_Display_User3MouseClicked

    private void jnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnextActionPerformed
            this.setVisible(false);
            payment p = new payment();
            p.setVisible(true);

    }//GEN-LAST:event_jnextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setVisible(false);
         categories c = new categories();
          c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(delivery_detals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delivery_detals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delivery_detals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delivery_detals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delivery_detals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User3;
    private javax.swing.JTextField jcomplete_address;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jinsert;
    private javax.swing.JButton jnext;
    private javax.swing.JTextField jpincode;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField juser_id;
    // End of variables declaration//GEN-END:variables
}

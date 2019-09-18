
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
public class user_registration1 extends javax.swing.JFrame {

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
    public user_registration1() {
        initComponents();
        show_user0();
    }

    public ArrayList<user0> userList0()
    {
        ArrayList<user0> userList0 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM USER_REGISTRATION";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            user0 user0;
            while(rs.next())
            {
                user0 = new user0(rs.getString("user_id"), rs.getString("user_name"), rs.getString("email_id"), rs.getString("phone_no"), rs.getString("password"));
                userList0.add(user0);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList0;
    }
    
    public void show_user0()
    {
        ArrayList<user0> list = userList0();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User0.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0] = list.get(i).getuser_id(); 
           row[1] = list.get(i).getuser_name();
           row[2] = list.get(i).getemail_id();
           row[3] = list.get(i).getphone_no();
           row[4] = list.get(i).getpassword();
          
           
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
        jLabel6 = new javax.swing.JLabel();
        juser_id = new javax.swing.JTextField();
        juser_name = new javax.swing.JTextField();
        jemail_id = new javax.swing.JTextField();
        jphone_no = new javax.swing.JTextField();
        jpassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jinsert = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jnext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User0 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("USER_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("USER_NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("EMAIL_ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PHONE_NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(juser_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, -1));
        getContentPane().add(juser_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, -1));
        getContentPane().add(jemail_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 170, -1));
        getContentPane().add(jphone_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 170, -1));
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 170, -1));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel7.setText("User_Registration");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOOMY\\Downloads\\user.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 370));

        jinsert.setText("INSERT");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 73, -1));

        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 73, -1));

        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 73, -1));

        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 73, -1));

        jnext.setText("NEXT");
        jnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnextActionPerformed(evt);
            }
        });
        getContentPane().add(jnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 73, -1));

        jTable_Display_User0.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER_ID", "USER_NAME", "EMAIL_ID", "PHONE_NO", "PASWORD"
            }
        ));
        jTable_Display_User0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User0MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User0);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 370, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
            conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into USER_REGISTRATION(user_id, user_name, email_id, phone_no, password)values(?,?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, juser_id.getText());
           pst.setString(2, juser_name.getText());
           pst.setString(3, jemail_id.getText());
           pst.setString(4, jphone_no.getText());
           pst.setString(5, jpassword.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User0.getModel();
           model.setRowCount(0);
           show_user0();
           JOptionPane.showMessageDialog(null,"Inserted Successfully!!!");
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_jinsertActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO DELETE", "DELETE", JOptionPane.YES_NO_OPTION);
        if (opt==0)
        {
            try
            {
                conn = mysql_connect.ConnectDb();
                int row = jTable_Display_User0.getSelectedRow();
                String value = (jTable_Display_User0.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM USER_REGISTRATION where user_id ="+value;
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User0.getModel();
                model.setRowCount(0);
                show_user0();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } 
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jTable_Display_User0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User0MouseClicked
        int i = jTable_Display_User0.getSelectedRow();
        TableModel model = jTable_Display_User0.getModel();
        juser_id.setText(model.getValueAt(i,0).toString());
        juser_name.setText(model.getValueAt(i,1).toString());
        jemail_id.setText(model.getValueAt(i,2).toString());
        jphone_no.setText(model.getValueAt(i,3).toString());
        jpassword.setText(model.getValueAt(i,4).toString());
    }//GEN-LAST:event_jTable_Display_User0MouseClicked

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
         try
        {
            conn = mysql_connect.ConnectDb();
            int row = jTable_Display_User0.getSelectedRow();
            String value = (jTable_Display_User0.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE USER_REGISTRATION SET user_id = ?, user_name = ?, email_id=?, phone_no = ?, password = ? where user_id="+value;
            
              pst = conn.prepareStatement(Sql1);
              pst.setString(1, juser_id.getText());
              pst.setString(2, juser_name.getText());
              pst.setString(3, jemail_id.getText());
              pst.setString(4, jphone_no.getText());
              pst.setString(5, jpassword.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User0.getModel();
           model.setRowCount(0);
           show_user0();
           JOptionPane.showMessageDialog(null,"UPDATED Successfully!!!");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                juser_id.setText(null);
                juser_name.setText(null);
                jemail_id.setText(null);
                jphone_no.setText(null);
                jpassword.setText(null); 
    }//GEN-LAST:event_jresetActionPerformed

    private void jnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnextActionPerformed
       this.setVisible(false);
       categories c = new categories();
       c.setVisible(true);
    }//GEN-LAST:event_jnextActionPerformed

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
            java.util.logging.Logger.getLogger(user_registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_registration1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_registration1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User0;
    private javax.swing.JButton jdelete;
    private javax.swing.JTextField jemail_id;
    private javax.swing.JButton jinsert;
    private javax.swing.JButton jnext;
    private javax.swing.JTextField jpassword;
    private javax.swing.JTextField jphone_no;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField juser_id;
    private javax.swing.JTextField juser_name;
    // End of variables declaration//GEN-END:variables
}

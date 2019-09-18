
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
public class payment extends javax.swing.JFrame 
{
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

   
    
    public payment() 
    {
        initComponents();
        show_user4();
    }
     public ArrayList<User4> userList4()
    {
        ArrayList<User4> userList4 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM payment";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            User4 user4;
            while(rs.next())
            {
                user4 = new User4(rs.getString("user_id"), rs.getString("card_no"), rs.getString("cvv"), rs.getString("amount"));
                userList4.add(user4);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList4;
    }
    
    public void show_user4()
    {
        ArrayList<User4> list = userList4();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User4.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0] = list.get(i).getuser_id(); 
           row[1] = list.get(i).getcard_no();
           row[2] = list.get(i).getcvv();
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
        juser_id = new javax.swing.JTextField();
        jcard_no = new javax.swing.JTextField();
        jcvv = new javax.swing.JTextField();
        jamount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jsearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 22)); // NOI18N
        jLabel2.setText("USER_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 22)); // NOI18N
        jLabel3.setText("CARD_NO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, -1));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 1, 22)); // NOI18N
        jLabel4.setText("CVV");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 90, 40));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 22)); // NOI18N
        jLabel5.setText("AMOUNT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, 30));
        getContentPane().add(juser_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, 40));
        getContentPane().add(jcard_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 170, 40));
        getContentPane().add(jcvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 170, 30));
        getContentPane().add(jamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 170, 30));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel6.setText("PAYMENT-DETAILS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 14, -1, 40));

        jinsert.setText("INSERT");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));

        jexit.setText("EXIT");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });
        getContentPane().add(jexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jsearch.setText("SEARCH");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });
        getContentPane().add(jsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOOMY\\Downloads\\0323 (1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 340));

        jTable_Display_User4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "USER_ID", "CARD_NO", "CVV", "AMOUNT"
            }
        ));
        jTable_Display_User4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User4);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
           conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into payment(user_id, card_no, cvv, amount)values(?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, juser_id.getText());
           pst.setString(2, jcard_no.getText());
           pst.setString(3, jcvv.getText());
           pst.setString(4, jamount.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User4.getModel();
           model.setRowCount(0);
           show_user4();
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
            int row = jTable_Display_User4.getSelectedRow();
            String value = (jTable_Display_User4.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE payment SET user_id = ?, card_no = ?,cvv = ?,amount = ? where user_id="+value;
            
              pst = conn.prepareStatement(Sql1);
              pst.setString(1, juser_id.getText());
              pst.setString(2, jcard_no.getText());
              pst.setString(3, jcvv.getText());
              pst.setString(4, jamount.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User4.getModel();
           model.setRowCount(0);
           show_user4();
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
                int row = jTable_Display_User4.getSelectedRow();
                String value = (jTable_Display_User4.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM payment where user_id ="+value;
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User4.getModel();
                model.setRowCount(0);
                show_user4();
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
                jcard_no.setText(null);
                jcvv.setText(null);
                jamount.setText(null);
    }//GEN-LAST:event_jresetActionPerformed

    private void jTable_Display_User4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User4MouseClicked
      int i = jTable_Display_User4.getSelectedRow();
        TableModel model = jTable_Display_User4.getModel();
        juser_id.setText(model.getValueAt(i,0).toString());
        jcard_no.setText(model.getValueAt(i,1).toString());
        jcvv.setText(model.getValueAt(i,2).toString());
        jamount.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTable_Display_User4MouseClicked

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        
          JOptionPane.showMessageDialog(null,"Order has been placed successfully.\nIt will soon be delivered to you.\nThank You!!!");
        System.exit(0);
    }//GEN-LAST:event_jexitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
          delivery_detals d = new delivery_detals();
          d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
        this.setVisible(false);
        fetch f = new fetch();
        f.setVisible(true);
    }//GEN-LAST:event_jsearchActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User4;
    private javax.swing.JTextField jamount;
    private javax.swing.JTextField jcard_no;
    private javax.swing.JTextField jcvv;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jinsert;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jsearch;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField juser_id;
    // End of variables declaration//GEN-END:variables

    
}

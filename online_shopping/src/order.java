
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
public class order extends javax.swing.JFrame 
{
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

  
    public order() 
    {
        initComponents();
        show_user5();
    }
    public ArrayList<User5> userList5()
    {
        ArrayList<User5> userList5 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM order2";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            User5 user5;
            while(rs.next())
            {
                user5 = new User5(rs.getString("order_id"), rs.getString("user_id"), rs.getString("mobile_id"), rs.getString("laptop_id"), rs.getString("footwear_id"), rs.getString("sportswear_id"), rs.getString("quantity"), rs.getString("order_date"));
                userList5.add(user5);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList5;
    }
    
    public void show_user5()
    {
        ArrayList<User5> list = userList5();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User5.getModel();
        Object[] row = new Object[10];
        for(int i=0;i<list.size();i++)
        {
           row[0] = list.get(i).getorder_id(); 
           row[1] = list.get(i).getuser_id();
           row[2] = list.get(i).getmobile_id();
           row[3] = list.get(i).getlaptop_id();
           row[4] = list.get(i).getfootwear_id();
           row[5] = list.get(i).getsportswear_id();
           row[6] = list.get(i).getquantity();
           row[7] = list.get(i).getorder_date();
          
           
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
        jorder_id = new javax.swing.JTextField();
        juser_id = new javax.swing.JTextField();
        jquantity = new javax.swing.JTextField();
        jorder_date = new javax.swing.JTextField();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jnext = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jmobile_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlaptop_id = new javax.swing.JTextField();
        jfootwear_id = new javax.swing.JTextField();
        jsportswear_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User5 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("ORDER_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 40));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("USER_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("QUANTITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("ORDER_DATE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, 40));
        getContentPane().add(jorder_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, 30));
        getContentPane().add(juser_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, 30));
        getContentPane().add(jquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 150, 30));
        getContentPane().add(jorder_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 150, 30));

        jinsert.setText("INSERT");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 70, -1));

        jnext.setText("NEXT");
        jnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnextActionPerformed(evt);
            }
        });
        getContentPane().add(jnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel6.setText("ORDER_DETAILS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 270, 50));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("MOBILE_ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 40));
        getContentPane().add(jmobile_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 150, 30));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel8.setText("LAPTOP_ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel9.setText("FOOTWEAR_ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setText("SPORTSWEAR_ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        getContentPane().add(jlaptop_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 150, 30));
        getContentPane().add(jfootwear_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 150, 30));
        getContentPane().add(jsportswear_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 150, 40));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\PHOTOS\\ooty\\IMG_7017.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 610));

        jTable_Display_User5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "order_id", "user_id", "mobile_id", "laptop_id", "footwear_id", "sportswear_id", "quantity", "order_date"
            }
        ));
        jScrollPane1.setViewportView(jTable_Display_User5);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 650, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
            conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into order2 (order_id, user_id, mobile_id, laptop_id, footwear_id, sportswear_id quantity, order_date)values(?,?,?,?,?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, jorder_id.getText());
           pst.setString(2, juser_id.getText());
           pst.setString(3, jmobile_id.getText());
           pst.setString(4, jlaptop_id.getText());
           pst.setString(5, jfootwear_id.getText());
           pst.setString(6, jsportswear_id.getText());
           pst.setString(7, jquantity.getText());
           pst.setString(8, jorder_date.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User5.getModel();
           model.setRowCount(0);
           show_user5();
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
            int row = jTable_Display_User5.getSelectedRow();
            String value = (jTable_Display_User5.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE order2 SET order_id = ?, user_id = ?, mobile_id=?, laptop_id=?, footwear_id=?, sportswear_id=?,quantity = ?,order_date = ? where order_id=\'"+value+"\'";
            
               pst = conn.prepareStatement(Sql1);
               pst.setString(1, jorder_id.getText());
               pst.setString(2, juser_id.getText());
               pst.setString(3, jmobile_id.getText());
               pst.setString(4, jlaptop_id.getText());
               pst.setString(5, jfootwear_id.getText());
               pst.setString(6, jsportswear_id.getText());
               pst.setString(7, jquantity.getText());
               pst.setString(8, jorder_date.getText());
               pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User5.getModel();
           model.setRowCount(0);
           show_user5();
           JOptionPane.showMessageDialog(null,"UPDATED Successfully!!!");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                jorder_id.setText(null);
                juser_id.setText(null);
                jmobile_id.setText(null);
                jlaptop_id.setText(null);
                jfootwear_id.setText(null);
                jsportswear_id.setText(null);
                jquantity.setText(null);
                jorder_date.setText(null);      
    }//GEN-LAST:event_jresetActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
       int opt = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO DELETE", "DELETE", JOptionPane.YES_NO_OPTION);
        if (opt==0)
        {
            try
            {
                conn = mysql_connect.ConnectDb();
                int row = jTable_Display_User5.getSelectedRow();
                String value = (jTable_Display_User5.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM order2 where order_id ="+value;
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User5.getModel();
                model.setRowCount(0);
                show_user5();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnextActionPerformed
         this.setVisible(false);
          delivery_detals d = new delivery_detals();
          d.setVisible(true);
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
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User5;
    private javax.swing.JButton jdelete;
    private javax.swing.JTextField jfootwear_id;
    private javax.swing.JButton jinsert;
    private javax.swing.JTextField jlaptop_id;
    private javax.swing.JTextField jmobile_id;
    private javax.swing.JButton jnext;
    private javax.swing.JTextField jorder_date;
    private javax.swing.JTextField jorder_id;
    private javax.swing.JTextField jquantity;
    private javax.swing.JButton jreset;
    private javax.swing.JTextField jsportswear_id;
    private javax.swing.JButton jupdate;
    private javax.swing.JTextField juser_id;
    // End of variables declaration//GEN-END:variables
}

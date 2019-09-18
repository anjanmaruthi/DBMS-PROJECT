
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
public class product extends javax.swing.JFrame 
{
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

   
    public product() 
    {
        initComponents();
        show_user1();
    }
    public ArrayList<User1> userList1()
    {
        ArrayList<User1> userList1 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM product";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            User1 user1;
            while(rs.next())
            {
                user1 = new User1(rs.getString("product_code"), rs.getString("product_name"), rs.getString("product_type"), rs.getString("expiry_date"));
                userList1.add(user1);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList1;
    }
    
    public void show_user1()
    {
        ArrayList<User1> list = userList1();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User1.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0]=list.get(i).getproduct_code(); 
           row[1]=list.get(i).getproduct_name();
           row[2]=list.get(i).getproduct_type();
           row[3]=list.get(i).getexpiry_date();
           model.addRow(row);
        }
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jproduct_code = new javax.swing.JTextField();
        jproduct_name = new javax.swing.JTextField();
        jproduct_type = new javax.swing.JTextField();
        jexpiry_date = new javax.swing.JTextField();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jnext = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User1 = new javax.swing.JTable();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCT_CODE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCT_NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRODUCT_TYPE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EXPIRY_DATE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, -1));

        jproduct_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jproduct_codeActionPerformed(evt);
            }
        });
        getContentPane().add(jproduct_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 190, -1));

        jproduct_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jproduct_nameActionPerformed(evt);
            }
        });
        getContentPane().add(jproduct_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 190, -1));
        getContentPane().add(jproduct_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 190, -1));
        getContentPane().add(jexpiry_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 190, -1));

        jinsert.setText("INSERT");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 73, -1));

        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 73, -1));

        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 73, -1));

        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 73, -1));

        jnext.setText("NEXT");
        jnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnextActionPerformed(evt);
            }
        });
        getContentPane().add(jnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 73, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOOMY\\Desktop\\mobile-wallpapers-720x1280.jpg")); // NOI18N
        jLabel2.setText("product_");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

        jTable_Display_User1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "product_code", "product_name", "product_type", "expiry_date"
            }
        ));
        jScrollPane1.setViewportView(jTable_Display_User1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 402));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jproduct_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jproduct_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jproduct_codeActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
   try
        {
            conn = mysql_connect.ConnectDb();
            int row = jTable_Display_User1.getSelectedRow();
            String value = (jTable_Display_User1.getModel().getValueAt(row, 0).toString());
            
            String Sql = "UPDATE product SET product_code = ?, product_name = ?,product_type = ?, expiry_date = ? where product_code = \'"+value+"\'";
              pst = conn.prepareStatement(Sql);
              pst.setString(1, jproduct_code.getText());
              pst.setString(2, jproduct_name.getText());
              pst.setString(3, jproduct_type.getText());
              pst.setString(4, jexpiry_date.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User1.getModel();
           model.setRowCount(0);
           show_user1();
           JOptionPane.showMessageDialog(null,"UPDATED Successfully!!!");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
       conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into product(product_code, product_name, product_type, expiry_date)values(?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, jproduct_code.getText());
           pst.setString(2, jproduct_name.getText());
           pst.setString(3, jproduct_type.getText());
           pst.setString(4, jexpiry_date.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User1.getModel();
           model.setRowCount(0);
           show_user1();
           JOptionPane.showMessageDialog(null,"Inserted Successfully!!!");
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
   
    }//GEN-LAST:event_jinsertActionPerformed

    private void jproduct_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jproduct_nameActionPerformed
       
    }//GEN-LAST:event_jproduct_nameActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
           int opt = JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO DELETE", "DELETE", JOptionPane.YES_NO_OPTION);
        if (opt==0)
        {
            try
            {
                conn = mysql_connect.ConnectDb();
                int row = jTable_Display_User1.getSelectedRow();
                String value = (jTable_Display_User1.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM product where product_code ="+value;
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User1.getModel();
                model.setRowCount(0);
                show_user1();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                jproduct_code.setText(null);
                jproduct_name.setText(null);
                jproduct_type.setText(null);
                jexpiry_date.setText(null);
    }//GEN-LAST:event_jresetActionPerformed

    private void jnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnextActionPerformed
        //this.setVisible(false);
        //area u=new area();
          //u.setVisible(true);
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
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User1;
    private javax.swing.JButton jdelete;
    private javax.swing.JTextField jexpiry_date;
    private javax.swing.JButton jinsert;
    private javax.swing.JButton jnext;
    private javax.swing.JTextField jproduct_code;
    private javax.swing.JTextField jproduct_name;
    private javax.swing.JTextField jproduct_type;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}

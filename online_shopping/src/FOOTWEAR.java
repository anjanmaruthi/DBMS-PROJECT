
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
public class FOOTWEAR extends javax.swing.JFrame {
      Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        
    public FOOTWEAR() {
        
        initComponents();
        show_user8();
    }
    public ArrayList<user8> userList8()
    {
        ArrayList<user8> userList8 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM FOOTWEAR2";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            user8 user8;
            while(rs.next())
            {
                user8 = new user8(rs.getString("footwear_id"), rs.getString("footwear_name"), rs.getString("footwear_color"), rs.getString("amount"));
                userList8.add(user8);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList8;
    }
    
    public void show_user8()
    {
        ArrayList<user8> list = userList8();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User8.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0] = list.get(i).getfootwear_id(); 
           row[1] = list.get(i).getfootwear_name();
           row[2] = list.get(i).getfootwear_color();
         
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
        jfootwear_id = new javax.swing.JTextField();
        jfootwear_name = new javax.swing.JTextField();
        jfootwear_color = new javax.swing.JTextField();
        jamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User8 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 36)); // NOI18N
        jLabel2.setText("FOOTWEAR_DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 410, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("FOOTWEAR_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("FOOTWEAR_NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("FOOTWEAR_COLOR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("AMOUNT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(jfootwear_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 150, 30));
        getContentPane().add(jfootwear_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 150, 30));
        getContentPane().add(jfootwear_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 150, 30));
        getContentPane().add(jamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 150, 30));

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
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        jButton6.setText("BILL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\PHOTOS\\ooty\\IMG_7008.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 460));

        jTable_Display_User8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FOOTWEAR_ID", "FOOTWEAR_NAME", "FOOTWEAR_COLOR", "AMOUNT"
            }
        ));
        jTable_Display_User8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User8MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User8);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 550, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
            conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into FOOTWEAR2 (footwear_id, footwear_name, footwear_color, amount)values(?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, jfootwear_id.getText());
           pst.setString(2, jfootwear_name.getText());
           pst.setString(3, jfootwear_color.getText());
           
           pst.setString(4, jamount.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User8.getModel();
           model.setRowCount(0);
           show_user8();
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
                int row = jTable_Display_User8.getSelectedRow();
                String value = (jTable_Display_User8.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM FOOTWEAR2 where footwear_id =\'"+value+"\'";
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User8.getModel();
                model.setRowCount(0);
                show_user8();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }          
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                jfootwear_id.setText(null);
                jfootwear_name.setText(null);
                jfootwear_color.setText(null);
                
                jamount.setText(null);        
    }//GEN-LAST:event_jresetActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
         try
        {
            conn = mysql_connect.ConnectDb();
            int row = jTable_Display_User8.getSelectedRow();
            String value = (jTable_Display_User8.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE FOOTWEAR2 SET footwear_id = ?, footwear_name = ?, footwear_color=?,  amount = ? where footwear_id=\'"+value+"\'";
            
              pst = conn.prepareStatement(Sql1);
              pst.setString(1, jfootwear_id.getText());
              pst.setString(2, jfootwear_name.getText());
              pst.setString(3, jfootwear_color.getText());
              
              pst.setString(4, jamount.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User8.getModel();
           model.setRowCount(0);
           show_user8();
           JOptionPane.showMessageDialog(null,"UPDATED Successfully!!!");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        categories C = new categories();
        C.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable_Display_User8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User8MouseClicked
        int i = jTable_Display_User8.getSelectedRow();
        TableModel model = jTable_Display_User8.getModel();
        jfootwear_id.setText(model.getValueAt(i,0).toString());
        jfootwear_name.setText(model.getValueAt(i,1).toString());
        jfootwear_color.setText(model.getValueAt(i,2).toString());
        
        jamount.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTable_Display_User8MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ArrayList<String> s = new ArrayList<>();
        s.add(jfootwear_id.getText());
        s.add(jfootwear_name.getText());
        s.add(jfootwear_color.getText());
        
        s.add(jamount.getText());
        new FOOTWEAR_RECIPT(s).setVisible(true);
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
            java.util.logging.Logger.getLogger(FOOTWEAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FOOTWEAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FOOTWEAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FOOTWEAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FOOTWEAR().setVisible(true);
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
    private javax.swing.JTable jTable_Display_User8;
    private javax.swing.JTextField jamount;
    private javax.swing.JButton jdelete;
    private javax.swing.JTextField jfootwear_color;
    private javax.swing.JTextField jfootwear_id;
    private javax.swing.JTextField jfootwear_name;
    private javax.swing.JButton jinsert;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}

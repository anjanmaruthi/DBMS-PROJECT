
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
public class area extends javax.swing.JFrame 
{
     Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public area() 
    {
        initComponents();
        show_user2();
        
    }
    
    public ArrayList<User2> userList2()
    {
        ArrayList<User2> userList2 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM area";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            User2 user2;
            while(rs.next())
            {
                user2 = new User2(rs.getString("pincode"), rs.getString("area_name"), rs.getString("items_available"));
                userList2.add(user2);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList2;
    }
    
    public void show_user2()
    {
        ArrayList<User2> list = userList2();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User2.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0]=list.get(i).getpincode(); 
           row[1]=list.get(i).getarea_name();
           row[2]=list.get(i).getitems_available();
          
           
           model.addRow(row);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpincode = new javax.swing.JTextField();
        jarea_name = new javax.swing.JTextField();
        jitems_available = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User2 = new javax.swing.JTable();
        jinsert = new javax.swing.JButton();
        jupdate = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jnext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setText("PINCODE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setText("AREA_NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setText("ITEMS_AVAILABLE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 50));
        getContentPane().add(jpincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 220, 40));
        getContentPane().add(jarea_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 220, 40));
        getContentPane().add(jitems_available, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 220, 40));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel5.setText("AREA_DETAILS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 310, 40));

        jTable_Display_User2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "pincode", "area", "items_available"
            }
        ));
        jTable_Display_User2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 480, 250));

        jinsert.setText("INSERT");
        jinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinsertActionPerformed(evt);
            }
        });
        getContentPane().add(jinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jupdate.setText("UPDATE");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jdelete.setText("DELETE");
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });
        getContentPane().add(jreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jnext.setText("NEXT");
        jnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnextActionPerformed(evt);
            }
        });
        getContentPane().add(jnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LOOMY\\Downloads\\user.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinsertActionPerformed
    conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into area(pincode,area_name,items_available)values(?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, jpincode.getText());
           pst.setString(2, jarea_name.getText());
           pst.setString(3, jitems_available.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User2.getModel();
           model.setRowCount(0);
           show_user2();
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
            int row = jTable_Display_User2.getSelectedRow();
            String value = (jTable_Display_User2.getModel().getValueAt(row, 0).toString());
            
            String Sql = "UPDATE area SET pincode = ?, area_name = ?,items_available = ? where pincode="+value;
            
              pst = conn.prepareStatement(Sql);
              pst.setString(1, jpincode.getText());
              pst.setString(2, jarea_name.getText());
              pst.setString(3, jitems_available.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User2.getModel();
           model.setRowCount(0);
           show_user2();
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
                int row = jTable_Display_User2.getSelectedRow();
                String value = (jTable_Display_User2.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM area where pincode ="+value;
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User2.getModel();
                model.setRowCount(0);
                show_user2();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
   
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
                
                jpincode.setText(null);
                jarea_name.setText(null);
                jitems_available.setText(null);
           
   
    }//GEN-LAST:event_jresetActionPerformed

    private void jTable_Display_User2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User2MouseClicked
        int i = jTable_Display_User2.getSelectedRow();
        TableModel model = jTable_Display_User2.getModel();
        jpincode.setText(model.getValueAt(i,0).toString());
        jarea_name.setText(model.getValueAt(i,1).toString());
        jitems_available.setText(model.getValueAt(i,2).toString());
       
    }//GEN-LAST:event_jTable_Display_User2MouseClicked

    private void jnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnextActionPerformed
        this.setVisible(false);
          order u=new order();
          u.setVisible(true);
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
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User2;
    private javax.swing.JTextField jarea_name;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jinsert;
    private javax.swing.JTextField jitems_available;
    private javax.swing.JButton jnext;
    private javax.swing.JTextField jpincode;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jupdate;
    // End of variables declaration//GEN-END:variables
}

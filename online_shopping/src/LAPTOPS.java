
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
public class LAPTOPS extends javax.swing.JFrame {

    Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        
    public LAPTOPS() {
        initComponents();
        show_user7();
    }
    public ArrayList<user7> userList7()
    {
        ArrayList<user7> userList7 = new ArrayList();
        try
        {
            conn = mysql_connect.ConnectDb();
            String Sql1 = "SELECT * FROM LAPTOPS2";
            pst = conn.prepareStatement(Sql1);
            rs=pst.executeQuery(Sql1);
            user7 user7;
            while(rs.next())
            {
                user7 = new user7(rs.getString("laptop_id"), rs.getString("laptop_name"), rs.getString("laptop_color"),  rs.getString("amount"));
                userList7.add(user7);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return userList7;
    }
    
    public void show_user7()
    {
        ArrayList<user7> list = userList7();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_User7.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<list.size();i++)
        {
           row[0] = list.get(i).getlaptop_id(); 
           row[1] = list.get(i).getlaptop_name();
           row[2] = list.get(i).getlaptop_color();
           
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
        jlaptop_id = new javax.swing.JTextField();
        jlaptop_name = new javax.swing.JTextField();
        jlaptop_color = new javax.swing.JTextField();
        jamount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User7 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("LAPTOP_DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 290, 50));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("LAPTOP_ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 40));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("LAPTOP_NAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("LAPTOP_COLOR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setText("AMOUNT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));
        getContentPane().add(jlaptop_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 150, 30));
        getContentPane().add(jlaptop_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 150, 30));
        getContentPane().add(jlaptop_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 150, 30));
        getContentPane().add(jamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 150, 30));

        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jButton5.setText("BILL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\PHOTOS\\ooty\\IMG_7008.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 510, 400));

        jTable_Display_User7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "LAPTOP_ID", "LAPTOP_NAME", "LAPTOP_COLOR", "AMOUNT"
            }
        ));
        jTable_Display_User7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_User7MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User7);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 402));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          conn = mysql_connect.ConnectDb();
       String Sql1 = "Insert into LAPTOPS2 (laptop_id, laptop_name, laptop_color,amount)values(?,?,?,?)";
       try
       {
           pst = conn.prepareStatement(Sql1);
           pst.setString(1, jlaptop_id.getText());
           pst.setString(2, jlaptop_name.getText());
           pst.setString(3, jlaptop_color.getText());
           
           pst.setString(4, jamount.getText());
           pst.executeUpdate();
           DefaultTableModel model = (DefaultTableModel)jTable_Display_User7.getModel();
           model.setRowCount(0);
           show_user7();
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
            int row = jTable_Display_User7.getSelectedRow();
            String value = (jTable_Display_User7.getModel().getValueAt(row, 0).toString());
            
            String Sql1 = "UPDATE LAPTOPS2 SET laptop_id = ?, laptop_name = ?, laptop_color=?, amount = ? where laptop_id=\'"+value+"\'";
            
              pst = conn.prepareStatement(Sql1);
              pst.setString(1, jlaptop_id.getText());
              pst.setString(2, jlaptop_name.getText());
              pst.setString(3, jlaptop_color.getText());
              
              pst.setString(4, jamount.getText());
              pst.executeUpdate();
              
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User7.getModel();
           model.setRowCount(0);
           show_user7();
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
                int row = jTable_Display_User7.getSelectedRow();
                String value = (jTable_Display_User7.getModel().getValueAt(row, 0).toString());
                String Sql1= "DELETE FROM LAPTOPS2 where laptop_id =\'"+value+"\'";
                pst = conn.prepareStatement(Sql1);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_Display_User7.getModel();
                model.setRowCount(0);
                show_user7();
                JOptionPane.showMessageDialog(null, "Deleted successfully!!!");
            
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                jlaptop_id.setText(null);
                jlaptop_name.setText(null);
                jlaptop_color.setText(null);
               
                jamount.setText(null); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        categories C = new categories();
        C.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable_Display_User7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_User7MouseClicked
         int i = jTable_Display_User7.getSelectedRow();
        TableModel model = jTable_Display_User7.getModel();
        jlaptop_id.setText(model.getValueAt(i,0).toString());
        jlaptop_name.setText(model.getValueAt(i,1).toString());
        jlaptop_color.setText(model.getValueAt(i,2).toString());
        
        jamount.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTable_Display_User7MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ArrayList<String> s = new ArrayList<>();
        s.add(jlaptop_id.getText());
        s.add(jlaptop_name.getText());
        s.add(jlaptop_color.getText());
       
        s.add(jamount.getText());
        new LAPTOP_RECIPT(s).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(LAPTOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LAPTOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LAPTOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LAPTOPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LAPTOPS().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User7;
    private javax.swing.JTextField jamount;
    private javax.swing.JTextField jlaptop_color;
    private javax.swing.JTextField jlaptop_id;
    private javax.swing.JTextField jlaptop_name;
    // End of variables declaration//GEN-END:variables
}

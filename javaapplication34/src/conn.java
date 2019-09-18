/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shiva
 */
class conn {
    private static final String username="root";
    private static final String password="root";
    private static final String Conn="jdbc:mysql://localhost:3306/fruits";
    Connection c=null;
    public void connect()
    {
        
            try
            {
                c=DriverManager.getConnection(Conn,username,password);
                System.out.println("connected");
                
            }catch(Exception e)
            {
                System.err.println(e);
            }
    }
    public void insert(int batchid,int quantity,int price) throws SQLException
    {
        String query1 ="insert into apple(id, quantity, price)"+" values(?,?,?)";
        PreparedStatement preparedStmt = c.prepareStatement(query1);
        preparedStmt.setInt(1, batchid);
        preparedStmt.setInt(2, quantity);
        preparedStmt.setInt(3, price);
        preparedStmt.execute();
    }
    public Object[][] getData() throws SQLException
    {
        Statement st = c.createStatement();
        String sql = ("call fruits.disp();");
        ResultSet rs = st.executeQuery(sql);
        Object[][] row = new Object[15][3];
        int i=0;
        while(rs.next()) { 
            int id = rs.getInt("id"); 
            int quantity = rs.getInt("quantity");
            int price = rs.getInt("price");
            System.out.println(id+" "+quantity+" "+price);
            if(i==15)
            {
                break;
            }
            row[i][0]=id;
            row[i][1]=quantity;
            row[i][2]=price;
            i++;
        }
        
        return row;
    }
    public void updateDate(int quantity,int price,int batchid) throws SQLException 
    {
        String query = "update apple set  quantity= ?,price= where id = ?";
        PreparedStatement preparedStmt = c.prepareStatement(query);
        preparedStmt.setInt(1,quantity);
        preparedStmt.setInt(2,price);
        preparedStmt.setInt(3,batchid);
        preparedStmt.executeUpdate();
        
        
    }
}

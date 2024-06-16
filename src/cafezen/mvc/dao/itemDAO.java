/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafezen.mvc.dao;

import cafezen.mvc.model.itemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import cafezen.mvc.dao.itemDAO;
import cafezen.mvc.DB.DBConnection;
/**

/**
 *
 * @author ITBIN-2211-0165
 */
public class itemDAO {
    
 
    public void additem( itemModel  item ) {
        
        
         String sql;
        sql = "INSERT INTO product1b1(PName,category,price) VALUES(?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,item.getName());
            stmt.setString(2,item.getCategory());
            stmt.setString(3,item.getPrice());
         
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
    
      public void update(itemModel item){
        String sql = "UPDATE product1b1 SET PName = ?, 	category = ?, 	price = ? WHERE PNum = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,item.getName());
            stmt.setString(2,item.getCategory());
            stmt.setString(3,item.getPrice());
            stmt.setInt(4,item.getId());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
     
     
     public void delete(int id) throws SQLException {
       
       System.out.println(id);
       
        String deleteQuery = "DELETE FROM product1b1 WHERE PNum = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
          
         
            pst.executeUpdate();
            

        } catch (SQLException e) {
            e.printStackTrace();
    }
        
     }
     
     
     
     
     
      public List<String[]> getAllItems() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM product1b1";

    try{
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[4]; 
        
                user[0] = String.valueOf(rs.getInt("PNum")); 
                user[1] = rs.getString("PName");
                user[2] = rs.getString("category");
                user[3] = rs.getString("price"); 
               
                
                
                userData.add(user);
       
      }
      } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
     
     
    
}
    


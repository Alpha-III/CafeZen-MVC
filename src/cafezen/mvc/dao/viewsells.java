/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafezen.mvc.dao;

import cafezen.mvc.DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITBIN-2211-0165
 */
public class viewsells {
    
    public List<String[]> getAllItems() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM bill1b1";

    try{
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[4]; // Assuming username and password
        
                user[0] = String.valueOf(rs.getInt("BNum")); 
                user[1] = rs.getString("seller");
                user[2] = rs.getString("BDate");
                user[3] = rs.getString("Amount"); 
               
                
                
                userData.add(user);
       
      }
      } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
    
    
    
    
    
}

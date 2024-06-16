/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafezen.mvc.dao;

import cafezen.mvc.DB.DBConnection;
import cafezen.mvc.model.itemModel;
import cafezen.mvc.model.sellingModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ITBIN-2211-0165
 */
public class sellingDAO {
    
    
    
    
     public void selling(sellingModel selling2 ) {
        
        
         String sql;
        sql = "INSERT INTO bill1b1 (seller,Amount) VALUES(?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,selling2.getSeller());
            stmt.setString(3,selling2.getAmount());
          
         
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}

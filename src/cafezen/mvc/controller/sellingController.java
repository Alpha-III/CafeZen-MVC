/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafezen.mvc.controller;

import cafezen.mvc.dao.sellingDAO;
import cafezen.mvc.model.sellingModel;
import cafezen.mvc.view.sellingView;
import javax.swing.JOptionPane;

/**
 *
 * @author ITBIN-2211-0165
 */
public class sellingController {
    
    
    
    
    private final sellingView view;
    private  sellingDAO dao;

    public sellingController(sellingView view) {
         this.view = view;
         this.dao = new sellingDAO(); 
        initComponents();
    }

    public sellingController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
      public void selling1(  sellingModel selling2    ) {
        try {
            dao.selling(selling2);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafezen.mvc.model;

/**
 *
 * @author ITBIN-2211-0165
 */
public class itemModel {
    
    
    private String name;
    private  String category;
    private  String price;
    private  String filter;
    
      private int  id;
    
    
  public itemModel()
  {
  }
  
  
  public itemModel(String name,String category, String price,String filter,int id)
  {
      
      
   this.name=name;
   this.category=category;
   this.price=price;
   this.filter=filter;
   
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public String getFilter() {
        return filter;
    }
   
}

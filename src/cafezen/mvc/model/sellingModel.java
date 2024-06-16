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
public class sellingModel {
    
    private String seller;
    private String date;
    private String  amount;
    
    
public sellingModel(){

}  
public sellingModel(String seller,String date,String  amount){
    
    this.seller=seller;
    this.date=date;
    this.amount=amount;

} 

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSeller() {
        return seller;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }
    
  
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
class User1 
{
    private String product_code, product_name, product_type, expiry_date;
 
 public User1(String product_code, String product_name, String product_type, String expiry_date)
 {
      this.product_code = product_code;
      this.product_name = product_name;
      this.product_type = product_type;
      this.expiry_date  = expiry_date; 
 }
 
 public String getproduct_code()
 {
     return product_code;
 }
 
  public String getproduct_name()
 {
     return product_name;
 }
  
   public String getproduct_type()
 {
     return product_type;
 }
   public String getexpiry_date()
 {
     return expiry_date;
 }
   

    
}

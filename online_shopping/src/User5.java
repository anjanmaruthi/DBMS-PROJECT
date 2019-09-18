/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
class User5 
{
     private String order_id, user_id, mobile_id, laptop_id, footwear_id, sportswear_id, quantity, order_date;
 
 
 
      
 

    public User5(String order_id, String user_id, String mobile_id, String laptop_id, String footwear_id, String sportswear_id, String quantity, String order_date) {
      this.order_id      = order_id;
      this.user_id       = user_id;
      this.mobile_id     = mobile_id;
      this.laptop_id     = laptop_id;
      this.footwear_id   = footwear_id;
      this.sportswear_id = sportswear_id;
      this.quantity      = quantity;
      this.order_date    = order_date;
        
    }
 
 public String getorder_id()
 {
     return order_id;
 }
 
  public String getuser_id()
 {
     return user_id;
 }
  public String getmobile_id()
  {
      return mobile_id;
  }
   public String getlaptop_id()
  {
      return laptop_id;
  }
    public String getfootwear_id()
  {
      return footwear_id;
  }
     public String getsportswear_id()
  {
      return sportswear_id;
  }
 
  
   public String getquantity()
 {
     return quantity;
 }
   public String getorder_date()
 {
     return order_date;
 }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
class User6 {
    private String mobile_id, mobile_name, mobile_color, amount;

    public User6(String mobile_id, String mobile_name, String mobile_color,  String amount) {
      this.mobile_id = mobile_id;
      this.mobile_name = mobile_name;
      this.mobile_color  = mobile_color;
      
      this.amount = amount;
        
    }
 
 public String getmobile_id()
 {
     return mobile_id;
 }
 
  public String getmobile_name()
 {
     return mobile_name;
 }
  public String getmobile_color()
  {
      return mobile_color;
  }
  
  
   public String getamount()
 {
     return amount;
 }
   
    
    
}

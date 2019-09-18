/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
public class user7 {
    private String laptop_id, laptop_name, laptop_color, amount;

    public user7(String laptop_id, String laptop_name, String laptop_color,  String amount) {
      this.laptop_id = laptop_id;
      this.laptop_name = laptop_name;
      this.laptop_color  = laptop_color;
      
      this.amount = amount;
        
    }
 
 public String getlaptop_id()
 {
     return laptop_id;
 }
 
  public String getlaptop_name()
 {
     return laptop_name;
 }
  public String getlaptop_color()
  {
      return laptop_color;
  }
  
 
   public String getamount()
 {
     return amount;
 }
}

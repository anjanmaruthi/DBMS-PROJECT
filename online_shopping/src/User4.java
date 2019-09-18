/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
class User4 
{
    private String user_id, card_no, cvv, amount;
 
 public User4(String user_id, String card_no, String cvv, String amount)
 {
      this.user_id = user_id;
     this.card_no = card_no;
     this.cvv = cvv;
     this.amount = amount;
     
 }
 
 public String getuser_id()
 {
     return user_id;
 }
 
  public String getcard_no()
 {
     return card_no;
 }
  
   public String getcvv()
 {
     return cvv;
 }
   public String getamount()
   {
       return amount;
   }
   

    
}

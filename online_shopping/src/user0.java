/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOOMY
 */
class user0 {
    
     private String user_id, user_name, email_id, phone_no, password;
       
     public user0(String user_id, String user_name, String email_id, String phone_no, String password) {
      this.user_id = user_id;
      this.user_name = user_name;
      this.email_id  = email_id;
      this.phone_no = phone_no;
      this.password = password;
    
}
      public String getuser_id()
 {
     return user_id;
 }
 
  public String getuser_name()
 {
     return user_name;
 }
  public String getemail_id()
  {
      return email_id;
  }
  
   public String getphone_no()
 {
     return phone_no;
 }
   public String getpassword()
 {
     return password;
 }
}

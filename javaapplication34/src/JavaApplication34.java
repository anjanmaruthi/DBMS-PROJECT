
package javaapplication34;

import static java.lang.Math.abs;
import java.sql.Connection;
import java.sql.DriverManager;
public class JavaApplication34 {
    
    public static void main(String[] args) {
                conn c=new conn();
                c.connect();
                login l=new login();
                l.loginPage();
        }
        
        
    }
    


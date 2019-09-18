package enumdemo;
import java.util.*;

enum Apple
{
    JONATHAN, GOLDENDEL, REDDEL, WINESAP, CORTLAND
}


public class Enumdemo 
{

    public static void main(String[] args)
    
    {
        Apple ap1, ap2, ap3;
        System.out.println("HERE ARE ALL THE CONTENTS OF THE APPLE ALONG WITH THEIR ORDINAL VALUES");
        for(Apple a : Apple.values())
            System.out.println(" a " + a.ordinal());
        
        ap1  = Apple.REDDEL;
        ap2 = Apple.GOLDENDEL;
        ap3 = Apple.REDDEL;
        
        System.out.println();
        
        if(ap1.compareTo(ap2) < 0)
            System.out.println(ap1 + "comes before" + ap2);
        
        if(ap1.compareTo(ap2) > 0)
            System.out.println(ap1 + "comes after" + ap2);
        
        if(ap1.compareTo(ap3) == 0)
            System.out.println(ap1 + "equals" + ap2);
        
        System.out.println();
        
        if(ap1.equals(ap2))
            System.out.println("Error!!");
        
        if(ap1.equals(ap3))
            System.out.println( ap1 + "Equals" + ap3);
        
        if(ap1==ap2)
            System.out.println( ap1 + "=" + ap3);
    }
    
}

package llinked_list;

import java.util.*;

public class Llinked_List 
{
    public static void main(String[] args) 
    {
        LinkedList <String> L1 = new LinkedList<String>();
        L1.add("F");
        L1.add("B");
        L1.add("D");
        L1.add("E");
        L1.add("C");
        L1.addLast("Z");
        L1.addFirst("A");
        L1.add(1, "A2");
        
        System.out.println("Original contents of linked list are = " + L1);
        
        L1.remove("F");
        L1.remove(2);
        
        System.out.println(" contents of L1 after deleting are = " + L1);
        
        L1.removeFirst();
        L1.removeLast();
        
        System.out.println(" contents of L1 after deleting first and last are = " + L1);
        
        String val = L1.get(2);
        L1.set(2, val + "changed");
        
        System.out.println(" L1 after changing = " + L1);
        
    }
    
}

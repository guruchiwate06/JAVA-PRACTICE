package DSA;

import java.io.*;
import java.util.*;

/**
 *
 * @author Rajguru
 */
public class Double_Linked_list {
    public static void main(String[] args){
        LinkedList<String> x = new LinkedList<> ();
        
        x.addFirst("A");
        x.addFirst("B");
        System.out.println("Linked List:"+x);
        x.addLast("C");
        x.addLast("D");
        
        System.out.println("Updated Linked List:"+x);
        x.add(3,"Z");
        System.out.println("Updated Linked List:"+x);
    }
}

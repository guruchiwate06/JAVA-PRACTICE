/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;
import java.util.*;
/**
 *
 * @author Rajguru
 */
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("A");
        name.add("B");
        int l = name.size();
        //Printing the ArrayList using FOR loop 
        for(int i=0;i<l;i++){
            System.out.println(name.get(i));
        }
        name.set(0,"C");
        System.out.println(name);
        name.add(1,"F");
        
        System.out.println("After replacing the element at index 0"+name);
    }
    
}

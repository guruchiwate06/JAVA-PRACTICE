package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Q27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list  = new ArrayList<>();
        
        System.out.println("Enter the  number of elements:");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the  elements:");
        for(int i=0;i<n;i++){       
        list.add(sc.nextLine());
        }   
        System.out.println("ArrayList elements:");
        System.out.println(list);
       
        System.out.println("Enter the element to add:");
        String newElement = sc.nextLine();
        list.add(newElement);
        
        System.out.println("Enter the index to update:");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter new element:");
        String newValue = sc.nextLine();
        list.set(index, newValue);
        
        System.out.println("Enter the element to remove:");
        String removeElement = sc.nextLine();
        list.remove(removeElement);
        
        System.out.println("Final ArrayList:");
        System.out.println(list);
}
}
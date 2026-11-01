package practice;

import java.util.Scanner;

public class Q19 {

    public static void main(String[] Args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String input = sc.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println("Reversed String:"+reversed);
    }
}

package Diva_2526;
import java.util.*;   // Scanner is in java.util

public class Diva_2526 {
    
    public static void main(String[] args) {
        
        System.out.println("hello world");
        int a = 10;
        int b;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter the number: ");
            b = sc.nextInt();
            
            System.out.println("value of a = " + a);
            System.out.println("value of b = " + b);
        }
    }
}

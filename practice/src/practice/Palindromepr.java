package practice;

import java.util.Scanner;

public class Palindromepr {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n,m,r,rev=0;
            System.out.print("Enter a number :");
            
            try {
                n = sc.nextInt();
                m = n;
                
                while(n>0){
                    r = n % 10; // extracts the last digit 
                    n = n / 10; // remove the last digit
                    rev = rev *10 + r;// builds the number by the last digits
                }
                if (rev == m)
                    System.out.println(m +"is a plaindrome");
                else 
                    System.out.println(m +"is not a plaindrome");
                
            } catch (Exception e){
                    System.out.println("Enter ony numeric data");
            }
            sc.close();
        }
    }


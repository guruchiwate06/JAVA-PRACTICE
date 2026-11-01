package javaapplication1;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Muotiplecatch {
    public static void main(String[] args){
        int a,b,c;
        float d;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter two Numbers:");
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            d= (float)a/b;
            System.out.println("Div"+d);
        }catch(InputMismatchException e){
           System.out.println("Enter only numberic data"+e.toString);
        }catch(Exception e){
            System.out.println("\n Denominator cannot be zero:");
        }
        
    }
}

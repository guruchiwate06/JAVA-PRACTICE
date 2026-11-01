
package javaapplication1;
import java.io.*;
import java.util.Scanner;


public class Arithematic {
    public static void main(String[] Args){
        int a,b,c;
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        try{
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println("Sum = "+c);
        c = a-b;
        System.out.println("Diff = "+c);
        c = a*b;
        System.out.println("Mul = "+c);
        d = (float)a/b;
        System.out.println("Div = "+d);
    }catch(Exception e){
        System.out.println("\nEnter only numeric data");
        System.out.println("\nError :"+e.toString());
    }
    }
}

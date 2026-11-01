package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Combfile1 {
    public class Aritmmetic{
        int a;
        int b;
        public void getData(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            try{
                a = sc.nextInt();
                b = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("\nEnter only numberic data:");
            }
        }
        public void disp(){
            System.out.println("Sum="+(a+b));
            System.out.println("Diff="+(a-b));
            System.out.println("Prod="+(a*b));
            try{
                System.out.println("Div = "+(a/b));
            }catch(ArithmeticException e){
                System.out.println("Second number cannot be zero");
            }
        }
    }
}

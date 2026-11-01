/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_revision;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rajguru
 */
public class Read_Display_data {
    public void add(int x,int y){
        System.out.println("Sum = "+(x+y));
    }
    public static void sub(int x,int y){
        System.out.println("Diff = "+(x-y));
    }
    public static void main(String[] Args){
        int f=1;
        int ch,a,b;
        Scanner sc = new Scanner(System.in);
        Read_Display_data rdd = new Read_Display_data();
        while(f==1){
            System.out.println("Enter two numbers:");
            try{
             a = sc.nextInt();
             b = sc.nextInt();
             if (b==0)
                 throw new ArithmeticException ("2nd number cannot be zero");
             System.out.println("Enter the choice:\n");
             System.out.println("1.Add\n2.Sub");
             System.out.println("3.Mul\n4.Div");
             System.out.println("5.Quit: \t");
             ch = sc.nextInt();
             switch(ch){
                 case 1://Calling non-static method
                     rdd.add(a,b);
                     break;
                 case 2://Calling non-static method
                     sub(a,b);
                     break;
                 case 3://Calling non-static method
                     System.out.println("\nProduct:"+(a*b));
                     break;
                 case 4://Calling non-static method
                     System.out.println("\nDiv:"+(float)(a/b));
                     break;
                 case 5: f=0;
             }
            }catch(InputMismatchException e){
                System.out.println("\nEnter only number");
            }catch(ArithmeticException Exception){
                System.out.println(e.toString());
            }catch(Exception e){
                System.out.println(e.toString());
            }
            
        }
    }
}

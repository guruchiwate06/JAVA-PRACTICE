//Program to imlpemet Exceptoin handling using throw
package divb_2526;

import java.util.Scanner;


public class Inbuilt_Exception {
   
    
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter the marks:");
        x = sc.nextInt();
        if(x>80){
            throw new ArithmeticException("Invalid Marks");
        }else{
            System.out.println("Marks recorded");
   }
           
   }
}

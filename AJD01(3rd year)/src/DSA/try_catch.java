package DSA;

import java.util.*;

/**
 *
 * @author Rajguru
 */
public class try_catch {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            System.out.println("Answer:"+c);
        }catch(InputMismatchException e){
            System.out.println("Inout must be number.");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
    }
}

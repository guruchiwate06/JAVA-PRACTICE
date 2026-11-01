
package practice;

import static java.lang.Character.digit;
import java.util.Scanner;


public class Q18 {
    public static void main(String[] Args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of digits in the number:");
        a = sc.nextInt();
        
        System.out.println("Enter the number:");
        b = sc.nextInt();
        
        int original = b;
        int sum  = 0;
        
        int temp = b;
        
        while(temp!=0){
            int digit = temp%10;
            sum+= Math.pow(digit,a);
            temp/=10;
        }
        System.out.println("Number of digits:"+ a);
        
        if(sum== original){
            System.out.println("The given numnber is amstrong number");
        }
        else{
            System.out.println(original+"is not the amstrong number.");
        }
    }
}

package javaapplication1;
// imort list of packages
// n number of clases
import java.util.Scanner;// for accepting  the input 
public class JavaApplication1 {

    public static void main(String[] args) {
        
        System.out.println("Hello Mfs");// by ln the cursor appears at the end and the line changes
        // creating variables
        int a=10;
        int b;
        Scanner sc = new Scanner(System.in);//Making the object for the scanner class and initilizatoin
        System.out.println("Value of a = "+a);
        System.out.print("Enter the number:");
        b = sc.nextInt();// ctrl + space for the popup list// reading the values changes wiht datatypes like float,nextLine for string, nextDouble.
        System.out.println("The value of entered number:"+b);
        
    }
    
}

//program to implement exceptions using multiple catch
package divb_2526;

import java.util.InputMismatchException;
import java.util.Scanner;
// while writing in paper just import java.util.*

public class ArithException {
    public void add(int a,int b){
        System.out.println("Sum:"+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("Difference:"+(a-b));
    }
    public static void main(String[] args){
        int x,y;
        float d;
        System.out.println("Enter two numers:");
        Scanner sc = new Scanner(System.in);
        try {
        x = sc.nextInt();
        y = sc.nextInt();
        d = x/y;
        ArithException ae = new ArithException();
        ae.add(x,y);
        ae.sub(x,y);
        }catch(InputMismatchException e){
            System.out.println("Enter numeric data");
        }
        catch(ArithmeticException e){
            System.out.println("Second Number cannot be zero");
        }
        finally{
            System.out.println("Finally executed");
        }
    }
}

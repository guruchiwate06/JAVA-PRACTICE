
package DSA;
import java.io.*;
import java.util.*;
/**
 *
 * @author Rajguru
 */
public class UserException  extends Exception{
    UserException(String str){
        System.out.println(str);
    }
}
class DemoEx{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 numbers:");
    try{
    a = sc.nextInt();
    b = sc.nextInt();
    if(b==0){
    throw new UserException("2nd number cannot be 0");
            }
    else{
    System.out.println("Division:"+(a/b));
}
    }catch(InputMismatchException e){
    System.out.println("Statement");
     }catch(UserException e){
          System.out.println("Statement1");
     }
}
}
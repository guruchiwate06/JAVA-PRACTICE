package divb_2526;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathEx extends Exception{
    MathEx(String msg){
        super(msg);
    }   
}
public class DemoMaths {
    
    void ValidateMarks(int x)throws MathEx{
         if(x>100){
            throw new MathEx("Invalid Marks");
        }
    }
    
    public static void main(String[] args) throws MathEx{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        try{
            int m = sc.nextInt();
        DemoMaths k = new DemoMaths();
        k.ValidateMarks(m);
        System.out.println("Valid Marks");
        }catch (InputMismatchException e){
            System.out.println("Exception Handled");
        }
        

    }
}
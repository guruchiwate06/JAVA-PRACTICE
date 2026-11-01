package DSA;


import java.io.*;
import java.util.*;

/**
 *
 * @author Rajguru
 */
public class try_catch_buffer {
    
    public static void main(String[] args){
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int a,b;
    String str;
    System.out.println("Enter two numbers:");
    try{
        str = br.readLine();
        a = Integer.parseInt(str);
        
        b = Integer.parseInt(br.readLine());
        int c = a+b;
        System.out.println("Answer:"+c);
      }catch(IOException e){
          System.out.println("Input error");
      }catch(NumberFormatException e){
          System.out.println("Input error");
      }
    
}
}
package divb_2526;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;// inbuilt paresers 

class Book { // base class or parent class
    int yop;
    float rate;
    public void disp1(){
        System.out.println("Rate : "+rate);
        System.out.println("Year of publishing : "+yop);
    }
    
    
}
public class JavaRef extends Book { // extends book(Inherit the properties of the parent class book)
    String title,str; 
   // Scanner sc = new Scanner(System.in);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    public void get(){
        try{
            System.out.println("Enter Title :");
            title = br.readLine();
        
            System.out.println("Enter Rate :");
            rate = Float.parseFloat(br.readLine());
        
            System.out.println("Enter Year of publishing :");
            str = br.readLine();
            yop = Integer.parseInt(str);
        }catch(Exception  e){
            System.out.println("Enter valid data");
            //optional
            System.out.println("Error : "+e.toString());
        }
            
    }
    public void dips2(){
            System.out.println("Title: "+title);
            disp1();
    }
    private void developer(){
        
    }
    

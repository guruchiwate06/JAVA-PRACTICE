/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Questions;
import java.util.*;
/**
 *
 * @author Rajguru
 */
interface Squares{
    void cal(int a);
}
public class Q1_Lambda_Fun {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Squares s = (a)->{
        System.out.println("Square:"+(a*a));
    };
        
        s.cal(b);
    }
}

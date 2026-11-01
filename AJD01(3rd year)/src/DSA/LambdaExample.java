/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;
interface Welcome{
    void disp();
}
interface Welcome2{
    void demo(int a,int b);
}
public class LambdaExample{
    public static void main(String[] Args){
        Welcome x = ()->{
            System.out.println("Implementing Lambda Function");
        };
        x.disp();
        Welcome2 y = (a,b)->{
            System.out.println("Sum:"+(a+b));
        };
        y.demo(10,20);
    }
           

}

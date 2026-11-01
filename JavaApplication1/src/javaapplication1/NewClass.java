
package javaapplication1;

public class NewClass {
    // static function
    public static void x(){
        System.out.println("Its from x");
    }
    public void y(){
        System.out.println("Its from y");
        x();
    }
    public static void main(String[] Args){
        NewClass a = new NewClass();
        a.y();
    }
}
// A non-static function cannot be call from the static reference
// Hence we cannot call method y() from main method
// However static function can be called form other static method 
// Also a non-static function can call static function
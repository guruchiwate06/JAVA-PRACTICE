
package newpackage01;



    

public class Inheritance {
    public static void main(String a[]){
        Calcs obj = new Calcs();
        
        int r1 = obj.adds(3,4);
        int r2 = obj.subs(3,4);
        
        System.out.println(r1 + " " + r2);
        
        advCalc obj1 = new advCalc();
        int r3 = obj1.mul(3,4);
        int r4 = obj1.div(3,4);
        
        System.out.println(r3 + " " + r4);
    }
}

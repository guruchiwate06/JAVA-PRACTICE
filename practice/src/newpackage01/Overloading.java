package newpackage01;
// Here we can include different types of perametrs for one method is calld as method overloading
class Calc
{
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2){
        return n1 + n2 ;
    }
    public double add(double n1, int n2){
        return n1 + n2 ;
    }
}
public class Overloading {
    public static void main(String a[]){
        Calc obj = new Calc();
        int r1 = obj.add(11, 3);
        System.out.println(r1);
    }
}

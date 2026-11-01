package practice;

public class Q25 {
    void Show(){
        System.out.println("This is parent class");
    }
}
class Childy extends Q25{
    @Override
    void Show(){
        System.out.println("This is child class");
    }
    public static void main(String[] args){
    Q25 obj = new Childy();
    obj.Show();
}
}

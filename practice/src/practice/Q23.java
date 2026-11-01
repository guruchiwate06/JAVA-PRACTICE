package practice;

public class Q23 {
    int a = 10;
    void ShowParent(){
        System.out.println("This is parent class");
        System.out.println("The vlaue of a is:"+a);
    }
}
class child extends Q23{
    int b = 20;
    void showChild(){
        System.out.println("This is child class");
        System.out.println("Value of b:");
    }
    public static void main(String[]args){
        child obj = new child();
        
        obj.ShowParent();
        obj.showChild();
    }
}

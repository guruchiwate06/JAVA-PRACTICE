package practice;

public class Q24 {
    void ShowGP(){
        System.out.println("This is GP class");
    }
}
class Parents extends Q24{
    void ShowParents(){
         System.out.println("This is Parents class");
    }
}
class ChildX extends Parents{
    void ShowChildX(){
         System.out.println("This is Child class");
    }
    public static void main(String[] args){
    ChildX obj = new ChildX();
    
    obj.ShowGP();
    obj.ShowParents();
    obj.ShowChildX();
    
}
}



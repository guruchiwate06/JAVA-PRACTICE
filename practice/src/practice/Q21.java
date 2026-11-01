package practice;

public class Q21 {
    int id;
    String name;
    Q21(int i,String n){
        id = i;
       name = n;
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
    
    public static void main(String[] args){
            Q21 s1 = new Q21(201,"Raj");
            Q21 s2 = new Q21(202,"Guru");
            
            s1.display();
            s2.display();
    }
    

   
}

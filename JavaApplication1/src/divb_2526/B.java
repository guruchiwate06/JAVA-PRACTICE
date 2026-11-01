package divb_2526;


class FunctionOverloadingandOverriding {
    void add(){
        System.out.println("function from Parent Class");
    }
}
public class B extends FunctionOverloadingandOverriding{
    //overloaded function
    void add(int a){
        System.out.println("Overloaded Function");
    }
    void add(){
        System.out.println("Function from child class");
    }
    


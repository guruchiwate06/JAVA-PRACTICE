
public class Notes {
    
}

// a method without a body is said to be an abstract method
//in java an abstract metod is declared by using the keyword abstract
//Syntax :
//abstract <return-type> <function-name>(parameters);
//EG:
//Eg:
//abstract void payment(int x);
//abstract void add():
//: if a class consist of  even a single abstract method then the class becomes abstract.
//such a class is declared usnig the keyword abstract eg:
//abstract class Mode{
//      abstract void payment(int x);
//void disp(){
//      System.out.println("Hello World");
//   }
//}
// one cannot create an object of abstract class in java
//ie. Mode p = new Mode(); is not permitted .
//Hence in order to use methods declared in mode one need to create a class that would exten the Mode.
//eg. class UPI extends Mode{
//..........
//}
//NOw in the chlid class all the abstract methods of the parent class must be implimented else the child class also become an abstract class ans no object of the chilkd class can be created.
//interface abstract
//in java the interface is the blueprint consisting of only abstract methods and final(const.) attributes 
// Syntax:
// interface <interface-name>{
//    <return-type><method 1>(list of para);
//    <return-type><method 2>(list of para);
//    <data-type><attribute1>=<values>;
//    <data-type><attribute2>=<values>;
//}
//Example:
//interface sample{
// void show();
// void dinsp();
//}
// if any of the method of the interface is not implimented in the newly created class the the newly created class becomes the abstract class 
//EXCEPTON HANDLING
//if i want to call exceptons (inbuilt or coustom) we use throw new 

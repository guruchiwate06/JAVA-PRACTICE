package divb_2526;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    public void getDetails(){
        System.out.println("Enter name and age");
        Scanner sc = new Scanner(System.in);
        try {
            name = sc.nextLine();   
            age = sc.nextInt();     
        } catch (Exception e) {
            System.out.println("Age should be numeric");
        }
    }

    public void dispdetails(){
        System.out.println(name + " is " + age + " years old");
    }
}

package divb_2526;

import java.util.Scanner;

public class sizeofbox {
    int s,area,volume;

    public void getDetails(){
        System.out.println("Enter the length of side");
        Scanner sc = new Scanner(System.in);
        try {   
            s = sc.nextInt();  
            area = s*s;
            volume = s*s*s;
        } catch (Exception e) {
            System.out.println("size should be numeric");
        }
    }

    public void dispdetails(){
        System.out.println(area + " is the area of box and " + volume + "is the volume of the box");
    }
}

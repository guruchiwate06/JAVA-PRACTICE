package Diva_2526;

import java.util.Scanner;
import java.util.InputMismatchException;  // <-- Add this import

public class Arithmetic {
    public static void main(String[] Args) {

        int a, b;
        float d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        try {
            a = sc.nextInt();
            b = sc.nextInt();

            d = (float) a / b;
            System.out.println("div = " + d);

        } catch (InputMismatchException e) {
            System.out.println("Enter only numeric data");
        } catch (ArithmeticException e) {
            System.out.println("Denominator cannot be zero");
        }
    }
}

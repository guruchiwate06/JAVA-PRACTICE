package Diva_2526;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, m, r, rev = 0;

        System.out.println("Enter the number:");

        try {
            n = sc.nextInt();
            m = n;

            while (n > 0) {
                r = n % 10;        // extract last digit
                n = n / 10;        // remove last digit
                rev = rev * 10 + r; // build reversed number
            }

            if (rev == m)
                System.out.println(m + " is a Palindrome number");
            else
                System.out.println(m + " is not a Palindrome number");

        } catch (Exception e) {
            System.out.println("Enter only numeric data!");
        }

        sc.close();
    }
}

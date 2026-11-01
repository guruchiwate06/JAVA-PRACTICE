package practice;

import java.util.Scanner;

public class CN_EXP04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input with validation
        int a = getOctet(sc, 1);
        int b = getOctet(sc, 2);
        int c = getOctet(sc, 3);
        int d = getOctet(sc, 4);

        // Display IP Address
        System.out.println("Entered IP address: " + a + "." + b + "." + c + "." + d);

        // Invalid first-octet cases
        if (a == 0 || a == 127) {
            System.out.println("Invalid IP address for classification");
            sc.close();
            return;
        }

        // Identify IP class
        if (a >= 1 && a <= 126) {
            System.out.println("Class A");
            System.out.println("Network ID: " + a);
            System.out.println("Host ID: " + b + "." + c + "." + d);

        } else if (a >= 128 && a <= 191) {
            System.out.println("Class B");
            System.out.println("Network ID: " + a + "." + b);
            System.out.println("Host ID: " + c + "." + d);

        } else if (a >= 192 && a <= 223) {
            System.out.println("Class C");
            System.out.println("Network ID: " + a + "." + b + "." + c);
            System.out.println("Host ID: " + d);

        } else if (a >= 224 && a <= 239) {
            System.out.println("Class D (Multicast)");
            System.out.println("No Network or Host ID");

        } else if (a >= 240 && a <= 255) {
            System.out.println("Class E (Experimental)");
            System.out.println("No Network or Host ID");
        }

        sc.close();
    }

    // Method to validate each octet
    static int getOctet(Scanner sc, int n) {
        int octet;
        while (true) {
            System.out.print("Enter octet " + n + ": ");
            octet = sc.nextInt();

            if (octet >= 0 && octet <= 255) {
                return octet;
            } else {
                System.out.println("Invalid! Octet must be between 0 and 255.");
            }
        }
    }
}

// Write a Java program to convert a decimal number to an octal number.

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int deci = sc.nextInt();

        deci_to_octal(deci);
        sc.close();
    }

    public static void deci_to_octal(int deci) {
        if (deci == 0) {
            System.out.println("Octal number is: 0");
            return;
        }

        String octal = "";
        while (deci > 0) {
            int rem = deci % 8;
            octal = rem + octal;
            deci /= 8;
        }

        System.out.println("Octal number is: " + octal);
    }
}


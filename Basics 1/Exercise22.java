// Write a Java program to convert a binary number to a decimal number.

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        int bin = sc.nextInt();

        int decimal = bin_to_deci(bin);
        if (decimal != -1) {
            System.out.println("Decimal Number: " + decimal);
        }
    }

    public static int bin_to_deci(int bin) {
        int deci = 0;
        int exponent = 0;

        while (bin > 0) {
            int rem = bin % 10;

            if (rem > 1) {
                System.out.println("Not a binary number!!");
                return -1;
            }

            deci += rem * (1 << exponent);  // same as 2^exponent
            exponent++;
            bin /= 10;
        }
        return deci;
    }
}

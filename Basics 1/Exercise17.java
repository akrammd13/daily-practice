import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input binary numbers as Strings
        System.out.print("Input first binary number: ");
        String bin1 = sc.nextLine();

        System.out.print("Input second binary number: ");
        String bin2 = sc.nextLine();

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        // Add the numbers
        int sum = num1 + num2;

        // Convert result back to binary string
        String result = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + result);

        sc.close();
    }
}







/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
*/
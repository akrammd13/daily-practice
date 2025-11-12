// Write a Java program that displays the sum of n odd natural numbers.

import java.util.Scanner;

public class Exercise15 {

    public static void sumOfOddNumbers(int n) {
        int sum = 0;
        for(int i=1; i<n*2; i+=2){
            sum += i;
        }

        System.out.println("Sum of " + n + " odd numbers : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        sumOfOddNumbers(n);
        sc.close();
    }
}

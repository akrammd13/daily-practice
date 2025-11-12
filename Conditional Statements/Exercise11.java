// Write a Java program to display n terms of natural numbers and their sum.

import java.util.Scanner;

public class Exercise11 {

    public static void printNaturalNumbersAndSum(int num){
        int sum = 0;
        for(int i=1; i<=num; i++){
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nSum : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        printNaturalNumbersAndSum(n);
        sc.close();
    }
}

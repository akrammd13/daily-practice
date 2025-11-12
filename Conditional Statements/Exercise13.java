// Write a Java program to display the cube of the given number up to an integer.

import java.util.Scanner;

public class Exercise13 {

    public static void cubeOfNumbersUpToGivenNumber(int n){
        for(int i=1; i<=n; i++){
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i*i*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();
        cubeOfNumbersUpToGivenNumber(n);
        sc.close();
    }
}

// Write a Java program to display the pattern like a right angle triangle with a number.

import java.util.Scanner;

public class Exercise16 {
    
    public static void rightAngleTriangleOfNumbers(int n) {

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = sc.nextInt();
        rightAngleTriangleOfNumbers(n);
        sc.close();
    }
}

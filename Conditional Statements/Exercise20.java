/*
20. Print Floyd's Triangle

Write a Java program to print Floyd's Triangle.

Test Data
Input number of rows : 5
Expected Output :

Input number of rows :  5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/

import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:  ");
        int rows = sc.nextInt();
        sc.close();
        int n = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
    
}

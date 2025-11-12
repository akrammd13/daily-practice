// Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.Scanner;

public class Exercise12 {


    public static void printSumAndAverage(int[] arrNum){
        int sum = 0;
        for(int i=0; i<arrNum.length; i++){
            sum += arrNum[i];
        }

        System.out.println("Sum = " + sum + " and Average = " + sum/5);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 5 numbers: \n");
        int[] arrNum = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter Number " + (i+1) + " : ");
            arrNum[i] = sc.nextInt();
        }
        
        printSumAndAverage(arrNum);
        sc.close();
    }
}

// Write a Java program to convert an integer number to a binary number.

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        int decimal_num = sc.nextInt();

        //created a user defined method and logic is applied using basic rules
        Dec2Bin(decimal_num);

        // in-built method is used, produces same result
        String a= Integer.toBinaryString(decimal_num);
        System.out.println("(in-bilut mathod) Binary number is: " + a);
        
        
    }

    public static void Dec2Bin(int decimal_num){
        String binary = "";
        while(decimal_num != 0){
            int rem = decimal_num % 2;
            binary = rem + binary;
            decimal_num /= 2;
        }

        System.out.println("(User-defined method)Binary number is: " + binary);
    }
}

// Write a Java program to convert a decimal number to a hexadecimal number.

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        int decimal_num = sc.nextInt();
        deci_to_hexa(decimal_num);

    }

    public static void deci_to_hexa(int deci){

        String hexa = "";
        char[] alphabets = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(deci != 0){
            int rem = deci % 16;
            hexa = alphabets[rem] + hexa;
            deci /= 16;
        }

        System.out.println("Hexadecimal number is : " + hexa);
    }
    
}

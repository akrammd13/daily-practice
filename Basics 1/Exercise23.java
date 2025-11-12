//Write a Java program to convert a binary number to a hexadecimal number.

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a Binary Number: ");
        int bin = sc.nextInt();
        bin_to_hexa(bin);
    }

    public static void bin_to_hexa(int bin) {
        int size = bin.length();
        int blank = 4 - (size % 4);
        if(blank > 0){
            String prefix_str= "";
            for(int i=1;i<=blank; i++){
                prefix_str += "0";
            }
            bin = prefix_str + bin;
        }

        int loop_count = (int)bin / 4;
    }
}

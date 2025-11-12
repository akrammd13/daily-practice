// Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        sc.close();
        
        System.out.println(year + " is " + checkLeapYear(year));
    }

    public static String checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return "Leap Year";
        } else {
            return "Not a Leap Year";
        }
    }
}

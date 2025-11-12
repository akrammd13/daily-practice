// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;

public class Exer1 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        if(num>0){System.out.println("Positive Number");}
        else if(num<0){System.out.println("Negative Number");}
        else {System.out.println("Number is Zero!");}

    }
    
}

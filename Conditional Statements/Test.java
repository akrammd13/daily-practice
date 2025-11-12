
import java.util.Scanner;

public class Test {
    public static void printNaturalNumbers(int n) {
        System.out.print("First " + n + " natural numbers are: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Optional: main just to test this file standalone
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printNaturalNumbers(n);
        sc.close();
    }
    
}

import java.util.Scanner;

public class Exercise2 {
    public static float avg_of_three_nums(int a, int b, int c){
        float result = (a + b + c) / 3;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Input the second number : ");
        int n2 = sc.nextInt();
        System.out.print("Input the third number : ");
        int n3 = sc.nextInt();
        System.out.println("The average value is : " + avg_of_three_nums(n1, n2, n3));
        sc.close();
    }
}


/*
Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
*/
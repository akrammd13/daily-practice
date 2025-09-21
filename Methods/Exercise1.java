
import java.util.Scanner;

class Exercise1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the first number : ");
        int n1 = sc.nextInt();
        System.out.println("Input the second number : ");
        int n2 = sc.nextInt();
        System.out.println("Input the third number : ");
        int n3 = sc.nextInt();

        float r;

        if(n1<n2 && n1<n3){
            r = n1;
        }else if(n2<n3){
            r = n2;
        }else{
            r = n3;
        }

        System.out.println("The smallest value is " + r);

    }
}




/*
Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
*/
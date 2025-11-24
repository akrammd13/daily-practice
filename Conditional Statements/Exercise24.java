import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:  ");
        int rows = sc.nextInt();
        sc.close();
        
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("@");
            }
            System.out.println();
        }

    }
}




/*
24. Right-Angle Triangle with @ Symbols

Write a Java program to generate the following @'s triangle.

Test Data
Input the number: 6
Expected Output :

      @                                                  
     @@                                                  
    @@@                                                  
   @@@@                                                  
  @@@@@                                                  
 @@@@@@
*/
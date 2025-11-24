import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:  ");
        int rows = sc.nextInt();
        sc.close();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=rows; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
23. Reverse * Triangle

Write a Java program to generate the following * triangles.

Test Data
Input the number: 6
Expected Output :

******                                                   
 *****                                                   
  ****                                                   
   ***                                                   
    **                                                   
     * 
*/
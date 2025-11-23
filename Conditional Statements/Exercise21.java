/*21. Display Diamond Pattern
Write a Java program to display the pattern like a diamond.
Test Data
Input number of rows (half of the diamond) : 7
Expected Output :

                                                                                 
      *                                                                          
     ***                                                                         
    *****                                                                        
   *******                                                                       
  *********                                                                      
 ***********                                                                     
*************                                                                    
 ***********                                                                     
  *********                                                                      
   *******                                                                       
    *****                                                                        
     ***                                                                         
      *                    */

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:  ");
        int rows = sc.nextInt();
        sc.close();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=rows-1; i>=1; i--){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int k=(2*i-1);k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

































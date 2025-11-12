/*Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
The pattern like :
1
2 3
4 5 6
7 8 9 10 */

import java.util.Scanner;

public class Exercise18 {
    public static void rightAngleTriangleOfNumbersIncreasedBy1(int n) {
        int x = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = sc.nextInt();
        rightAngleTriangleOfNumbersIncreasedBy1(n);
        sc.close();
    }
}

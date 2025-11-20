/*
Print a 10x10 grid of dashes
Write a Java program to print the following grid.
*/


public class Exercise03 {
    public static void main(String[] args) {
        for(int i=0; i<=10;i++){
            for(int j=0;j<=10;j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}

// Write a Java program to sum values of an array.

public class Exercise02 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int item : arr){
            sum += item;
        }

        System.out.println(sum);
    }
}

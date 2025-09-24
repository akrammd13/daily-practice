
import java.util.Scanner;

public class Exercise3 {

    public static String middle(String str) {
        int position, length;
        if (str.length() % 2 != 0) {
            position = str.length() / 2;
            length = 1;
        } else {
            position = (str.length() / 2) - 1;
            length = 2;
        }

        return str.substring(position, position + length);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a string: ");
            String str = sc.nextLine();

            System.out.println("The middle character in the string: " + middle(str));
        }

    }
}


/*
Write a Java method to display the middle character of a string.
Note: a) If the length of the string is odd there will be one middle characters.
b) If the length of the string is even there will be two middle character.
Test Data:
Input a string: 350
Expected Output:

                                                                          
The middle character in the string: 5
*/

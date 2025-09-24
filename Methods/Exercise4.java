import java.util.Scanner;

public class Exercise4 {

    public static int count_vowel(String str){
        String listOfVowels = "aeiouAEIOU";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(listOfVowels.indexOf(str.charAt(i)) != -1){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a string: ");
            String str = sc.nextLine();

            System.out.println("The middle character in the string: " + count_vowel(str));
        }
    }
}

// Write a Java method to count all vowels in a string.
// Test Data:
// Input the string: w3resource
// Expected Output:

// Number of  Vowels in the string: 4
/*
 * Project: Count Letters
 * Author: Ryan Brinkman
 * Date: 12/09/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/count-letters/
 */

// Import necessary libraries
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        // Initialize variables
        int[] count = new int[91];
        String phrase;
        char[] letters;
    
        Scanner scanner = new Scanner(System.in); // Create scanner object
    
        // Prompt the user for input
        System.out.print("Enter a phrase: ");
        phrase = scanner.nextLine().toUpperCase();
    
        scanner.close(); // Close the scanner object
    
        // Count the occurrences of each letter in the phrase
        letters = phrase.toCharArray();
        for (char letter : letters) {
            if (letter >= 'A' && letter <= 'Z') {
                count[letter]++;
            }
        }
    
        // Print the results
        for (int i = 'A'; i <= 'Z'; i++) {
            if (count[i] > 0) {
                System.out.printf("\n %c = %d ", (char)i, count[i]);
            }
        }
    }
}
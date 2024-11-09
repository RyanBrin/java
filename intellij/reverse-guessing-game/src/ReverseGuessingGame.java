/*
 * Ryan Brinkman
 * Reverse Guessing Game
 * Page None
 * 9/16/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class ReverseGuessingGame
{
    public static void main(String[] args)
    {
        // Declare variables
        int userNumber;
        int computerGuess;
        int low = 1;
        int high = 20;
        int attempts = 0;
        char feedback;

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Obtain user input
        System.out.print("Input a number between 1 and 20: ");
        userNumber = scanner.nextInt();

         do
         {
             //  Generate computer guess
             computerGuess = (low + high) / 2;
             attempts++;

             // Display computer guess
             System.out.println("Computer guesses: " + computerGuess);

             // Get user feedback and update range
             System.out.print("Enter 'H' for too high, 'L' for too low, or 'W' for correct: ");
             feedback = scanner.next().toUpperCase().charAt(0);

             if (feedback == 'H')
             {
                 high = computerGuess - 1;

             }
             else if (feedback == 'L')
             {
                 low = computerGuess + 1;

             }
         }
         while (feedback != 'W');

        scanner.close(); // Close the scanner

         // Display results
         System.out.println("The computer guessed your number in " + attempts + " attempts!");

    }
}
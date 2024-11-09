/*
 * Ryan Brinkman
 * Guessing Game
 * Page 125
 * 9/16/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args)
    {
        // Declare variables
        int randomNumber;
        int guess;
        int attempts = 0;

        // Generate random number
        randomNumber = (int) (Math.random() * 20) + 1;

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        do
        {
            // Obtain user input
            System.out.print("Enter a number between 1 and 20: ");
            guess = scanner.nextInt();

            attempts++;

            if (guess != randomNumber)
            {
                if (guess > randomNumber)
                {
                    System.out.println("Your guess is too high!");
                }
                else
                {
                    System.out.println("Your guess is too low!");

                }

                System.out.println();

            }
        }
        while (guess != randomNumber);

        scanner.close(); // Close the scanner

        // Display results
        System.out.println();
        System.out.println("Computer's number: " + randomNumber);
        System.out.println("You guessed the correct number in " + attempts + " attempts!");

    }
}

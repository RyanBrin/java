/*
 * Ryan Brinkman
 * Math Tutor
 * Page 123
 * 9/10/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class MathTutor
{
    public static void main(String[] args)
    {
        // Declare variables
        int num1;
        int num2;
        int userAnswer;
        int correctAnswer;

        Scanner slave = new Scanner(System.in); // Create scanner object

        // Generate random numbers
        num1 = (int) (Math.random() * 10) + 1;
        num2 = (int) (Math.random() * 10) + 1;

        // Display problem
        System.out.println("Solve the following problem:");
        System.out.println(num1 + " + " + num2 + " = ?");

        // Obtain user input
        userAnswer = slave.nextInt();

        slave.close(); // Close the scanner

        // Calculate correct answer
        correctAnswer = num1 + num2;

        // Check user answer and display
        switch (userAnswer - correctAnswer)
        {
            case 0:
                System.out.println("Correct!");
                break;
            default:
                System.out.println("Incorrect! The correct answer is " + correctAnswer);
                break;

        }
    }
}

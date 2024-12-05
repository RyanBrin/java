/*
 * Project: Dice Rolls
 * Author: Ryan Brinkman
 * Date: 12/05/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/dice-rolls-v2/
 */

// Import necessary libraries
import java.util.Scanner;

public class DiceRolls {
    public static void main(String[] args) {
       int[] dice = new int[13];

       int rolls;
       int die1;
       int die2;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the number of rolls: ");
       rolls = scanner.nextInt();

       System.out.println("\nResults:");

       for (int i = 1; i <= rolls; i++) {
           die1 = (int) (Math.random() * 6) + 1;
           die2 = (int) (Math.random() * 6) + 1;

           int location = die1 + die2;
           dice[location]++;
       }

       for (int j = 2; j <= 12; j++) {
           System.out.println(j + " - " + dice[j]);
       }

    }
}
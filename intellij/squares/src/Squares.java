/*
 * Project: Squares
 * Author: Ryan Brinkman
 * Date: 12/05/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/squares/
 */

// Import necessary libraries
import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
            return;
        }

        int[] square = new int[size];

        System.out.println("Index\tValue");

        for (int i = 0; i < square.length; i++)
            square[i] = i*i;

        for (int j = 0; j < square.length; j++)
            System.out.println(j + " " + square[j]);
    }
}
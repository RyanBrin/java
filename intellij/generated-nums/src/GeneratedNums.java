/*
 * Project: Generated Nums
 * Author: Ryan Brinkman
 * Date: 12/10/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/generated-nums/
 */

import java.util.Scanner;

public class GeneratedNums {
    public static void main(String[] args) {
        int indexAmount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of indexes: ");
        indexAmount = scanner.nextInt();

        int[] numbers = new int[indexAmount];

        for (int i = 0; i < indexAmount; i++) {
            int number = i + (i / 10) + (i % 10);
            numbers[i] = number;
        }

        scanner.close();

        System.out.println("\nIndex \tGenerated Number");
        for (int i = 0; i < indexAmount; i++) {
            System.out.printf("%d \t\t%d%n", i , numbers[i]);
        }
    }
}
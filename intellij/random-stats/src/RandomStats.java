/*
 * Project: Random Stats
 * Author: Ryan Brinkman
 * Date: 12/11/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/random-stats/
 */

import java.util.Random;
import java.util.Scanner;

public class RandomStats {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of random numbers to generate: ");
        int amount = scanner.nextInt();

        int[] digitCount = new int[10];

        for (int i = 0; i < amount; i++) {
            int number = random.nextInt(10);
            digitCount[number]++;
        }

        System.out.println("\nDigit Count");
        System.out.println("--------------------------------");
        System.out.println("Random Numbers Generated: " + amount);
        System.out.println("--------------------------------");
        System.out.println("Number \tOccurrences");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d \t\t%d%n", i, digitCount[i]);
        }
    }
}

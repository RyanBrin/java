/**
 * Project: Eggs
 * Author: Ryan Brinkman
 * Date: 9/10/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/eggs/
 */

import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of eggs purchased: ");
        int totalEggs = scanner.nextInt();
        scanner.close();

        double totalCost = calculateEggCost(totalEggs);
        System.out.printf("The bill is equal to: $%.2f%n", totalCost);
    }

    private static double calculateEggCost(int eggs) {
        int dozens = eggs / 12;
        int remainingEggs = eggs % 12;
        double pricePerDozen;

        if (dozens < 4) {
            pricePerDozen = 0.50;
        } else if (dozens < 6) {
            pricePerDozen = 0.45;
        } else if (dozens < 11) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }

        return (dozens * pricePerDozen) + ((remainingEggs * pricePerDozen) / 12);
    }
}
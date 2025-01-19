/*
 * Project: Investment
 * Author: Ryan Brinkman
 * Date: January 19, 2025
 * Description: A simple program that tells the user how long it will take to invest a certain amount of money at a fixed interest rate of 7.5%.
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/password/
 */

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        final double INTEREST_RATE = 0.0475;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: $");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter the investment goal amount: $");
        double investmentGoal = scanner.nextDouble();

        scanner.close();

        int years = 0;
        double investmentAmount = initialInvestment;

        System.out.println("\nYear  | Investment Value ($)");
        System.out.println("----------------------------");
        System.out.printf("%04d  | $%,.2f\n", years, investmentAmount);

        while (investmentAmount < investmentGoal) {
            investmentAmount += investmentAmount * INTEREST_RATE;
            years++;
            System.out.printf("%04d  | $%,.2f\n", years, investmentAmount);
        }

        System.out.printf("\nIt will take %d years to reach the investment goal of $%,.2f at an annual interest rate of %.2f%%.\n",
                years, investmentGoal, INTEREST_RATE * 100);
    }
}
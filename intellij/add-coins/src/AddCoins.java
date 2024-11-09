/*
 * Ryan Brinkman
 * Add Coins
 * Page 176
 * 10/30/2024
 */

import java.util.Scanner;

public class AddCoins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your total coins");

        System.out.print("Quarters: ");
        int quarters = scanner.nextInt();

        System.out.print("Dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Pennies: ");
        int pennies = scanner.nextInt();

        scanner.close();

        String result = getDollarAmount(quarters, dimes, nickels, pennies);

        System.out.println("Total: " + result);
    }

    public static String getDollarAmount(int quarters, int dimes, int nickels, int pennies) {
        double total = (quarters * 0.25) + (dimes * 0.1) + (nickels * 0.05) + (pennies * 0.01);
        return String.format("$%.2f", total);
    }
}
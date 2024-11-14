/*
 * Project: Bank
 * Author: Ryan Brinkman
 * Date: 11/13/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/bank/
 */

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Create account objects with initial balance and customer details
        Account account0 = new Account(250, "Mario", "Munoz", "110 Glades Rd", "Myron", "FL", "33450");
        Account account1 = new Account(1000000, "Ryan", "Brinkman", "4825 Granite Dr", "Bismarck", "ND", "58503");

        // Print account details to console
        System.out.println(account0);
        System.out.println(account1);

        // Deposit user custom amount
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: $");
        double depositAmount = scanner.nextDouble();
        account0.deposit(depositAmount);
        System.out.println("New balance: " + account0.getFormattedBalance());

        // Withdraw user custom amount
        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();
        account0.withdrawal(withdrawalAmount);
        System.out.println("New balance: " + account0.getFormattedBalance());

        // Prompt user to change address
        System.out.print("Change address? (yes/no): ");
        String changeAddress = scanner.next();
        if (changeAddress.equalsIgnoreCase("yes")) {
            System.out.print("Enter new street: ");
            String newStreet = scanner.next();
            System.out.print("Enter new city: ");
            String newCity = scanner.next();
            System.out.print("Enter new state: ");
            String newState = scanner.next();
            System.out.print("Enter new zip code: ");
            String newZip = scanner.next();
            account0.changeAdress(newStreet, newCity, newState, newZip);
            System.out.println("Address changed successfully.");
        }

        scanner.close();
    }
}

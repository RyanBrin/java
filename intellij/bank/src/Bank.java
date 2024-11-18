/*
 * Project: Bank
 * Author: Ryan Brinkman
 * Date: 11/13/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/bank/
 */

// Import necessary packages

import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // Create account objects with initial balance and customer details
        Account[] accounts = {
                new Account(25000, "Mario", "Munoz", "110 Glades Rd", "Myron", "FL", "33450"),
                new Account(100000, "Ryan", "Brinkman", "4825 Granite Dr", "Bismarck", "ND", "58503"),
                new Account(5000, "Alice", "Johnson", "123 Elm St", "Springfield", "IL", "62701"),
                new Account(7500, "Bob", "Smith", "456 Oak St", "Chicago", "IL", "60601"),
                new Account(10000, "Charlie", "Brown", "789 Pine St", "New York", "NY", "10001"),
                new Account(12500, "Diana", "Ross", "101 Maple St", "Los Angeles", "CA", "90001"),
                new Account(15000, "Edward", "Norton", "202 Birch St", "San Francisco", "CA", "94101"),
                new Account(17500, "Fiona", "Apple", "303 Cedar St", "Seattle", "WA", "98101"),
                new Account(20000, "George", "Harrison", "404 Walnut St", "Austin", "TX", "73301"),
                new Account(22500, "Helen", "Mirren", "505 Spruce St", "Denver", "CO", "80201"),
                new Account(25000, "Ian", "McKellen", "606 Chestnut St", "Boston", "MA", "02101"),
                new Account(27500, "Jane", "Doe", "707 Hickory St", "Miami", "FL", "33101"),
                new Account(30000, "Kevin", "Spacey", "808 Sycamore St", "Atlanta", "GA", "30301"),
                new Account(32500, "Laura", "Linney", "909 Willow St", "Dallas", "TX", "75201"),
                new Account(35000, "Mark", "Ruffalo", "1010 Aspen St", "Phoenix", "AZ", "85001"),
                new Account(37500, "Nancy", "Pelosi", "1111 Birch St", "Las Vegas", "NV", "89101"),
                new Account(40000, "Oliver", "Stone", "1212 Cedar St", "Portland", "OR", "97201"),
                new Account(42500, "Pamela", "Anderson", "1313 Elm St", "Minneapolis", "MN", "55401"),
                new Account(45000, "Quentin", "Tarantino", "1414 Oak St", "Detroit", "MI", "48201"),
                new Account(47500, "Rachel", "McAdams", "1515 Pine St", "Philadelphia", "PA", "19101"),
                new Account(50000, "Sam", "Jackson", "1616 Maple St", "Houston", "TX", "77001")
        };

        // Declaration of variables
        Scanner scanner = new Scanner(System.in);
        int totalTransactions = 0;
        double totalDeposits = 0;
        double totalWithdrawals = 0;

        // Print total money in the bank at start
        double totalBankMoneyStart = calculateTotalBankMoney(accounts);
        System.out.println("Total money in the bank at start: " + formatCurrency(totalBankMoneyStart));

        // Main transaction loop
        while (true) {
            // Get account number from user
            System.out.println("\nSelect an account (1-20) or 0 to exit:");
            int accountIndex = scanner.nextInt() - 1;

            // Exception handler for when user enters '0' (0-1=-1)
            if (accountIndex == -1)
                break;

            // Get account number from user until valid account number is provided
            if (accountIndex < 0 || accountIndex >= accounts.length) {
                System.out.println("Invalid account number.");
                continue;
            }

            // Get selected account information
            Account selectedAccount = accounts[accountIndex];

            // Transaction loop
            while (true) {
                System.out.println("\nAccount Information: " + "\nID: " + (accountIndex + 1) + " \n" + selectedAccount.getName());
                System.out.println("\nAccount Menu:");
                System.out.println("1. Print balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Change address");
                System.out.println("5. Change phone");
                System.out.println("6. Back to account selection");
                int choice = scanner.nextInt();

                // Switch state to handle user choice for account menu options
                switch (choice) {
                    case 1:
                        System.out.println("Current balance: " + selectedAccount.getFormattedBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        selectedAccount.deposit(depositAmount);
                        System.out.println("New balance: " + selectedAccount.getFormattedBalance());
                        totalDeposits += depositAmount;
                        totalTransactions++;
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawalAmount = scanner.nextDouble();
                        selectedAccount.withdrawal(withdrawalAmount);
                        System.out.println("New balance: " + selectedAccount.getFormattedBalance());
                        totalWithdrawals += withdrawalAmount;
                        totalTransactions++;
                        break;
                    case 4:
                        System.out.print("Enter new street: ");
                        String newStreet = scanner.next();
                        System.out.print("Enter new city: ");
                        String newCity = scanner.next();
                        System.out.print("Enter new state: ");
                        String newState = scanner.next();
                        System.out.print("Enter new zip code: ");
                        String newZip = scanner.next();
                        selectedAccount.changeAddress(newStreet, newCity, newState, newZip);
                        System.out.println("Address changed successfully.");
                        totalTransactions++;
                        break;
                    case 5:
                        System.out.print("Enter new phone number: ");
                        String newPhone = scanner.next();
                        selectedAccount.changePhone(newPhone);
                        System.out.println("Phone number changed successfully.");
                        totalTransactions++;
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        continue;
                }

                // Exit transaction loop if user chooses to go back to account selection
                if (choice == 6) break;
            }
        }

        // Print total money in the bank at finish
        double totalBankMoneyFinish = calculateTotalBankMoney(accounts);
        System.out.println("Total money in the bank at finish: " + formatCurrency(totalBankMoneyFinish));

        // Print total number of transactions, deposits, withdrawals
        System.out.println("Total number of transactions: " + totalTransactions);
        System.out.println("Total $ in deposits: " + formatCurrency(totalDeposits));
        System.out.println("Total $ in withdrawals: " + formatCurrency(totalWithdrawals));

        scanner.close(); // Close scanner object
    }

    // Method to calculate total money in the bank from all accounts
    private static double calculateTotalBankMoney(Account[] accounts) {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    // Method to format a double to currency format (e.g., $1,234.56)
    private static String formatCurrency(double amount) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(amount);
    }
}
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
        Account account2 = new Account(500, "Alice", "Johnson", "123 Elm St", "Springfield", "IL", "62701");
        Account account3 = new Account(750, "Bob", "Smith", "456 Oak St", "Chicago", "IL", "60601");
        Account account4 = new Account(1000, "Charlie", "Brown", "789 Pine St", "New York", "NY", "10001");
        Account account5 = new Account(1250, "Diana", "Ross", "101 Maple St", "Los Angeles", "CA", "90001");
        Account account6 = new Account(1500, "Edward", "Norton", "202 Birch St", "San Francisco", "CA", "94101");
        Account account7 = new Account(1750, "Fiona", "Apple", "303 Cedar St", "Seattle", "WA", "98101");
        Account account8 = new Account(2000, "George", "Harrison", "404 Walnut St", "Austin", "TX", "73301");
        Account account9 = new Account(2250, "Helen", "Mirren", "505 Spruce St", "Denver", "CO", "80201");
        Account account10 = new Account(2500, "Ian", "McKellen", "606 Chestnut St", "Boston", "MA", "02101");
        Account account11 = new Account(2750, "Jane", "Doe", "707 Hickory St", "Miami", "FL", "33101");
        Account account12 = new Account(3000, "Kevin", "Spacey", "808 Sycamore St", "Atlanta", "GA", "30301");
        Account account13 = new Account(3250, "Laura", "Linney", "909 Willow St", "Dallas", "TX", "75201");
        Account account14 = new Account(3500, "Mark", "Ruffalo", "1010 Aspen St", "Phoenix", "AZ", "85001");
        Account account15 = new Account(3750, "Nancy", "Pelosi", "1111 Birch St", "Las Vegas", "NV", "89101");
        Account account16 = new Account(4000, "Oliver", "Stone", "1212 Cedar St", "Portland", "OR", "97201");
        Account account17 = new Account(4250, "Pamela", "Anderson", "1313 Elm St", "Minneapolis", "MN", "55401");
        Account account18 = new Account(4500, "Quentin", "Tarantino", "1414 Oak St", "Detroit", "MI", "48201");
        Account account19 = new Account(4750, "Rachel", "McAdams", "1515 Pine St", "Philadelphia", "PA", "19101");
        Account account20 = new Account(5000, "Sam", "Jackson", "1616 Maple St", "Houston", "TX", "77001");

        // Print account details to console
        System.out.println(account0);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
        System.out.println(account5);
        System.out.println(account6);
        System.out.println(account7);
        System.out.println(account8);
        System.out.println(account9);
        System.out.println(account10);
        System.out.println(account11);
        System.out.println(account12);
        System.out.println(account13);
        System.out.println(account14);
        System.out.println(account15);
        System.out.println(account16);
        System.out.println(account17);
        System.out.println(account18);
        System.out.println(account19);
        System.out.println(account20);

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
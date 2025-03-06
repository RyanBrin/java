/*
 * Project: Inventory
 * Author: Ryan Brinkman
 * Date: February 25, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/inventory/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Item> stocks = new ArrayList<>();
    private static int stockNumberCounter = 1011;

    public static void main(String[] args) {
        initializeInventory();

        while (true) {
            System.out.println("\nInventory Manager");
            System.out.println("1. Create new stock");
            System.out.println("2. Discontinue stock");
            System.out.println("3. Check stock");
            System.out.println("4. Display inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createStock();
                case 2 -> discontinueStock();
                case 3 -> checkStock();
                case 4 -> displayInventory();
                case 5 -> {
                    System.out.println("Thank you for using the Inventory Manager. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Initializes the inventory with a predefined set of stock items.
     */
    private static void initializeInventory() {
        stocks.add(new Item("Soccer Ball", 10, 1000));
        stocks.add(new Item("Baseball", 5, 1001));
        stocks.add(new Item("Basketball", 8, 1002));
        stocks.add(new Item("Frisbee", 3, 1003));
        stocks.add(new Item("Ping Pong Ball", 7, 1004));
        stocks.add(new Item("Tennis Racket", 2, 1005));
        stocks.add(new Item("Volleyball", 4, 1006));
        stocks.add(new Item("Hockey Stick", 6, 1007));
        stocks.add(new Item("Golf Club", 1, 1008));
        stocks.add(new Item("Baseball Glove", 9, 1009));
        stocks.add(new Item("Football", 5, 1010));
    }

    /**
     * Prompts the user to enter details for a new stock item and adds it to the inventory.
     */
    private static void createStock() {
        System.out.print("Enter the name of the stock: ");
        String name = scanner.nextLine();

        System.out.print("Enter the quantity of the stock: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        stocks.add(new Item(name, quantity, stockNumberCounter++));
        System.out.println("Stock created successfully!");
    }

    /**
     * Prompts the user to enter a stock number and discontinues the corresponding stock item.
     */
    private static void discontinueStock() {
        System.out.print("Enter the Stock Number of the stock to discontinue: ");
        int stockNumber = scanner.nextInt();

        for (Item item : stocks) {
            if (item.getStockNum() == stockNumber) {
                item.setName("Discontinued Item");
                item.setAmount(0);
                System.out.println("Stock discontinued successfully.");
                return;
            }
        }
        System.out.println("Stock not found.");
    }

    /**
     * Prompts the user to enter a stock number and displays the details of the corresponding stock item.
     */
    private static void checkStock() {
        System.out.print("Enter the Stock Number to check: ");
        int stockNumber = scanner.nextInt();

        for (Item item : stocks) {
            if (item.getStockNum() == stockNumber) {
                System.out.println("Stock Number: " + item.getStockNum());
                System.out.println("Name: " + item.getName());
                System.out.println("Amount: " + item.getAmount());
                return;
            }
        }
        System.out.println("Stock not found.");
    }

    /**
     * Displays the current inventory, listing all stock items with their details.
     */
    private static void displayInventory() {
        System.out.println("\n      Current Inventory      ");
        System.out.printf("%-15s %-32s %-10s%n", "Stock Number", "Name", "Amount");

        for (Item item : stocks) {
            System.out.printf("%-15d %-32s %-10d%n", item.getStockNum(), item.getName(), item.getAmount());
        }
    }
}
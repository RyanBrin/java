/*
 * Project: Inventory
 * Author: Ryan Brinkman
 * Date: February 25, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/inventory/
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> stocks = new ArrayList<>();

        while (true) {
            System.out.println("Inventory Manager");
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

    private static void createStock() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the stock: ");
        String name = scanner.nextLine();

        System.out.print("Enter the quantity of the stock: ");
        int quantity = scanner.nextInt();



        Item newItem = new Item();
        Tracker.add(newItem);

        System.out.println("Stock created successfully. Assigned Stock Number: " + stockNumber);
    }

    private static void discontinueStock() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Stock Number of the stock to discontinue: ");
        int stockNumber = scanner.nextInt();

        for (Item item : stocks) {
            if (item.getStockNum() == stockNumber) {
                Tracker.discontinue(item);
                System.out.println("Stock discontinued successfully.");
                return;
            } else {
                System.out.println("Stock not found.");
            }
        }
    }
}

/*
 * Project: Friends
 * Author: Ryan Brinkman
 * Date: March 25, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/friends/
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-----------------------------------");
            System.out.println("       Friends Management Menu     ");
            System.out.println("-----------------------------------");
            System.out.println("1. Add a friend");
            System.out.println("2. Display friends by first name");
            System.out.println("3. Display friends by last name");
            System.out.println("4. Find a friend");
            System.out.println("5. Remove a friend");
            System.out.println("7. Exit");
            System.out.print("\nPlease choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addFriend();
                case 2 -> displayFriendsByFirstName();
                case 3 -> displayFriendsByLastName();
                case 4 -> findFriend();
                case 5 -> removeFriend();
                case 7 -> {
                    scanner.close();
                    System.out.println("\nThank you for using Friends Management System. Goodbye!");
                    return;
                }
                default -> System.out.println("\nInvalid option! Please try again.");
            }
        }
    }

    private static void addFriend() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();


        System.out.print("Enter email address: ");
        String email = scanner.nextLine();
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("\nInvalid email address! Email address should contain '@' and a valid domain.");
            return;
        }

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                System.out.println("\nInvalid phone number! Phone number should only contain digits.");
                return;
            }
        }

        File friendsFile = new File("src/friends/" + firstName + "-" + lastName + ".txt");
        try {
            // Create the folder if it doesn't exist
            friendsFile.getParentFile().mkdirs();

            try (FileWriter writer = new FileWriter(friendsFile, true)) {
                writer.write(firstName + "\n");
                writer.write(lastName + "\n");
                writer.write(email + "\n");
                writer.write(phoneNumber + "\n");
                System.out.println("\nFriend added successfully!");
            }
        } catch (IOException e) {
            System.err.println("\nError adding friend: " + e.getMessage());
        }
    }

    private static void displayFriendsByFirstName() {
        File friendsDirectory = new File("src/friends/");
        File[] friendFiles = friendsDirectory.listFiles();

        if (friendFiles == null || friendFiles.length == 0) {
            System.out.println("\nNo friends found in the directory.");
            return;
        }

        System.out.println("\n-----------------------------------");
        System.out.println("    Friends Sorted by First Name   ");
        System.out.println("-----------------------------------");

        Arrays.sort(friendFiles, (file1, file2) -> {
            try (Scanner scanner1 = new Scanner(file1);
                 Scanner scanner2 = new Scanner(file2)) {
                String firstName1 = scanner1.nextLine(); // Read the first line for file1
                String firstName2 = scanner2.nextLine(); // Read the first line for file2
                return firstName1.compareToIgnoreCase(firstName2);
            } catch (IOException e) {
                System.err.println("\nError reading file: " + e.getMessage());
                return 0;
            }
        });

        for (File file : friendFiles) {
            if (file.isFile()) {
                try (Scanner scanner = new Scanner(file)) {
                    System.out.println(scanner.nextLine()); // Print the first line (First Name)
                } catch (IOException e) {
                    System.err.println("\nError reading file: " + e.getMessage());
                }
            }
        }
    }

    private static void displayFriendsByLastName() {
        File friendsDirectory = new File("src/friends/");
        File[] friendFiles = friendsDirectory.listFiles();

        if (friendFiles == null || friendFiles.length == 0) {
            System.out.println("\nNo friends found in the directory.");
            return;
        }

        System.out.println("\n-----------------------------------");
        System.out.println("    Friends Sorted by Last Name    ");
        System.out.println("-----------------------------------");

        Arrays.sort(friendFiles, (file1, file2) -> {
            try (Scanner scanner1 = new Scanner(file1);
                 Scanner scanner2 = new Scanner(file2)) {
                scanner1.nextLine(); // Skip the first line
                String lastName1 = scanner1.nextLine(); // Read the second line for file1
                scanner2.nextLine(); // Skip the first line
                String lastName2 = scanner2.nextLine(); // Read the second line for file2
                return lastName1.compareToIgnoreCase(lastName2);
            } catch (IOException e) {
                System.err.println("\nError reading file: " + e.getMessage());
                return 0;
            }
        });

        for (File file : friendFiles) {
            if (file.isFile()) {
                try (Scanner scanner = new Scanner(file)) {
                    scanner.nextLine(); // Skip the first line
                    System.out.println(scanner.nextLine()); // Print the second line (Last Name)
                } catch (IOException e) {
                    System.err.println("\nError reading file: " + e.getMessage());
                }
            }
        }
    }

    private static void findFriend() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        File friendsFile = new File("src/friends/" + firstName + "-" + lastName + ".txt");

        if (friendsFile.exists()) {
            System.out.println("\n-----------------------------------");
            System.out.println("           Friend Details          ");
            System.out.println("-----------------------------------");
            try (Scanner fileScanner = new Scanner(friendsFile)) {
                System.out.println("First Name: " + fileScanner.nextLine());
                System.out.println("Last Name: " + fileScanner.nextLine());
                System.out.println("Email: " + fileScanner.nextLine());
                System.out.println("Phone Number: " + fileScanner.nextLine());
            } catch (IOException e) {
                System.err.println("\nError reading file: " + e.getMessage());
            }
        } else {
            System.out.println("\nFriend not found in the directory.");
        }
    }

    private static void removeFriend() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        File friendsFile = new File("src/friends/" + firstName + "-" + lastName + ".txt");

        if (friendsFile.exists()) {
            if (friendsFile.delete()) {
                System.out.println("\nFriend successfully removed!");
            } else {
                System.err.println("\nFailed to remove the file.");
            }
        } else {
            System.out.println("\nFriend not found in the directory.");
        }
    }
}
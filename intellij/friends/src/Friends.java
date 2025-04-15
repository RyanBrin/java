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

    /**
     * Entry point of the Friends Management System.
     * Displays the main menu and processes user choices for various operations:
     * adding, displaying, finding, and removing friends.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-----------------------------------");
            System.out.println("       Friends Management Menu     ");
            System.out.println("-----------------------------------");
            System.out.println("1. Add a friend");
            System.out.println("2. Display friends by first name");
            System.out.println("3. Display friends by last name");
            System.out.println("4. Display friends by phone number");
            System.out.println("5. Find a friend");
            System.out.println("6. Remove a friend");
            System.out.println("7. Exit");
            System.out.print("\nPlease choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addFriend();
                case 2 -> displayFriendsByFirstName();
                case 3 -> displayFriendsByLastName();
                case 4 -> displayFriendsByPhoneNumber();
                case 5 -> findFriend();
                case 6 -> removeFriend();
                case 7 -> {
                    scanner.close();
                    System.out.println("\nThank you for using Friends Management System. Goodbye!");
                    return;
                }
                default -> System.out.println("\nInvalid option! Please try again.");
            }
        }
    }

    /**
     * Adds a new friend by asking for input and saving their info to a text file.
     * Validates email format and ensures phone number contains only digits.
     * File format: "src/friends/firstName-lastName.txt"
     */
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

    /**
     * Displays all friends sorted by their first name (alphabetically).
     * Loads each friend file and prints their full information.
     */
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
                String firstName1 = scanner1.nextLine();
                String firstName2 = scanner2.nextLine();
                return firstName1.compareToIgnoreCase(firstName2);
            } catch (IOException e) {
                System.err.println("\nError reading file: " + e.getMessage());
                return 0;
            }
        });

        for (File file : friendFiles) {
            printFriendDetailsFromFile(file);
        }
    }

    /**
     * Displays all friends sorted by their last name (alphabetically).
     * Loads each friend file and prints their full information.
     */
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
                scanner1.nextLine(); // Skip first name
                String lastName1 = scanner1.nextLine();
                scanner2.nextLine();
                String lastName2 = scanner2.nextLine();
                return lastName1.compareToIgnoreCase(lastName2);
            } catch (IOException e) {
                System.err.println("\nError reading file: " + e.getMessage());
                return 0;
            }
        });

        for (File file : friendFiles) {
            printFriendDetailsFromFile(file);
        }
    }

    /**
     * Displays all friends sorted by phone number.
     * Loads each friend file and prints their full information.
     */
    private static void displayFriendsByPhoneNumber() {
        File friendsDirectory = new File("src/friends/");
        File[] friendFiles = friendsDirectory.listFiles();

        if (friendFiles == null || friendFiles.length == 0) {
            System.out.println("\nNo friends found in the directory.");
            return;
        }

        System.out.println("\n-----------------------------------");
        System.out.println("  Friends Sorted by Phone Number   ");
        System.out.println("-----------------------------------");

        Arrays.sort(friendFiles, (f1, f2) -> {
            try (Scanner s1 = new Scanner(f1); Scanner s2 = new Scanner(f2)) {
                for (int i = 0; i < 3; i++) s1.nextLine();
                for (int i = 0; i < 3; i++) s2.nextLine();
                String phone1 = s1.nextLine();
                String phone2 = s2.nextLine();
                return phone1.compareTo(phone2);
            } catch (IOException e) {
                return 0;
            }
        });

        for (File file : friendFiles) {
            printFriendDetailsFromFile(file);
        }
    }

    /**
     * Finds and prints a specific friend's information using first and last name.
     * If the file exists, it is displayed; otherwise, a not-found message is shown.
     */
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
            printFriendDetailsFromFile(friendsFile);
        } else {
            System.out.println("\nFriend not found in the directory.");
        }
    }

    /**
     * Removes a friend by deleting their corresponding file based on name.
     * If the file is found and deleted, a success message is shown.
     */
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

    /**
     * Reads a friend's details from the provided file and prints them in a formatted line.
     *
     * @param file The file containing the friend's info (first name, last name, email, phone).
     */
    private static void printFriendDetailsFromFile(File file) {
        if (file.isFile()) {
            try (Scanner scanner = new Scanner(file)) {
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                String email = scanner.nextLine();
                String phone = scanner.nextLine();
                System.out.println(firstName + " " + lastName + " | " + email + " | " + phone);
            } catch (IOException e) {
                System.err.println("\nError reading file: " + e.getMessage());
            }
        }
    }
}
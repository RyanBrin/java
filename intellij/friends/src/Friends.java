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
     * Main method that serves as the entry point for the Friends Management System.
     * It displays a menu to the user and processes their input to perform various operations
     * such as adding, displaying, finding, and removing friends.
     *
     * @param args Command line arguments (not used in this application).
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
     * Adds a new friend to the system by collecting the user's input for first name,
     * last name, email, and phone number. The friend's details are saved to a file
     * named in the format "firstName-lastName.txt" in the "src/friends/" directory.
     * Validates the email format and ensures the phone number contains only digits.
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

    /**
     * Displays a list of friends sorted by their first names. It reads the friend files
     * from the "src/friends/" directory, sorts them based on the first name, and prints
     * the first name of each friend to the console.
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

    /**
     * Displays a list of friends sorted by their last names. It reads the friend files
     * from the "src/friends/" directory, sorts them based on the last name, and prints
     * the last name of each friend to the console.
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

    /**
     * Displays a list of friends sorted by their phone numbers. It reads the friend files
     * from the "src/friends/" directory, extracts the phone number (fourth line) from each,
     * sorts the files based on this phone number, and prints each friend's phone number
     * to the console.
     *
     * If no friends exist or if any file fails to load properly, appropriate messages or
     * error details are printed.
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
                for (int i = 0; i < 3; i++) s1.nextLine(); // skip to line 4
                for (int i = 0; i < 3; i++) s2.nextLine(); // skip to line 4
                String phone1 = s1.nextLine();
                String phone2 = s2.nextLine();
                return phone1.compareTo(phone2);
            } catch (IOException e) {
                return 0;
            }
        });

        for (File file : friendFiles) {
            try (Scanner s = new Scanner(file)) {
                for (int i = 0; i < 3; i++) s.nextLine(); // Skip to phone number
                System.out.println(s.nextLine());
            } catch (IOException e) {
                System.err.println("\nError reading file: " + e.getMessage());
            }
        }
    }

    /**
     * Finds and displays the details of a friend based on the user's input for first name
     * and last name. If a file with the corresponding name exists in the "src/friends/"
     * directory, it prints the friend's details; otherwise, it informs the user that the
     * friend was not found.
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

    /**
     * Removes a friend from the system by deleting the file corresponding to the user's
     * input for first name and last name. If the file exists in the "src/friends/"
     * directory, it is deleted, and a success message is displayed; otherwise, it informs
     * the user that the friend was not found.
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
}
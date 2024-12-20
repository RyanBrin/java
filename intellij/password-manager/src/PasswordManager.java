/*
 * Project: Password Manager
 * Author: Ryan Brinkman
 * Date: 12/18/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/password-manager/
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PasswordManager {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Password Manager!");
            System.out.println("1. Create an Account");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    logIn(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using Password Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Enter a master password: ");
        String masterPassword = scanner.nextLine();

        String userFilePath = "data/users/" + username + ".txt";
        String serviceDirPath = "data/users/" + username + "-services/";

        File userDir = new File("data/users");
        if (!userDir.exists()) {
            userDir.mkdirs();
        }

        File serviceDir = new File(serviceDirPath);
        if (!serviceDir.exists()) {
            serviceDir.mkdirs();
        }

        File userFile = new File(userFilePath);
        if (userFile.exists()) {
            System.out.println("Username already exists. Please choose another.");
            return;
        }

        try (FileWriter writer = new FileWriter(userFile)) {
            writer.write("masterPassword:" + masterPassword + "\n");
            System.out.println("Account created successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving account details.");
            e.printStackTrace();
        }
    }

    private static void logIn(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your master password: ");
        String masterPassword = scanner.nextLine();

        String userFilePath = "data/users/" + username + ".txt";
        File userFile = new File(userFilePath);

        if (!userFile.exists()) {
            System.out.println("User not found. Please create an account first.");
            return;
        }

        try (Scanner fileScanner = new Scanner(userFile)) {
            String storedPassword = fileScanner.nextLine().split(":")[1];

            if (storedPassword.equals(masterPassword)) {
                System.out.println("Login successful. Welcome back, " + username + "!");
                managePasswords(scanner, username);
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading account details.");
            e.printStackTrace();
        }
    }

    private static void managePasswords(Scanner scanner, String username) {
        String serviceDirPath = "data/users/" + username + "-services/";
        File serviceDir = new File(serviceDirPath);

        while (true) {
            System.out.println("\nPassword Management Menu:");
            System.out.println("1. View saved passwords");
            System.out.println("2. View a specific password");
            System.out.println("3. Create a new service password");
            System.out.println("4. Edit a service password");
            System.out.println("5. Delete a service password");
            System.out.println("6. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewSavedPasswords(serviceDir);
                    break;
                case 2:
                    viewSpecificPassword(scanner, serviceDir);
                    break;
                case 3:
                    createServicePassword(scanner, serviceDir);
                    break;
                case 4:
                    editServicePassword(scanner, serviceDir);
                    break;
                case 5:
                    deleteServicePassword(scanner, serviceDir);
                    break;
                case 6:
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createServicePassword(Scanner scanner, File serviceDir) {
        System.out.print("Enter the service name (e.g., Netflix, Gmail): ");
        String serviceName = scanner.nextLine();

        System.out.print("Enter the password for " + serviceName + ": ");
        String password = scanner.nextLine();

        File serviceFile = new File(serviceDir, serviceName + ".txt");

        try (FileWriter writer = new FileWriter(serviceFile)) {
            writer.write("password:" + password + "\n");
            System.out.println("Password for " + serviceName + " saved successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the password.");
            e.printStackTrace();
        }
    }

    private static void viewSavedPasswords(File serviceDir) {
        File[] serviceFiles = serviceDir.listFiles();

        if (serviceFiles == null || serviceFiles.length == 0) {
            System.out.println("No saved passwords found.");
            return;
        }

        System.out.println("\nSaved Service Passwords:");
        for (File serviceFile : serviceFiles) {
            System.out.println(serviceFile.getName().replace(".txt", ""));
        }
    }

    private static void viewSpecificPassword(Scanner scanner, File serviceDir) {
        System.out.print("Enter the service name to view the password: ");
        String serviceName = scanner.nextLine();

        File serviceFile = new File(serviceDir, serviceName + ".txt");
        if (!serviceFile.exists()) {
            System.out.println("Service not found.");
            return;
        }

        try (Scanner fileScanner = new Scanner(serviceFile)) {
            String password = fileScanner.nextLine().split(":")[1];
            System.out.println("Password for " + serviceName + ": " + password);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the password.");
            e.printStackTrace();
        }
    }

    private static void editServicePassword(Scanner scanner, File serviceDir) {
        System.out.print("Enter the service name to edit (e.g., Netflix, Gmail): ");
        String serviceName = scanner.nextLine();

        File serviceFile = new File(serviceDir, serviceName + ".txt");
        if (!serviceFile.exists()) {
            System.out.println("Service not found.");
            return;
        }

        System.out.print("Enter the new password for " + serviceName + ": ");
        String newPassword = scanner.nextLine();

        try (FileWriter writer = new FileWriter(serviceFile)) {
            writer.write("password:" + newPassword + "\n");
            System.out.println("Password for " + serviceName + " updated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the password.");
            e.printStackTrace();
        }
    }

    private static void deleteServicePassword(Scanner scanner, File serviceDir) {
        System.out.print("Enter the service name to delete (e.g., Netflix, Gmail): ");
        String serviceName = scanner.nextLine();
        File serviceFile = new File(serviceDir, serviceName + ".txt");
        if (serviceFile.delete()) {
            System.out.println("Password for " + serviceName + " deleted successfully!");
        } else {
            System.out.println("Service not found or unable to delete.");
        }
    }
}
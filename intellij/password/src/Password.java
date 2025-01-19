/*
 * Project: Password
 * Author: Ryan Brinkman
 * Date: January 19, 2025
 * Description: A simple password storage and authentication system using Java.
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/password/
 */

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a secret password to store: ");
        String storedPassword = scanner.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean isAuthenticated = false;
        int attempts = 0;

        while (!isAuthenticated) {
            if (attempts < 3) {
                System.out.print("Enter your secret password: ");
                String enteredPassword = scanner.nextLine();

                if (enteredPassword.equals(storedPassword)) {
                    isAuthenticated = true;
                    System.out.println("Login successful!");
                } else {
                    attempts++;
                    System.out.println("Incorrect password. You have " + (3 - attempts) + " attempts remaining.");
                }
            } else {
                System.out.println("Too many failed login attempts. Your account has been locked.");
                break;
            }
        }

        scanner.close();
    }
}
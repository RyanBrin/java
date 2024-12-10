/*
 * Project: Bank
 * Author: Ryan Brinkman
 * Date: 11/13/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/find-name/
 */

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] names = new String[10];
        String search;
        boolean status = false;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine().toLowerCase();
        }

        System.out.print("Enter name to search for: ");
        search = scanner.nextLine();

        for (String name : names) {
            if (name.equalsIgnoreCase(search)) {
                System.out.println("Name found: " + name);
                status = true;
                break;
            }
        }

    }
}
/*
 * Project: Find Name
 * Author: Ryan Brinkman
 * Date: 12/10/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/find-name/
 */

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] names = new String[10];
        boolean status = false;
        String search;
    
        Scanner scanner = new Scanner(System.in);
    
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine().toLowerCase();
        }

        System.out.println();

        System.out.print("Enter name to search for: ");
        search = scanner.nextLine();
    
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println(names[i].toLowerCase() + " found in position " + i);
                status = true;
            }
        }
        
        if (!status) {
            System.out.println(search + " not found.");
        }
    }
}
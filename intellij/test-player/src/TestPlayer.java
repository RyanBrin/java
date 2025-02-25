/*
 * Project: Test Player
 * Author: Ryan Brinkman
 * Date: February 21, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/test-player/
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TestPlayer {
    public static void main(String[] args) {
        // Create and add players to the list
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("John", "Doe", 10, "Red", "Short"));
        players.add(new Player("Jane", "Smith", 12, "Blue", "Long"));
        players.add(new Player("Mike", "Brown", 7, "Green", "Curly"));
        players.add(new Player("Emily", "White", 5, "Yellow", "Braided"));
        players.add(new Player("Chris", "Black", 22, "Purple", "Spiky"));
        players.add(new Player("Alice", "Johnson", 15, "Orange", "Wavy"));
        players.add(new Player("Bob", "Williams", 8, "Pink", "Straight"));
        players.add(new Player("Charlie", "Davis", 14, "Teal", "Curly"));
        players.add(new Player("Diana", "Miller", 11, "Cyan", "Short"));
        players.add(new Player("Ethan", "Wilson", 9, "Magenta", "Long"));
        players.add(new Player("Fiona", "Anderson", 13, "Brown", "Braided"));
        players.add(new Player("George", "Thomas", 6, "Gray", "Spiky"));
        players.add(new Player("Hannah", "Martinez", 16, "Silver", "Wavy"));
        players.add(new Player("Ian", "Taylor", 18, "Gold", "Straight"));
        players.add(new Player("Julia", "Harris", 20, "Navy", "Curly"));
        players.add(new Player("Kevin", "Clark", 19, "Black", "Short"));
        players.add(new Player("Lily", "Lewis", 21, "White", "Long"));
        players.add(new Player("Mason", "Young", 23, "Red", "Braided"));
        players.add(new Player("Nina", "Walker", 25, "Blue", "Spiky"));
        players.add(new Player("Oscar", "Hall", 17, "Green", "Wavy"));

        boolean addPlayer = true;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the first name of the player to add (or 'exit' to quit): ");
            String firstName = scanner.nextLine();

            if (firstName.equalsIgnoreCase("exit")) {
                addPlayer = false;
                break;
            }

            System.out.print("Enter the last name of the player: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter the jersey number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the jersey color: ");
            String jerseyColor = scanner.nextLine();

            System.out.print("Enter the hairstyle: ");
            String hairstyle = scanner.nextLine();

            players.add(new Player(firstName, lastName, number, jerseyColor, hairstyle));

        } while (addPlayer);

        // Print all player information
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
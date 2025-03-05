/*
 * Project: Stable Marriage
 * Author: Ryan Brinkman
 * Date: March 4, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/stable-marriage/
 */

import java.util.List;

public class StableMarriage {
    public static void main(String[] args) {
        // Cards' preferences
        List<Card> kings = List.of(
                new Card("King", "Spades", List.of("Queen of Diamonds", "Queen of Clubs", "Queen of Hearts", "Queen of Spades")),
                new Card("King", "Clubs", List.of("Queen of Clubs", "Queen of Diamonds", "Queen of Spades", "Queen of Hearts")),
                new Card("King", "Diamonds", List.of("Queen of Hearts", "Queen of Diamonds", "Queen of Spades", "Queen of Clubs")),
                new Card("King", "Hearts", List.of("Queen of Diamonds", "Queen of Hearts", "Queen of Clubs", "Queen of Spades"))
        );

        List<Card> queens = List.of(
                new Card("Queen", "Spades", List.of("King of Spades", "King of Diamonds", "King of Hearts", "King of Clubs")),
                new Card("Queen", "Clubs", List.of("King of Spades", "King of Hearts", "King of Diamonds", "King of Clubs")),
                new Card("Queen", "Diamonds", List.of("King of Spades", "King of Clubs", "King of Diamonds", "King of Hearts")),
                new Card("Queen", "Hearts", List.of("King of Clubs", "King of Diamonds", "King of Spades", "King of Hearts"))
        );

        // Compare preferences
        System.out.println("Kings' Preferences:");
        kings.forEach(System.out::println);

        System.out.println("\nQueens' Preferences:");
        queens.forEach(System.out::println);

        // Print interests of each queen
        for (Card queen : queens) {
            System.out.println(queen.getRank() + " of " + queen.getSuit() + " interests: " + queen.getPreferences());

        }
    }
}
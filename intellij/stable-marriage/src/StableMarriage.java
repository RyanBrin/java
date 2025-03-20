/*
 * Project: Stable Marriage
 * Author: Ryan Brinkman
 * Date: March 4, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/stable-marriage/
 */

import java.util.ArrayList;
import java.util.List;

public class StableMarriage {
    public static void main(String[] args) {
        // Kings and Queens
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

        List<String> matches = stableMarriage(kings, queens);

        System.out.println("Matches:");
        matches.forEach(System.out::println);
    }

    /**
     * Implements the Stable Marriage algorithm to find a stable set of engagements between Kings and Queens.
     *
     * @param kings  A list of Card objects representing Kings, each with a list of preferences for Queens.
     * @param queens A list of Card objects representing Queens, each with a list of preferences for Kings.
     * @return A list of strings representing the stable engagements between Kings and Queens.
     */
    public static List<String> stableMarriage(List<Card> kings, List<Card> queens) {
        List<Card> freeKings = new ArrayList<>(kings);
        List<String> engagements = new ArrayList<>();
        int[] queenMatches = new int[queens.size()];
        boolean[] isQueenEngaged = new boolean[queens.size()];

        while (!freeKings.isEmpty()) {
            Card king = freeKings.remove(0);

            for (String queenPreference : king.getPreferences()) {
                int queenIndex = findQueenIndex(queens, queenPreference);
                if (queenIndex != -1) {
                    if (!isQueenEngaged[queenIndex]) {
                        // Engage King and Queen
                        isQueenEngaged[queenIndex] = true;
                        queenMatches[queenIndex] = kings.indexOf(king);
                        engagements.add(king.getRank() + " of " + king.getSuit() + " & " + queenPreference);
                        break;
                    } else {
                        // Check if the Queen prefers the new King
                        Card currentKing = kings.get(queenMatches[queenIndex]);
                        int currentKingIndex = queens.get(queenIndex).getPreferences().indexOf(currentKing.getRank() + " of " + currentKing.getSuit());
                        int newKingIndex = queens.get(queenIndex).getPreferences().indexOf(king.getRank() + " of " + king.getSuit());
                        if (newKingIndex < currentKingIndex) {
                            // Queen prefers the new King, replace the engagement
                            freeKings.add(currentKing);
                            queenMatches[queenIndex] = kings.indexOf(king);
                            engagements.remove(currentKing.getRank() + " of " + currentKing.getSuit() + " & " + queens.get(queenIndex).getRank() + " of " + queens.get(queenIndex).getSuit());
                            engagements.add(king.getRank() + " of " + king.getSuit() + " & " + queenPreference);
                            break;
                        }
                    }
                }
            }
        }
        return engagements;
    }

    /**
     * Helper method to find the index of a Queen in the list based on her name.
     *
     * @param queens    A list of Card objects representing Queens.
     * @param queenName The name of the Queen to find, in the format "Rank of Suit".
     * @return The index of the Queen in the list, or -1 if not found.
     */
    private static int findQueenIndex(List<Card> queens, String queenName) {
        for (int i = 0; i < queens.size(); i++) {
            if ((queens.get(i).getRank() + " of " + queens.get(i).getSuit()).equals(queenName)) {
                return i;
            }
        }
        return -1;
    }
}
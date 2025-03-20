import java.util.ArrayList;
import java.util.List;

/*
 * Card class
 */
class Card {
    private final String rank;
    private final String suit;
    private final List<String> preferences;

    /**
     * Constructs a Card object with a specified rank, suit, and list of preferences.
     *
     * @param rank        The rank of the card (e.g., "King" or "Queen").
     * @param suit        The suit of the card (e.g., "Spades", "Hearts").
     * @param preferences A list of preferences representing the preferred partners.
     */
    public Card(String rank, String suit, List<String> preferences) {
        this.rank = rank;
        this.suit = suit;
        this.preferences = new ArrayList<>(preferences);
    }

    /**
     * Returns the rank of the card.
     *
     * @return A string representing the rank of the card.
     */
    public String getRank() {
        return rank;
    }

    /**
     * Returns the suit of the card.
     *
     * @return A string representing the suit of the card.
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Returns a copy of the list of preferences.
     *
     * @return A list of strings representing the preferences.
     */
    public List<String> getPreferences() {
        return new ArrayList<>(preferences);
    }

    /**
     * Returns a string representation of the card, including its rank, suit, and preferences.
     *
     * @return A string describing the card.
     */
    @Override
    public String toString() {
        return rank + " of " + suit + " prefers " + preferences;
    }
}
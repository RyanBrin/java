import java.util.ArrayList;
import java.util.List;

/*
 * Card Class
 */
class Card {
    private final String rank;
    private final String suit;
    private final List<String> preferences;

    public Card(String rank, String suit, List<String> preferences) {
        this.rank = rank;
        this.suit = suit;
        this.preferences = new ArrayList<>(preferences);
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public List<String> getPreferences() {
        return new ArrayList<>(preferences);
    }

    @Override
    public String toString() {
        return rank + " of " + suit + " prefers " + preferences;
    }
}
import java.util.Random;

/**
 * Represents a carnival game booth where players can pay to play and win prizes.
 */
public class GameBooth {
    private final String name;
    private final double price;
    private final String firstPrize;
    private final String consolationPrize;
    private int prizesGiven;

    /**
     * Constructs a default {@code GameBooth} with preset values.
     * The default game is "Blackjack" with a price of $8.
     * The first prize is a "Blackjack Card Stick" and the consolation prize is "Chips".
     */
    public GameBooth() {
        this.name = "Blackjack";
        this.price = 8;
        this.firstPrize = "Blackjack Card Stick";
        this.consolationPrize = "Chips";
        this.prizesGiven = 0;
    }

    /**
     * Constructs a {@code GameBooth} with specified parameters.
     *
     * @param name             The name of the game booth.
     * @param price            The cost to play the game.
     * @param firstPrize       The grand prize awarded for winning.
     * @param consolationPrize The prize awarded when the player does not win the grand prize.
     */
    public GameBooth(String name, double price, String firstPrize, String consolationPrize) {
        this.name = name;
        this.price = price;
        this.firstPrize = firstPrize;
        this.consolationPrize = consolationPrize;
        this.prizesGiven = 0;
    }

    /**
     * Returns the cost of playing the game.
     *
     * @return The price to play one round of the game.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the name of the game booth.
     *
     * @return The name of the booth.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the first-place prize awarded to winners.
     *
     * @return The grand prize for winning the game.
     */
    public String getFirstPrize() {
        return firstPrize;
    }

    /**
     * Returns the consolation prize awarded to non-winners.
     *
     * @return The consolation prize.
     */
    public String getConsolationPrize() {
        return consolationPrize;
    }

    /**
     * Returns the total number of prizes given out by the booth.
     *
     * @return The number of prizes distributed.
     */
    public int getPrizesGiven() {
        return prizesGiven;
    }

    /**
     * Simulates a game round where the player has three attempts to win.
     * A win is determined randomly. If the player wins all three attempts, they receive the first prize.
     * Otherwise, they receive the consolation prize.
     *
     * @return The prize awarded to the player after playing the game.
     */
    public String playGame() {
        Random random = new Random();
        int wins = 0;

        // The player has three attempts to win.
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(3) + 1; // Random number between 1 and 3
            if (randomNumber == 1) {
                wins += 1;
            }
        }

        // Determine the prize based on the number of wins
        prizesGiven++;
        return (wins == 3) ? firstPrize : consolationPrize;
    }
}
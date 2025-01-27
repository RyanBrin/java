import java.util.Random;

/**
 * GameBooth class
 * The {@code GameBooth} class represents a carnival game booth.
 * Players pay a fee to play the game and have a chance to win a prize.
 */
public class GameBooth {
    private final double price;
    private final String firstPrize;
    private final String consolationPrize;

    /**
     * Constructs a {@code GameBooth} with a specified price and prizes.
     *
     * @param price The cost to play the game.
     * @param firstPrize The prize awarded for a perfect win.
     * @param consolationPrize The prize given when the player does not win the first prize.
     */
    public GameBooth(double price, String firstPrize, String consolationPrize) {
        this.price = price;
        this.firstPrize = firstPrize;
        this.consolationPrize = consolationPrize;
    }

    /**
     * Retrieves the cost to play the game.
     *
     * @return The price of a single game round.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the first prize for winning the game.
     *
     * @return The first-place prize.
     */
    public String getFirstPrize() {
        return firstPrize;
    }

    /**
     * Retrieves the consolation prize for not winning the first prize.
     *
     * @return The consolation prize.
     */
    public String getConsolationPrize() {
        return consolationPrize;
    }

    /**
     * Simulates playing the game. The player has three attempts to win.
     * If the player gets three wins, they receive the first prize.
     * Otherwise, they receive the consolation prize.
     *
     * @return A message indicating whether the player won the first prize or the consolation prize.
     */
    public String playGame() {
        Random random = new Random();
        int wins = 0;

        // Player gets three attempts to win.
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(3) + 1; // Random number between 1 and 3
            if (randomNumber == 1) {
                wins += 1;
            }
        }

        // Determine prize based on number of wins
        if (wins == 3) {
            return "Congratulations! You won the first prize: " + firstPrize;
        } else {
            return "Sorry, you lost. Your consolation prize is: " + consolationPrize;
        }
    }
}
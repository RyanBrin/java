/**
 * Player class
 * The {@code Player} class represents a player in the carnival.
 * Each player has a certain amount of money and a record of prizes won.
 */
public class Player {
    private double money;
    private final StringBuilder prizesWon;
    private final String player;

    /**
     * Creates a new player with no initial money and no prizes.
     */
    public Player() {
        this.player = "John";
        this.money = 0;
        this.prizesWon = new StringBuilder();
    }

    /**
     * Creates a new player with the specified amount of money.
     *
     * @param money The initial amount of money the player has.
     */
    public Player(String player, double money) {
        this.player = player;
        this.money = money;
        this.prizesWon = new StringBuilder();
    }

    /**
     * Retrieves the amount of money the player currently has.
     *
     * @return The player's current balance.
     */
    public double getMoney() {
        return money;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player
     */
    public String getName() {
        return player;
    }

    /**
     * Sets a new balance for the player.
     *
     * @param money The new amount of money for the player.
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * Increases the player's money by a specified amount.
     *
     * @param amount The amount to add to the player's balance.
     */
    public void addMoney(double amount) {
        if (amount > 0) {
            this.money += amount;
        }
    }

    /**
     * Decreases the player's money by a specified amount if sufficient funds exist.
     *
     * @param amount The amount to subtract from the player's balance.
     */
    public void subtractMoney(double amount) {
        if (amount > 0 && money >= amount) {
            this.money -= amount;
        }
    }

    /**
     * Retrieves the prizes won by the player.
     *
     * @return A comma-separated list of prizes won, or "No prizes" if none.
     */
    public String getPrizesWon() {
        return !prizesWon.isEmpty() ? prizesWon.toString() : "No prizes";
    }

    /**
     * Plays the specified game and rewards the user their prize upon completion.
     *
     * @param game The game to play
     */
    public String play(GameBooth game) {
        if (money >= game.getPrice()) {
            subtractMoney(game.getPrice());
            String prize = game.playGame();
            if (!prizesWon.toString().contains(prize)) {
                if (!prizesWon.isEmpty()) {
                    prizesWon.append(", ");
                }
                prizesWon.append(prize);
            }
            System.out.println("Congratulations! You won: " + prize);
        } else {
            System.out.println("Insufficient funds! You need " + game.getPrice() + " to play.");
        }
        return "";
    }
}
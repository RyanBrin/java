/**
 * Player Class
 */
public class Player {

    private int balance;

    /**
     * Constructs a Player with a given starting balance.
     * @param startingBalance the initial amount of money the player starts with
     */
    public Player(int startingBalance) {
        this.balance = startingBalance;
    }

    /**
     * Returns the player's current balance.
     * @return the amount of money the player currently has
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Determines whether the player can afford to place a bet of the specified amount.
     * @param amount the bet amount to check
     * @return true if the player has enough money and the amount is greater than zero, false otherwise
     */
    public boolean canBet(int amount) {
        return amount > 0 && balance >= amount;
    }

    /**
     * Deducts a specified amount from the player's balance to represent a bet loss.
     * @param amount the amount to deduct from the balance
     */
    public void deductBet(int amount) {
        balance -= amount;
    }

    /**
     * Adds a specified amount to the player's balance to represent winnings.
     * @param amount the amount to add to the balance
     */
    public void addWinnings(int amount) {
        balance += amount;
    }
}
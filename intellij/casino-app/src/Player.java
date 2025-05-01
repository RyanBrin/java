public class Player {
    private int balance;

    public Player(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deductBet(int amount) {
        balance -= amount;
    }

    public void addWinnings(int amount) {
        balance += amount;
    }

    public boolean canBet(int amount) {
        return amount > 0 && amount <= balance;
    }
}
/*
 * Item Class
 */
public class Item {
    private String name;
    private int amount;
    private int stockNum;

    /*
     * Constructor
     */
    public Item(String name, int amount, int stockNum) {
        this.name = name;
        this.amount = amount;
        this.stockNum = stockNum;
    }

    /*
     * Getter Methods
     */
    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getStockNum() {
        return stockNum;
    }

    /*
     * Setter Methods
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
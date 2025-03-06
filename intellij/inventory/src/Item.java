/*
 * Item Class
 */
class Item {
    private String name;
    private int amount;
    private final int stockNum;

    /**
     * Constructs a new Item with the specified name, amount, and stock number.
     *
     * @param name     the name of the item
     * @param amount   the quantity of the item
     * @param stockNum the unique stock number of the item
     */
    public Item(String name, int amount, int stockNum) {
        this.name = name;
        this.amount = amount;
        this.stockNum = stockNum;
    }

    /**
     * Returns the name of the item.
     *
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the quantity of the item.
     *
     * @return the quantity of the item
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Returns the unique stock number of the item.
     *
     * @return the stock number of the item
     */
    public int getStockNum() {
        return stockNum;
    }

    /**
     * Sets the name of the item.
     *
     * @param name the new name of the item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the quantity of the item.
     *
     * @param amount the new quantity of the item
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
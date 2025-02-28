import java.util.ArrayList;

/*
 * Tracker Class
 */
public class Tracker {
    private final int startStockNum = 1010;
    private final ArrayList<Item> stocks = new ArrayList<>();
    private int lastStockNum;

    // Initial stock items
    Item soccerBall = new Item("Soccer Ball", 10, 1000);
    Item baseball = new Item("Baseball", 5, 1001);
    Item basketball = new Item("Basketball", 8, 1002);
    Item frisbee = new Item("Frisbee", 3, 1003);
    Item pingPongBall = new Item("Ping Pong Ball", 7, 1004);
    Item tennisRacket = new Item("Tennis Racket", 2, 1005);
    Item volleyball = new Item("Volleyball", 4, 1006);
    Item hockeyStick = new Item("Hockey Stick", 6, 1007);
    Item golfClub = new Item("Golf Club", 1, 1008);
    Item baseballGlove = new Item("Baseball Glove", 9, 1009);
    Item football = new Item("Football", 5, 1010);

    public Tracker() {
        stocks.add(soccerBall);
        stocks.add(baseball);
        stocks.add(basketball);
        stocks.add(frisbee);
        stocks.add(pingPongBall);
        stocks.add(tennisRacket);
        stocks.add(volleyball);
        stocks.add(hockeyStick);
        stocks.add(golfClub);
        stocks.add(baseballGlove);
        stocks.add(football);

        lastStockNum = startStockNum;
    }

    public void add() {
        lastStockNum++;
        Item newItem = new Item("New Item", 0, lastStockNum);
        stocks.add(newItem);
    }

    public static void discontinue(Item item) {
        item.setName("Discontinued item");
        item.setAmount(0);
    }

    public void display() {
        System.out.println("      Current Inventory      ");
        System.out.printf("%-15s %-15s %-10s%n", "Stock Number", "Name", "Amount");

        for (Item item : stocks) {
            System.out.printf("%-15d %-15s %-10d%n", item.getStockNum(), item.getName(), item.getAmount());
        }
    }
}
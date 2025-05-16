/*
 * Project: Casino App
 * Author: Ryan Brinkman
 * Date: April 17, 2025
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/casino-app/
 */

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;

public class CasinoApp extends Application {

    private Stage primaryStage;
    private Player player;

    private final String ICON_PATH = "file:src/assets/icons/";

    private final String DARK_STYLE = """
        -fx-base: #2b2b2b;
        -fx-background: #2b2b2b;
        -fx-control-inner-background: #3c3f41;
        -fx-accent: #ffb74d;
        -fx-focus-color: #ffb74d;
        -fx-faint-focus-color: transparent;
        -fx-text-fill: white;
        -fx-font-size: 14px;
        -fx-font-family: 'Segoe UI', sans-serif;
    """;

    private final String[] symbols = {
            "diamond", "number-7", "bar", "cherry",
            "bell", "horseshoe", "heart", "watermelon", "lemon"
    };

    private final int[] payouts = {1000, 500, 250, 50, 30, 20, 15, 10, 5};

    private final double[] probabilities = {
            0.05, 0.06, 0.07, 0.10, 0.11, 0.13, 0.14, 0.16, 0.18
    };

    private int totalSpins = 0;
    private int totalWins = 0;
    private int totalPayout = 0;
    private final Random random = new Random();

    /**
     * Launches the application.
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Initializes the main window and displays the welcome screen.
     */
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.player = new Player(500);
        showMainScene();
    }

    /**
     * Displays the welcome screen with navigation buttons.
     */
    private void showMainScene() {
        Label titleLabel = new Label("Welcome to the Casino");
        Button startButton = new Button("Enter Casino");
        Button exitButton = new Button("Exit");

        startButton.setOnAction(e -> showMenuScene());
        exitButton.setOnAction(e -> System.exit(0));

        VBox layout = new VBox(25, titleLabel, startButton, exitButton);
        layout.setStyle("-fx-padding: 30; -fx-alignment: center;" + DARK_STYLE);

        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Casino App");
        primaryStage.show();
    }

    /**
     * Displays the menu to start or go back.
     */
    private void showMenuScene() {
        Label menuLabel = new Label("Casino Game Menu");
        Button slotGameButton = new Button("Play Slot Machine");
        Button backButton = new Button("Return to Main");

        slotGameButton.setOnAction(e -> showSlotGameScene());
        backButton.setOnAction(e -> showMainScene());

        VBox layout = new VBox(25, menuLabel, slotGameButton, backButton);
        layout.setStyle("-fx-padding: 30; -fx-alignment: center;" + DARK_STYLE);

        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setScene(scene);
    }

    /**
     * Displays and handles the slot machine UI and logic.
     */
    private void showSlotGameScene() {
        Label slotGameLabel = new Label("Slot Machine");
        Label balanceLabel = new Label("Balance: $" + format(player.getBalance()));
        TextField betField = new TextField();
        Button spinButton = new Button("Spin");
        Button backButton = new Button("Back to Menu");

        betField.setPromptText("Enter bet amount");
        betField.setMaxWidth(150);

        ImageView slotImage1 = new ImageView();
        ImageView slotImage2 = new ImageView();
        ImageView slotImage3 = new ImageView();

        for (ImageView img : new ImageView[]{slotImage1, slotImage2, slotImage3}) {
            img.setFitWidth(60);
            img.setFitHeight(60);
        }

        HBox slotBox = new HBox(15, slotImage1, slotImage2, slotImage3);
        slotBox.setStyle("-fx-alignment: center;");

        Label resultLabel = new Label();
        Label statsLabel = new Label();

        spinButton.setOnAction(e -> {
            try {
                int bet = Integer.parseInt(betField.getText());
                if (bet <= 0) {
                    resultLabel.setText("Bet must be greater than 0.");
                    return;
                }

                if (player.canBet(bet)) {
                    spinButton.setDisable(true);
                    resultLabel.setText("Spinning...");

                    String[] spinResult = getSpinSymbols();

                    PauseTransition reveal1 = new PauseTransition(Duration.millis(300));
                    PauseTransition reveal2 = new PauseTransition(Duration.millis(600));
                    PauseTransition reveal3 = new PauseTransition(Duration.millis(900));

                    reveal1.setOnFinished(ev -> slotImage1.setImage(new Image(ICON_PATH + spinResult[0] + ".png")));
                    reveal2.setOnFinished(ev -> slotImage2.setImage(new Image(ICON_PATH + spinResult[1] + ".png")));
                    reveal3.setOnFinished(ev -> {
                        slotImage3.setImage(new Image(ICON_PATH + spinResult[2] + ".png"));

                        int[] payoutAndMultiplier = calculatePayout(spinResult, bet);
                        int payout = payoutAndMultiplier[0];
                        int multiplier = payoutAndMultiplier[1];
                        totalSpins++;

                        if (payout > 0) {
                            totalWins++;
                            totalPayout += payout;
                            player.addWinnings(payout);
                            resultLabel.setText(generateWinMessage(spinResult, payout, multiplier));
                        } else {
                            player.deductBet(bet);
                            resultLabel.setText("You lost $" + format(bet));
                        }

                        balanceLabel.setText("Balance: $" + format(player.getBalance()));
                        statsLabel.setText("Spins: " + totalSpins + " | Wins: " + totalWins +
                                " | Avg Payout: $" + (totalWins == 0 ? "0" : format(totalPayout / totalWins)));

                        if (player.getBalance() <= 0) {
                            resultLabel.setText("Out of money! Refill in 5...");
                            countdownRefill(resultLabel, balanceLabel, spinButton);
                        } else {
                            spinButton.setDisable(false);
                        }
                    });

                    reveal1.play();
                    reveal2.play();
                    reveal3.play();

                } else {
                    resultLabel.setText("Invalid bet or insufficient balance.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number.");
            }
        });

        backButton.setOnAction(e -> showMenuScene());

        VBox layout = new VBox(25, slotGameLabel, balanceLabel, betField,
                slotBox, spinButton, resultLabel, statsLabel, backButton);
        layout.setStyle("-fx-padding: 30; -fx-alignment: center;" + DARK_STYLE);

        Scene scene = new Scene(layout, 700, 500);
        primaryStage.setScene(scene);
    }

    /** Returns an array of 3 slot symbols based on weighted probabilities. */
    private String[] getSpinSymbols() {
        int roll = random.nextInt(100);
        if (roll < 50) {
            String chosen = getWeightedSymbol();
            if (roll < 20) return new String[]{chosen, chosen, chosen};
            else return new String[]{chosen, chosen, getWeightedSymbol()};
        }
        return new String[]{getWeightedSymbol(), getWeightedSymbol(), getWeightedSymbol()};
    }

    /** Returns one symbol based on weighted odds. */
    private String getWeightedSymbol() {
        double rand = random.nextDouble();
        double cumulative = 0;
        for (int i = 0; i < symbols.length; i++) {
            cumulative += probabilities[i];
            if (rand < cumulative) return symbols[i];
        }
        return symbols[symbols.length - 1];
    }

    /** Refills balance after countdown when player runs out of money. */
    private void countdownRefill(Label resultLabel, Label balanceLabel, Button spinButton) {
        int[] counter = {5};
        PauseTransition countdown = new PauseTransition(Duration.seconds(1));
        countdown.setOnFinished(event -> {
            counter[0]--;
            if (counter[0] > 0) {
                resultLabel.setText("Out of money! Refill in " + counter[0] + "...");
                countdown.playFromStart();
            } else {
                player.addWinnings(25);
                balanceLabel.setText("Balance: $" + format(player.getBalance()));
                resultLabel.setText("You received $25 to keep playing!");
                spinButton.setDisable(false);
            }
        });
        countdown.play();
    }

    /** Calculates payout and multiplier based on spin result. */
    private int[] calculatePayout(String[] symbols, int bet) {
        int multiplier = 1;
        if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2])) {
            int index = getSymbolIndex(symbols[0]);
            int basePayout = payouts[index];
            if (isBigSymbol(symbols[0])) multiplier = getMultiplier();
            return new int[]{basePayout * multiplier * bet, multiplier};
        }
        if (allFruits(symbols)) return new int[]{3 * bet, 1};
        return new int[]{0, 1};
    }

    /** Randomly determines multiplier for high-value symbols. */
    private int getMultiplier() {
        int roll = random.nextInt(100) + 1;
        if (roll <= 2) return 10;
        if (roll <= 6) return 5;
        if (roll <= 15) return 2;
        return 1;
    }

    /** Formats win result message for jackpot, multiplier, or fruit combo. */
    private String generateWinMessage(String[] symbols, int payout, int multiplier) {
        if (symbols[0].equals("diamond") && symbols[1].equals("diamond") && symbols[2].equals("diamond")) {
            return "💎💎💎 JACKPOT! You won $" + format(payout) + " with a " + multiplier + "× MULTIPLIER!";
        }
        if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2]) && isBigSymbol(symbols[0]) && multiplier > 1)
            return "You won $" + format(payout) + " with a " + multiplier + "× MULTIPLIER!";
        if (allFruits(symbols)) return "Fruit combo! You won $" + format(payout) + "!";
        return "You won $" + format(payout) + "!";
    }

    /** Checks if symbol is one of the high-value symbols. */
    private boolean isBigSymbol(String symbol) {
        return symbol.equals("diamond") || symbol.equals("number-7") || symbol.equals("bar");
    }

    /** Returns true if all symbols are fruit symbols. */
    private boolean allFruits(String[] symbols) {
        return isFruit(symbols[0]) && isFruit(symbols[1]) && isFruit(symbols[2]);
    }

    /** Checks if the symbol is a fruit symbol. */
    private boolean isFruit(String symbol) {
        return symbol.equals("cherry") || symbol.equals("watermelon") || symbol.equals("lemon");
    }

    /** Finds the index of a symbol in the symbol array. */
    private int getSymbolIndex(String symbol) {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals(symbol)) return i;
        }
        return -1;
    }

    /** Formats numbers using commas for easy readability. */
    private String format(int number) {
        return String.format("%,d", number);
    }
}
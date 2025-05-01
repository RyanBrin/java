/*
 * Project: Casino App
 * Author: Ryan Brinkman
 * Date: April 17, 2025
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/casino-app/
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CasinoApp extends Application {

    private Stage primaryStage;
    private Player player;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.player = new Player(1000); // Start with $100
        showMainScene();
    }

    private void showMainScene() {
        Label titleLabel = new Label("Casino");
        Button startButton = new Button("Menu");
        Button exitButton = new Button("Exit");

        startButton.setOnAction(e -> showMenuScene());
        exitButton.setOnAction(e -> System.exit(0));

        VBox layout = new VBox(10, titleLabel, startButton, exitButton);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Casino App");
        primaryStage.show();
    }

    private void showMenuScene() {
        Label menuLabel = new Label("Casino Menu");
        Button slotGameButton = new Button("Slot Machine");
        Button backButton = new Button("Back");

        slotGameButton.setOnAction(e -> showSlotGameScene());
        backButton.setOnAction(e -> showMainScene());

        VBox layout = new VBox(10, menuLabel, slotGameButton, backButton);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
    }

    private void showSlotGameScene() {
        Label slotGameLabel = new Label("Slot Machine");
        Label balanceLabel = new Label("Balance: $" + player.getBalance());
        TextField betField = new TextField();
        betField.setPromptText("Enter bet");
        Button spinButton = new Button("Spin");
        Label resultLabel = new Label();
        Button backButton = new Button("Back");

        // TODO: Slot image placeholders
        ImageView slotImage1 = new ImageView();
        ImageView slotImage2 = new ImageView();
        ImageView slotImage3 = new ImageView();

        // Set default image sizes (can adjust later)
        slotImage1.setFitWidth(50);
        slotImage1.setFitHeight(50);
        slotImage2.setFitWidth(50);
        slotImage2.setFitHeight(50);
        slotImage3.setFitWidth(50);
        slotImage3.setFitHeight(50);

        spinButton.setOnAction(e -> {
            try {
                int bet = Integer.parseInt(betField.getText());
                if (player.canBet(bet)) {
                    boolean win = Math.random() < 0.3; // 30% win chance
                    if (win) {
                        player.addWinnings(bet);
                        resultLabel.setText("You won $" + bet + "!");
                    } else {
                        player.deductBet(bet);
                        resultLabel.setText("You lost $" + bet + ".");
                    }
                    balanceLabel.setText("Balance: $" + player.getBalance());

                    // TODO: Update slot images here when spinning
                    // Example: slotImage1.setImage(new Image("file:path_to_image.png"));
                } else {
                    resultLabel.setText("Invalid bet or insufficient balance.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter a valid number.");
            }
        });

        backButton.setOnAction(e -> showMenuScene());

        VBox layout = new VBox(10, slotGameLabel, balanceLabel, betField,
                slotImage1, slotImage2, slotImage3,
                spinButton, resultLabel, backButton);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
    }
}
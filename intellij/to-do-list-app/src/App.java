/*
 * Project: To Do List Application
 * Author: Ryan Brinkman
 * Date: 11/07/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/to-do-list-app
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Create a button
        Button clickMeButton = new Button("Click Me!");
        clickMeButton.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        // Create a label
        Label messageLabel = new Label("A Label");

        // Set up the layout
        BorderPane layout = new BorderPane();
        layout.setTop(messageLabel);
        layout.setCenter(clickMeButton);

        // Create the scene and set it to the stage
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setTitle("To Do List App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
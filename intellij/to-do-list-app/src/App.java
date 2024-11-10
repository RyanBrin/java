/*
 * Project: To Do List Application
 * Author: Ryan Brinkman
 * Date: 11/07/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/to-do-list-app
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("To-Do List Application");

        // Create UI elements here (e.g., Labels, Buttons)

        Scene scene = new Scene(new Label("Hello, To-Do List!"), 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


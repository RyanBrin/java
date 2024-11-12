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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Create a button
        Button btn = new Button("Click Me!");
        btn.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        // Create a label
        Label label = new Label("a label");


        // Set up the layout
        StackPane root = new StackPane();
        root.getChildren().addAll(btn, label);

        // Create the scene and set it to the stage
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("To Do List App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}



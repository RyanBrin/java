/*
 * Project: To Do List Application
 * Author: Ryan Brinkman
 * Date: 11/07/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/to-do-list-app/
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.concurrent.atomic.AtomicInteger;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label messageLabel = new Label("Enter a task:");
        TextField taskTextField = new TextField();
        taskTextField.setPromptText("Enter task here");

        Button addTaskButton = new Button("Add Task");
        Button deleteTaskButton = new Button("Delete Task");
        Button clearTasksButton = new Button("Clear Tasks");

        VBox tasksVBox = new VBox(10);
        VBox errorsVBox = new VBox(10);

        AtomicInteger numTasks = new AtomicInteger();
        AtomicInteger numErrors = new AtomicInteger();

        addTaskButton.setOnAction(_ -> {
            String taskText = taskTextField.getText();
            if (!taskText.isEmpty()) {
                numTasks.getAndIncrement();

                HBox taskHBox = new HBox(10);
                Label newTaskLabel = new Label(taskText);
                CheckBox taskCheckBox = new CheckBox();

                taskCheckBox.setOnAction(e -> {
                    if (taskCheckBox.isSelected()) {
                        newTaskLabel.setStyle("-fx-text-fill: green; -fx-strikethrough: true;");
                    } else {
                        newTaskLabel.setStyle("-fx-text-fill: black; -fx-strikethrough: false;");
                    }
                });

                taskHBox.getChildren().addAll(taskCheckBox, newTaskLabel);
                tasksVBox.getChildren().add(taskHBox);

                taskTextField.clear();

                if (numErrors.get() > 0) {
                    errorsVBox.getChildren().clear();
                    numErrors.set(0);
                }
            }
        });

        deleteTaskButton.setOnAction(_ -> {
            if (numTasks.get() > 0) {
                numTasks.getAndDecrement();
                tasksVBox.getChildren().remove(tasksVBox.getChildren().size() - 1);
            } else {
                if (numErrors.get() == 0) {
                    Label errorLabel = new Label("Error: No tasks to delete.");
                    errorsVBox.getChildren().add(errorLabel);
                    numErrors.getAndIncrement();
                }
            }
        });

        clearTasksButton.setOnAction(_ -> {
           if (!numTasks.get() > 0) {
               while (numTasks.get() > 0) {
                   numTasks.getAndDecrement();
                   tasksVBox.getChildren().remove(tasksVBox.getChildren().size() - 1);
                   numErrors.getAndDecrement();
                   if (numTasks.get() == 0) {
                       break;
                   }
               }
           } else {
               Label errorLabel = new Label("Error: No tasks to clear.");
               errorsVBox.getChildren().add(errorLabel);
               numErrors.getAndIncrement();
           }
        });

        HBox buttonsHBox = new HBox(10, addTaskButton, deleteTaskButton, clearTasksButton);
        buttonsHBox.setAlignment(javafx.geometry.Pos.CENTER);
        buttonsHBox.setPadding(new javafx.geometry.Insets(10));

        VBox inputControls = new VBox(10, messageLabel, taskTextField, buttonsHBox);
        inputControls.setPadding(new javafx.geometry.Insets(10));
        BorderPane mainLayout = new BorderPane();
        mainLayout.setTop(inputControls);
        mainLayout.setCenter(tasksVBox);
        mainLayout.setBottom(errorsVBox);

        Scene scene = new Scene(mainLayout, 400, 400);
        primaryStage.setTitle("To Do List App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
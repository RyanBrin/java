/*
 * Project: To Do List Application
 * Author: Ryan Brinkman
 * Date: 11/07/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/to-do-list-app/
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.concurrent.atomic.AtomicInteger;

public class App extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Enter task label
        Label messageLabel = new Label("Enter a task:");

        // TextField for entering task text
        TextField taskTextField = new TextField();
        taskTextField.setPromptText("Enter task here");

        // Button to add task
        Button addTaskButton = new Button("Add Task");

        // Button to delete the last task
        Button deleteTaskButton = new Button("Delete Last Task");

        // VBox to hold tasks
        VBox tasksVBox = new VBox(10);

        // VBox for thrown errors
        VBox errorsVBox = new VBox(10);

        // Number of tasks counter
        AtomicInteger numTasks = new AtomicInteger();

        // Number of errors counter
        AtomicInteger numErrors = new AtomicInteger();

        // Add task event handler
        addTaskButton.setOnAction(event ->
        {
            String taskText = taskTextField.getText();
            if (!taskText.isEmpty())
            {
                numTasks.getAndIncrement();
                Label newTaskLabel = new Label(taskText);
                tasksVBox.getChildren().add(newTaskLabel);
                taskTextField.clear();
                if (numErrors.get() > 0)
                {
                    errorsVBox.getChildren().clear();
                    numErrors.set(0);
                }
            }
        });



        // Delete task event handler
        deleteTaskButton.setOnAction(event ->
        {
            if (numTasks.get() > 0)
            {
                numTasks.getAndDecrement();
                tasksVBox.getChildren().remove(tasksVBox.getChildren().size() - 1);
            }
            else
            {
                if (numErrors.get() == 0)
                {
                    Label errorLabel = new Label("Error: No tasks to delete.");
                    errorsVBox.getChildren().add(errorLabel);
                    numErrors.getAndIncrement();
                }
            }
        });

        // Layout for the input controls
        VBox inputControls = new VBox(10, messageLabel, taskTextField, addTaskButton, deleteTaskButton);

        // Main layout
        BorderPane mainLayout = new BorderPane();
        mainLayout.setTop(inputControls);
        mainLayout.setCenter(tasksVBox);
        mainLayout.setBottom(errorsVBox);

        // Create scene and set it to the stage
        Scene scene = new Scene(mainLayout, 400, 400);
        primaryStage.setTitle("To Do List App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

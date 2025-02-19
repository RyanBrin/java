/*
 * Project: Seating Chart
 * Author: Ryan Brinkman
 * Date: February 12, 2025
 *
 * Description:
 * The SeatingChart program initializes a 3x9 two-dimensional array to represent a classroom seating arrangement.
 * Each element in the array corresponds to a seat, which can be occupied by a student (denoted by their name),
 * marked as empty ("[Empty]"), or designated as unavailable ("[X]"). The program populates the seating chart with
 * predefined values and then prints the chart to the console, displaying the current seating configuration.
 *
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/seating-chart/
 */

public class SeatingChart {
    public static void main(String[] args) {
        // Initialize a 2D array representing the seating chart with populated values
        String[][] seatingChart = {
                {"[Ethan]      ", "[Hunter]     ", "[Empty]      ", "[Empty]      ", "[X]          ", "[Empty]      ", "[Empty]      ", "[Empty]      ", "[Simon]      "},
                {"[Scott]      ", "[Evan]       ", "[Charlie]    ", "[John]       ", "[X]          ", "[Demel]      ", "[Yvesberry]  ", "[Empty]      ", "[Empty]      "},
                {"[Empty]      ", "[Donny]      ", "[Empty]      ", "[Benjamin]   ", "[X]          ", "[Otto]       ", "[Trey]       ", "[Ryan]       ", "[Trent]      "}
        };

        // Print seating chart
        for (int row = 0; row < seatingChart.length; row++) {
            for (int col = 0; col < seatingChart[row].length; col++) {
                System.out.print(seatingChart[row][col] + " ");
            }
            System.out.println();
        }
    }
}
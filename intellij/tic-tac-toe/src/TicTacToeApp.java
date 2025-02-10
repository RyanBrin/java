/*
 * Project: Tic Tac Toe
 * Author: Ryan Brinkman
 * Date: February 10, 2025
 *
 * Description:
 * A simple Tic-Tac-Toe game for two players.
 * Players take turns entering their moves, and the game checks for a winner or a draw.
 *
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/tic-tac-toe/
 */

public class TicTacToeApp {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
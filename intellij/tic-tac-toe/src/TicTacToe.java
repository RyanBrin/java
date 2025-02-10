import java.util.Scanner;

/**
 * TicTacToe Class
 */
public class TicTacToe {
    private final char[][] board; // 3x3 game board
    private final char player1; // Symbol for Player 1
    private final char player2; // Symbol for Player 2

    /**
     * Constructor initializes the Tic-Tac-Toe board and player symbols.
     */
    public TicTacToe() {
        player1 = 'X';
        player2 = 'O';
        board = new char[3][3];

        // Initialize the board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    /**
     * Prints the current state of the board with a formatted grid.
     */
    public void printBoard() {
        System.out.println("  1 2 3"); // Column numbers
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " "); // Row numbers
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]); // Print cell content
                if (j < 2) System.out.print("|"); // Column separator
            }
            System.out.println();
            if (i < 2) System.out.println("  -----"); // Row separator
        }
    }

    /**
     * Manages the game flow, taking turns for each player.
     * The game continues until a player wins or the board is full (draw).
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        boolean gameOver = false;
        int playerTurn = 1; // Keeps track of which player's turn it is

        while (!gameOver) {
            printBoard(); // Show the current board

            // Determine whose turn it is and prompt for input
            if (playerTurn == 1) {
                System.out.println("Player 1 (" + player1 + "): Enter your move (row and column):");
            } else {
                System.out.println("Player 2 (" + player2 + "): Enter your move (row and column):");
            }

            // Validate the move input
            while (true) {
                System.out.print("Row: ");
                row = scanner.nextInt() - 1; // Convert to zero-based index

                System.out.print("Column: ");
                column = scanner.nextInt() - 1; // Convert to zero-based index

                // Check if the move is valid (within bounds and on an empty cell)
                if (row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == ' ') {
                    break; // Valid move, exit loop
                }
                System.out.println("Invalid move. Try again.");
            }

            // Place the player's symbol on the board
            board[row][column] = (playerTurn == 1) ? player1 : player2;

            // Check if the current player has won
            if (checkWin((playerTurn == 1) ? player1 : player2)) {
                printBoard();
                System.out.println("Player " + playerTurn + " wins!");
                gameOver = true;
            }
            // Check if the board is full (draw)
            else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOver = true;
            }
            // Switch turns if no win or draw
            else {
                playerTurn = (playerTurn == 1) ? 2 : 1;
            }
        }
        scanner.close(); // Close scanner to avoid resource leak
    }

    /**
     * Checks if the given player has won the game.
     *
     * @param player The symbol of the player to check ('X' or 'O').
     * @return true if the player has won, false otherwise.
     */
    private boolean checkWin(char player) {
        // Check rows and columns for a winning line
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Row win
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Column win
            }
        }
        // Check diagonals for a winning line
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Main diagonal win
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Anti-diagonal win
        }
        return false; // No win detected
    }

    /**
     * Checks if the board is completely filled, indicating a draw.
     *
     * @return true if the board is full, false otherwise.
     */
    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Empty space found, game is not a draw yet
                }
            }
        }
        return true; // No empty spaces left, it's a draw
    }
}
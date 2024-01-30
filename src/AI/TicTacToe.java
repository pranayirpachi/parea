package AI;

import java.util.*;

public class TicTacToe {
    static final int SIZE = 3;
    static final char EMPTY = ' ';
    static final char PLAYER_X = 'X';
    static final char PLAYER_O = 'O';

    public static void main(String[] args) {
        char[][] board = new char[SIZE][SIZE];
        initializeBoard(board);

        while (true) {
            displayBoard(board);

            // Player X's turn
            makeMove(board, PLAYER_X);
            displayBoard(board);
            if (isGameFinished(board)) {
                break;
            }

            // AI Player O's turn (using Max-Min algorithm)
            makeBestMove(board, PLAYER_O);
            if (isGameFinished(board)) {
                break;
            }
        }
    }

    // Initialize the Tic-Tac-Toe board
    public static void initializeBoard(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            Arrays.fill(board[row], EMPTY);
        }
    }

    // Display the current state of the board
    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < SIZE; row++) {
            System.out.print("| ");
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Check if the game is finished (win, draw, or ongoing)
    public static boolean isGameFinished(char[][] board) {
        return isWin(board, PLAYER_X) || isWin(board, PLAYER_O) || isBoardFull(board);
    }

    // Check if a player has won
    public static boolean isWin(char[][] board, char player) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Check rows
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Check columns
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Check diagonals
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Check diagonals
        }
        return false;
    }

    // Check if the board is full (draw)
    public static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    return false;
                }
            }
        }
        System.out.println("It's a draw!");
        return true;
    }

    // Make a move for the given player (human)
    public static void makeMove(char[][] board, char player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter row and column (e.g., 1 2): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY) {
                board[row][col] = player;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Make the best move for AI player (using Minimax algorithm)
    public static void makeBestMove(char[][] board, char player) {
        int[] bestMove = minimax(board, player);
        board[bestMove[0]][bestMove[1]] = player;
    }

    // Minimax algorithm with recursion
    public static int[] minimax(char[][] board, char player) {
        int[] bestMove = new int[]{-1, -1};
        int bestScore = (player == PLAYER_O) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    board[row][col] = player;
                    int currentScore = minimaxHelper(board, 0, false, PLAYER_X, PLAYER_O);
                    board[row][col] = EMPTY;

                    if ((player == PLAYER_O && currentScore > bestScore) || (player == PLAYER_X && currentScore < bestScore)) {
                        bestScore = currentScore;
                        bestMove[0] = row;
                        bestMove[1] = col;
                    }
                }
            }
        }
        return bestMove;
    }

    // Helper function for Minimax algorithm
    public static int minimaxHelper(char[][] board, int depth, boolean isMaximizing, char player, char opponent) {
        if (isWin(board, PLAYER_X)) {
            return -1; // If the opponent wins, minimize the score
        }
        if (isWin(board, PLAYER_O)) {
            return 1; // If the AI wins, maximize the score
        }
        if (isBoardFull(board)) {
            return 0; // It's a draw
        }

        int bestScore = (isMaximizing) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    board[row][col] = (isMaximizing) ? player : opponent;
                    int currentScore = minimaxHelper(board, depth + 1, !isMaximizing, player, opponent);
                    board[row][col] = EMPTY;

                    if (isMaximizing) {
                        bestScore = Math.max(bestScore, currentScore);
                    } else {
                        bestScore = Math.min(bestScore, currentScore);
                    }
                }
            }
        }
        return bestScore;
    }
}

package Accenture_Coding_Question_2023;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[10][10];
        int dieCount = 0;

        // Read the board configuration
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = scanner.next();
            }
        }

        // Read the die inputs
        String[] dieInputs = scanner.nextLine().trim().split(" ");
        int currentSquare = 0; // Initialize player's position
        int snakesEncountered = 0;
        int laddersEncountered = 0;

        // Iterate through the die inputs
        for (String input : dieInputs) {
            int die = Integer.parseInt(input);
            currentSquare += die;

            int row = 9 - (currentSquare / 10); // Calculate row based on player's position
            int col;
            if (row % 2 == 9 % 2) {
                col = 9 - (currentSquare % 10);
            } else {
                col = currentSquare % 10;
            }

            String square = board[row][col];

            if (square.startsWith("S")) {
                int snakePos = Integer.parseInt(square.substring(2));
                currentSquare = snakePos;
                snakesEncountered++;
            } else if (square.startsWith("L")) {
                int ladderPos = Integer.parseInt(square.substring(2));
                currentSquare = ladderPos;
                laddersEncountered++;
            }

            if (currentSquare == 99) {
                // Player reached the End
                System.out.println("Possible " + snakesEncountered + " " + laddersEncountered);
                return;
            }
        }

        // Player couldn't reach the End
        System.out.println("Not possible " + snakesEncountered + " " + laddersEncountered + " " + currentSquare);
    }
}

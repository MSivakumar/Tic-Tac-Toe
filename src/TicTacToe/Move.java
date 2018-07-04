package TicTacToe;

import java.util.Scanner;

public class Move {
    public static void playerMove(int theSeed) {
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        do {
            if (theSeed == Notations.CROSS) {
                System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
            } else {
                System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
            }
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;
            if (row >= 0 && row < Boardproperties.ROWS && col >= 0 && col < Boardproperties.COLS && Boardproperties.board[row][col] == Notations.EMPTY) {
                Boardproperties.currntRow = row;
                Boardproperties.currentCol = col;
                Boardproperties.board[Boardproperties.currntRow][Boardproperties.currentCol] = theSeed;
                validInput = true;
            } else {
                System.out.println("This move at (" + (row + 1) + "," + (col + 1) + ") is not valid. Try again...");
            }
        } while (!validInput);
    }
}

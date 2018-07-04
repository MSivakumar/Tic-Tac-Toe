package TicTacToe;

import java.util.Scanner;

public class Slide {
    public static void playerMove(int theSeed) {
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        do {
            if (theSeed == Notations.CROSS) {
                System.out.print("Player 'X', select seed to move (row[1-3] column[1-3]): ");
            } else {
                System.out.print("Player 'O', select seed to move (row[1-3] column[1-3]): ");
            }
            Boardproperties.MOVEROW = in.nextInt()-1;
            Boardproperties.MOVECOL = in.nextInt()-1;
            if (Boardproperties.board[Boardproperties.MOVEROW][Boardproperties.MOVECOL] == theSeed && Possiblity.Possiblemoves()) {
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
                    Boardproperties.board[Boardproperties.MOVEROW][Boardproperties.MOVECOL] = Notations.EMPTY;
                    validInput = true;
                } else {
                    System.out.println("This move at (" + (row + 1) + "," + (col + 1) + ") is not valid. Try again...");
                }
            } else {
                System.out.println("You can't move this");
            }
        } while (!validInput);
    }
}

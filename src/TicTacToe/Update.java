package TicTacToe;

public class Update {
    public static void updateGame(int theSeed, int currentRow, int currentCol) {
        if (hasWon(theSeed, currentRow, currentCol)) {  // check if winning move
            Boardproperties.currentState = (theSeed == Notations.CROSS) ? Statusproperties.CROSS_WON : Statusproperties.NOUGHT_WON;
        } /*else if (isDraw()) {
            Boardproperties.currentState = Statusproperties.DRAW;
        }*/
    }
    /*public static boolean isDraw() {
        for (int row = 0; row < Boardproperties.ROWS; ++row) {
            for (int col = 0; col < Boardproperties.COLS; ++col) {
                if (Boardproperties.board[row][col] == Notations.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }*/
    public static boolean hasWon(int theSeed, int currentRow, int currentCol) {
        return (Boardproperties.board[currentRow][0] == theSeed && Boardproperties.board[currentRow][1] == theSeed && Boardproperties.board[currentRow][2] == theSeed
                || Boardproperties.board[0][currentCol] == theSeed && Boardproperties.board[1][currentCol] == theSeed && Boardproperties.board[2][currentCol] == theSeed
                || currentRow == currentCol && Boardproperties.board[0][0] == theSeed && Boardproperties.board[1][1] == theSeed && Boardproperties.board[2][2] == theSeed
                || currentRow + currentCol == 2 && Boardproperties.board[0][2] == theSeed && Boardproperties.board[1][1] == theSeed && Boardproperties.board[2][0] == theSeed);
    }
}

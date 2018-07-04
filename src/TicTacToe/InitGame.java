package TicTacToe;

public class InitGame {
    public static void InitGame(){
        for (int row = 0; row < Boardproperties.ROWS; ++row) {
            for (int col = 0; col < Boardproperties.COLS; ++col) {
                Boardproperties.board[row][col] = Notations.EMPTY;
            }
        }
        Boardproperties.currentState = Statusproperties.PLAYING;
        Boardproperties.currentPlayer = Notations.CROSS;
    }
}

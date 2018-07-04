import TicTacToe.*;

public class TicTacToe {
    public static void main(String[] args) {
        InitGame.InitGame();
        for(int i=0 ; i<6 ; i++) {
            Move.playerMove(Boardproperties.currentPlayer);
            Update.updateGame(Boardproperties.currentPlayer, Boardproperties.currntRow, Boardproperties.currentCol);
            Display.DisplayBoard();
            Boardproperties.currentPlayer = (Boardproperties.currentPlayer == Notations.CROSS) ? Notations.NOUGHT : Notations.CROSS;
            if (Boardproperties.currentState == Statusproperties.CROSS_WON) {
                System.out.println("'X' won! Bye!");
                break;
            } else if (Boardproperties.currentState == Statusproperties.NOUGHT_WON) {
                System.out.println("'O' won! Bye!");
                break;
            } /*else if (Boardproperties.currentState == Statusproperties.DRAW) {
                System.out.println("It's a Draw! Bye!");
                break;
            }*/
        }
        while(Boardproperties.currentState == Statusproperties.PLAYING){
            Slide.playerMove(Boardproperties.currentPlayer);
            Update.updateGame(Boardproperties.currentPlayer, Boardproperties.currntRow, Boardproperties.currentCol);
            Display.DisplayBoard();
            Boardproperties.currentPlayer = (Boardproperties.currentPlayer == Notations.CROSS) ? Notations.NOUGHT : Notations.CROSS;
            if (Boardproperties.currentState == Statusproperties.CROSS_WON) {
                System.out.println("'X' won! Bye!");
            } else if (Boardproperties.currentState == Statusproperties.NOUGHT_WON) {
                System.out.println("'O' won! Bye!");
            }
        }
    }
}
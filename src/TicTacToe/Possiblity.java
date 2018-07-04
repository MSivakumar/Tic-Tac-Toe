package TicTacToe;

public class Possiblity {
    public static boolean Possiblemoves(){
        boolean a,b,c,d;
        a = Check(Boardproperties.MOVEROW-1,Boardproperties.MOVECOL);
        b = Check(Boardproperties.MOVEROW+1,Boardproperties.MOVECOL);
        c = Check(Boardproperties.MOVEROW,Boardproperties.MOVECOL-1);
        d = Check(Boardproperties.MOVEROW,Boardproperties.MOVECOL+1);
        if(a||b||c||d)
            return true;
        else
            return false;
    }
    public static boolean Check(int row,int col){
        if(row>=0 && row<Boardproperties.ROWS && col>=0 && col<Boardproperties.COLS && Boardproperties.board[row][col]==Notations.EMPTY){
            row+=1;
            col+=1;
            System.out.println("Possible move "+row+" "+col);
            return true;
        }
        else
            return false;
    }
}

package TicTacToe;

public class Display {
    public static void DisplayBoard() {
        for (int row = 0; row < Boardproperties.ROWS; ++row) {
            for (int col = 0; col < Boardproperties.COLS; ++col) {
                printCell(Boardproperties.board[row][col]); // print each of the cells
                if (col != Boardproperties.COLS - 1) {
                    System.out.print("|");   // print vertical partition
                }
            }
            System.out.println();
            if (row != Boardproperties.ROWS - 1) {
                System.out.println("-----------"); // print horizontal partition
            }
        }
        System.out.println();
    }

    private static void printCell(int content) {
        switch (content) {
            case Notations.EMPTY:  System.out.print("   "); break;
            case Notations.NOUGHT: System.out.print(" O "); break;
            case Notations.CROSS:  System.out.print(" X "); break;
        }
    }
}

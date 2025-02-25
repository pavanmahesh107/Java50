package DataStructures4.BackTracking;

public class NQueens {
    public static void nQueens(int n) {
        int[][] board = new int[n][n];
        helperNQueens(board, 0);
    }

    public static void print(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    System.out.print('Q' + " ");
                } else {
                    System.out.print('_' + " ");
                }
            }
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~");
    }

    public static boolean isSafetoPlace(int[][] board, int i, int j) {
        // top direction
        for (int ii = i - 1; ii >= 0; ii--) {
            if (board[ii][j] == 1) {
                return false;
            }
        }
        // top left diagonal
        for (int ii = i - 1, jj = j - 1; ii >= 0 && jj >= 0; ii--, jj--) {
            if (board[ii][jj] == 1) {
                return false;
            }
        }
        // top right diagonal
        for (int ii = i - 1, jj = j + 1; ii >= 0 && jj < board.length; ii--, jj++) {
            if (board[ii][jj] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void helperNQueens(int[][] board, int rowIndex) {
        if (rowIndex == board.length) {
            print(board);
            return;
        }

        // For any particular row we have n options
        for (int j = 0; j < board.length; j++) {
            if (isSafetoPlace(board, rowIndex, j)) {
                // place queen at position
                board[rowIndex][j] = 1;
                // make a call to the next row
                helperNQueens(board, rowIndex + 1);
                // unplaced queen from position
                board[rowIndex][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        nQueens(5);
    }
}

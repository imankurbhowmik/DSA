public class Eleven_replaceOwithX {
    public static void main(String[] args) {

    }

    public static void solve(char[][] board) {
        int[][] visitedArray = new int[board.length][board[0].length];
        char[][] modifiedArray = board;

        for(int row=0; row< board.length; row++) {
            for(int col=0 ;col<board[row].length; col++) {
                if(row==0 || row==board.length-1 || col ==0 || col==board[row].length-1) {
                    if(board[row][col] == 'O' && visitedArray[row][col] != 1) {
                        dfs(row, col, visitedArray, board);
                    }
                }
            }
        }

        for(int i=0; i< board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == 'O' && visitedArray[i][j]!=1) {
                    modifiedArray[i][j] = 'X';
                }
            }
        }
        board = modifiedArray;
    }

    public static void dfs(int row, int col, int[][] visitedArray, char[][] board) {
        visitedArray[row][col] = 1;

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        for(int i=0; i<4; i++) {
            int nRow = row+delRow[i];
            int nCol = col+delCol[i];

            if(nRow >= 0 && nRow < board.length && nCol >= 0 && nCol< board[nRow].length && visitedArray[nRow][nCol] != 1 && board[nRow][nCol] == 'O') {
                dfs(nRow, nCol, visitedArray, board);
            }
        }
    }
}
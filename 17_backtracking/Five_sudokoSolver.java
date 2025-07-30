public class Five_sudokoSolver {
    public static void main(String[] args) {

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(emptyLeft == false) break;
        }
        if(emptyLeft) return true;

        for(int num=1; num<9; num++) {
            if(isSafe(board, row, col, num)) {
                board[row][col] = num;
                if(solve(board)) return true;
                else board[row][col] = 0;
            }
        }return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        for(int i=0; i<board.length; i++) {
            if(board[row][col] == num) return false;
        }

        for(int[] nums : board) {
            if(nums[col] == num) return false;
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;

        for(int r=rowStart; r<rowStart+sqrt; r++) {
            for(int c=colStart; c<colStart+sqrt; c++) {
                if(board[r][c] == num) return false;
            }
        }
        return true;
    }
}

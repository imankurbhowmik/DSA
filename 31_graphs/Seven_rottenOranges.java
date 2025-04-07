import java.util.LinkedList;
import java.util.Queue;

public class Seven_rottenOranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int[][] visitedArray = new int[grid.length][grid[0].length];
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[] {i, j, 0});
                    visitedArray[i][j] = 2;
                }
            }
        }

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        int time = 0;

        while(!queue.isEmpty()) {
            int row = queue.peek()[0];
            int col = queue.peek()[1];
            int t = queue.peek()[2];
            time = t;
            queue.poll();
            for(int i=0; i<4; i++) {
                int nRow = row+delRow[i];
                int nCol = col+delCol[i];
                if(nRow>=0 && nCol>=0 && nRow<grid.length && nCol<grid[nRow].length && grid[nRow][nCol] == 1 && visitedArray[nRow][nCol] != 2) {
                    visitedArray[nRow][nCol] = 2;
                    queue.add(new int[]{nRow, nCol, t+1});
                }
            }
        }
        for(int i=0; i< grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    if(visitedArray[i][j] != 2) {
                        return -1;
                    }
                }
            }
        }
        return time;
    }
}
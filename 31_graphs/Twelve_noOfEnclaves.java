import java.util.LinkedList;
import java.util.Queue;

public class Twelve_noOfEnclaves {
    public static void main(String[] args) {

    }

    public static int numEnclaves(int[][] grid) {
        int[][] visitedArray = new int[grid.length][grid[0].length];
        int count = 0;
        bfs(grid, visitedArray);

        for(int i=0; i< grid.length; i++) {
            for(int j=0; j< grid[i].length; j++) {
                if(grid[i][j] == 1 && visitedArray[i][j] != 1) count++;
            }
        }
        return count;
    }

    public static void bfs(int[][] grid, int[][] visitedArray) {
        Queue<int[]> queue = new LinkedList<>();
        for(int j=0; j<grid[0].length; j++) {
            if(grid[0][j] == 1 && visitedArray[0][j] != 1) {
                queue.add(new int[] {0, j});
                visitedArray[0][j] = 1;
            }
        }
        for(int j=0; j<grid[0].length; j++) {
            if(grid[grid.length-1][j] == 1 && visitedArray[grid.length-1][j] != 1) {
                queue.add(new int[] {grid.length-1, j});
                visitedArray[grid.length-1][j] = 1;
            }
        }
        for(int i=0; i<grid.length; i++) {
            if(grid[i][0] == 1 && visitedArray[i][0] != 1) {
                queue.add(new int[] {i, 0});
                visitedArray[i][0] = 1;
            }
        }
        for(int i=0; i<grid.length; i++) {
            if(grid[i][grid[i].length-1] == 1 && visitedArray[i][grid[i].length-1] != 1) {
                queue.add(new int[] {i, grid[i].length-1});
                visitedArray[i][grid[i].length-1] = 1;
            }
        }

        while(!queue.isEmpty()) {
            int currRow = queue.peek()[0];
            int currCol = queue.peek()[1];
            queue.poll();

            int[] delRow = {-1, 0, 1, 0};
            int[] delCol = {0, 1, 0, -1};

            for (int i = 0; i < 4; i++) {
                int nRow = currRow+delRow[i];
                int nCol = currCol+delCol[i];

                if(nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[nRow].length && visitedArray[nRow][nCol] != 1 && grid[nRow][nCol] == 1) {
                    queue.add(new int[] {nRow, nCol});
                    visitedArray[nRow][nCol] = 1;
                }
            }
        }
    }
}
import java.util.LinkedList;
import java.util.Queue;

public class Five_noOfIslands {
    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int[][] visitedArray = new int[grid.length][grid[0].length];
        int count = 0;

        for(int row=0; row< grid.length; row++) {
            for(int col=0; col<grid[row].length; col++) {
                if(grid[row][col] == '1' && visitedArray[row][col] != 1) {
                    count++;
                    bfs(row, col, visitedArray, grid);
                }
            }
        }
        return count;
    }

    public static void bfs(int row, int col, int[][] visitedArray, char[][] grid) {
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(row, col));

        while(! queue.isEmpty()) {
            Pair node = queue.poll();
            if(node.first>0 && grid[node.first-1][node.second] == '1' && visitedArray[node.first-1][node.second] != 1) {
                queue.add(new Pair(node.first-1, node.second));
                visitedArray[node.first-1][node.second] = 1;
            }
            if(node.second>0 && grid[node.first][node.second-1] == '1' && visitedArray[node.first][node.second-1] != 1) {
                queue.add(new Pair(node.first, node.second-1));
                visitedArray[node.first][node.second-1] = 1;
            }
            if(node.first< grid.length-1 && grid[node.first+1][node.second] == '1' && visitedArray[node.first+1][node.second] != 1) {
                queue.add(new Pair(node.first+1, node.second));
                visitedArray[node.first+1][node.second] = 1;
            }
            if(node.second<grid[node.first].length-1 && grid[node.first][node.second+1] == '1' && visitedArray[node.first][node.second+1] != 1) {
                queue.add(new Pair(node.first, node.second+1));
                visitedArray[node.first][node.second+1] = 1;
            }
        }
    }
}

class Pair{
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
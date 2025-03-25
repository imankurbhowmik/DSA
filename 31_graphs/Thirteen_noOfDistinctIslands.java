import java.util.ArrayList;
import java.util.HashSet;

public class Thirteen_noOfDistinctIslands {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 1,1}, {1, 0, 0, 0, 0}, {0, 0, 0, 1, 1}, {1, 1, 0, 1, 0}};
        System.out.println(countDistinctIslands(grid));
    }

    public static int countDistinctIslands(int[][] grid) {
        int[][] visitedArray = new int[grid.length][grid[0].length];

        HashSet<String> set = new HashSet<>();

        for(int row=0; row<grid.length; row++) {
            for(int col=0; col<grid[row].length; col++) {
                if(grid[row][col] == 1 && visitedArray[row][col] != 1) {
                    ArrayList<Pair3> list = new ArrayList<>();
                    dfs(row, col, visitedArray, grid, list, row, col);
                    set.add(listToString(list));
                }
            }
        }return set.size();
    }

    public static String listToString(ArrayList<Pair3> list) {
        String ans = "";
        StringBuilder returnedString = new StringBuilder();
        returnedString.append("{");
        for(Pair3 pair: list) {
            returnedString.append("(" + pair.row + ",");
            returnedString.append(pair.col + ")");
        }
        returnedString.append("}");
        ans = returnedString.toString();
        return ans;
    }

    public static void dfs(int sr, int sc, int[][] visitedArray, int[][] grid, ArrayList<Pair3> list, int baseRow, int baseCol) {
        int modifiedRow = sr-baseRow;
        int modifiedCol = sc-baseCol;
        list.add(new Pair3(modifiedRow, modifiedCol));
        visitedArray[sr][sc] = 1;

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        for(int i=0; i<4; i++) {
            int currRow = sr+delRow[i];
            int currCol = sc+delCol[i];

            if(currRow>=0 && currRow<grid.length && currCol>=0 && currCol<grid[currRow].length && visitedArray[currRow][currCol] != 1 && grid[currRow][currCol] == 1) {
                dfs(currRow, currCol, visitedArray, grid, list, baseRow, baseCol);
            }
        }
    }
}

class Pair3{
    int row;
    int col;

    public Pair3(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
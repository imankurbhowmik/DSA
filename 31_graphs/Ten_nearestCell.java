import java.util.LinkedList;
import java.util.Queue;

public class Ten_nearestCell {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] ans = updateMatrix(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j=0 ; j<mat[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][] visitedArray = new int[mat.length][mat[0].length];
        int[][] distanceMatrix = new int[mat.length][mat[0].length];
        bfs(visitedArray, mat, distanceMatrix);
        return distanceMatrix;
    }

    public static void bfs(int[][] visitedArray, int[][] mat, int[][] distanceMatrix) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i< mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == 0) {
                    queue.add(new int[]{i, j, 0});
                    visitedArray[i][j] = 1;
                }
            }
        }

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        while(!queue.isEmpty()) {
            int currRow = queue.peek()[0];
            int currCol = queue.peek()[1];
            int step = queue.peek()[2];
            distanceMatrix[currRow][currCol] = step;
            queue.poll();

            for (int i = 0; i < 4; i++) {
                int nRow = currRow + delRow[i];
                int nCol = currCol + delCol[i];

                if(nRow >= 0 && nRow < mat.length && nCol >= 0 && nCol < mat[nRow].length && mat[nRow][nCol] == 1 && visitedArray[nRow][nCol] != 1) {
                    queue.add(new int[]{nRow, nCol, step+1});
                    visitedArray[nRow][nCol] = 1;
                }
            }
        }
    }
}
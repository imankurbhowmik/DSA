import java.util.Arrays;

public class Two_allPath {
    public static void main(String[] args) {

    }

    public static void allPath(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if(r>0) {
            allPath(p+'U', maze, r-1, c);
        }

        if(c>0) {
            allPath(p+'L', maze, r, c-1);
        }

        if(r<maze.length-1) {
            allPath(p+'D', maze, r+1, c);
        }

        if(c<maze[0].length-1) {
            allPath(p+'R', maze, r, c+1);
        }

        maze[r][c] = true;
    }

    public static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int steps) {
        if(r==maze.length-1 && c==maze[0].length-1) {
            path[r][c] = steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();;
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;

        if(r>0) {
            allPathPrint(p+'U', maze, r-1, c, path, steps+1);
        }

        if(c>0) {
            allPathPrint(p+'L', maze, r, c-1, path, steps+1);
        }

        if(r<maze.length-1) {
            allPathPrint(p+'D', maze, r+1, c, path, steps+1);
        }

        if(c<maze[0].length-1) {
            allPathPrint(p+'R', maze, r, c+1, path, steps+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
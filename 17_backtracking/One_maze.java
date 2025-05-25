import java.util.ArrayList;

public class One_maze {
    public static void main(String[] args) {

    }

    public static int count(int r, int c) {
        if(r==1 || c==1) {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left+right;
    }

    public static void path(String p, int r, int c) {
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }

        if(r>1) {
            path(p+'D', r-1, c);
        }

        if(c>1) {
            path(p+'R', r, c-1);
        }
    }

    public static ArrayList<String> pathRet(String p, int r, int c) {
        if(r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1) {
            list.addAll(pathRet(p+'D', r-1, c));
        }

        if(c>1) {
            list.addAll(pathRet(p+'R', r, c-1));
        }

        return list;
    }

    public static ArrayList<String> pathDiagRet(String p, int r, int c) {
        if(r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1) {
            list.addAll(pathDiagRet(p+'D', r-1, c-1));
        }

        if(r>1) {
            list.addAll(pathDiagRet(p+'V', r-1, c));
        }

        if(c>1) {
            list.addAll(pathDiagRet(p+'H', r, c-1));
        }

        return list;
    }

    public static void pathrestrictions(String p, boolean[][] maze, int r, int c) {
        if(r==maze.length-1 && c==maze[0].length-1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        if(r<maze.length-1) {
            pathrestrictions(p+'D', maze, r+1, c);
        }

        if(c<maze[0].length-1) {
            pathrestrictions(p+'R', maze, r, c+1);
        }
    }
}
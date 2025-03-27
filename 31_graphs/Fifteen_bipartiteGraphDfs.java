import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Fifteen_bipartiteGraphDfs {
    public static void main(String[] args) {
        
    }

    public static boolean ifBipartite(ArrayList<ArrayList> adj) {
        int[] coloredArray = new int[adj.size()];
        Arrays.fill(coloredArray, -1);

        for(int i=0; i<adj.size(); i++) {
            if(dfs(i, 0, coloredArray, adj) == false) return false;
        }
        return true;
    }

    private static boolean dfs(int node, int color, int[] coloredArray, ArrayList<ArrayList<Integer>> list) {
        coloredArray[node] = color;

        for(Integer neighbour : list.get(node)) {
            if(coloredArray[neighbour] == -1) {
                if(dfs(neighbour, 1-color, coloredArray, list) == false) return false;
            } else if (coloredArray[neighbour] == color) {
                return false;
            }
        }
        return true;
    }
}
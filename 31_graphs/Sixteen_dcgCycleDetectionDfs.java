import java.util.ArrayList;

public class Sixteen_dcgCycleDetectionDfs {
    public static void main(String[] args) {
        
    }
    
    public static boolean detectCycle(ArrayList<ArrayList<Integer>> adj) {
        int[] visitedArray = new int[adj.size()];
        int[] pathVisited = new int[adj.size()];
        
        for(int i=0; i<adj.size(); i++) {
            if(visitedArray[i] == 0) {
                if(dfs(i, visitedArray, pathVisited, adj) == true) return true;
            }
        }
        return false;
    }
    
    private static boolean dfs(int node, int[] visitedArray, int[] pathVisited, ArrayList<ArrayList<Integer>> list) {
        visitedArray[node] = 1;
        pathVisited[node] = 1;
        
        for(Integer neighbour : list.get(node)) {
            if(visitedArray[neighbour] == 0) {
                if(dfs(neighbour, visitedArray, pathVisited, list)== true) return true;
            } else if (pathVisited[neighbour] == 1) {
                return true;
            }
        }
        pathVisited[node] = 0;
        return false;
    }
}
import java.util.ArrayList;

public class Nine_detectCycleDFS {
    public static void main(String[] args) {

    }

    public static boolean detectCycle (ArrayList<ArrayList<Integer>> adj, int node) {
        int[] visitedArray = new int[adj.size()];
        visitedArray[node] = 1;
        for(int i=1; i<adj.size(); i++) {
            if(visitedArray[i] != 1){
                if(dfs(visitedArray, adj, node, -1)) return true;
            }
        }return false;
    }

    public static boolean dfs (int[] visitedArray, ArrayList<ArrayList<Integer>> adjacencyList, int node, int parent) {
        visitedArray[node] = 1;
        for(Integer neighbour : adjacencyList.get(node)) {
            if(visitedArray[neighbour] != 1) {
                if(dfs(visitedArray, adjacencyList, neighbour, node)) return true;
            } else if (visitedArray[neighbour] == 1 && neighbour != parent) return true;
        }
        return false;
    }
}
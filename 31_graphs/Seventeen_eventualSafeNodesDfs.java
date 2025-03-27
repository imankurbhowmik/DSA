import java.util.ArrayList;

public class Seventeen_eventualSafeNodesDfs {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> findSafeNodes(ArrayList<ArrayList<Integer>> adj, int node) {
        int[] visitedArray = new int[adj.size()];
        int[] pathVisited = new int[adj.size()];
        int[] check = new int[adj.size()];
        ArrayList<Integer> safeNodes = new ArrayList<>();

        for(int i=0; i<adj.size(); i++) {
            if(visitedArray[i] != 1) {
                dfs(node, adj, visitedArray, pathVisited, check);
            }
        }

        for(int i=0; i<adj.size(); i++) {
            if(check[i] == 1) {
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }

    private static boolean dfs(int node, ArrayList<ArrayList<Integer>> list, int[] visitedArray, int[] pathVisited, int[] check) {
        visitedArray[node] = 1;
        pathVisited[node] = 1;

        for(Integer neighbour : list.get(node)) {
            if(visitedArray[neighbour] == 0) {
                if(dfs(neighbour, list, visitedArray, pathVisited, check)) return true;
            } else if (pathVisited[neighbour] == 1) {
                return true;
            }
        }
        check[node] = 1;
        pathVisited[node] = 0;
        return false;
    }
}

import java.util.ArrayList;

public class Three_dfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ans(adj);
    }

    public static ArrayList<Integer> ans(ArrayList<ArrayList<Integer>> adjacencyList) {
        int[] visitedArray = new int[adjacencyList.size()];
        visitedArray[0] = 1;

        ArrayList<Integer> dfs = new ArrayList<>();

        return dfs(0, visitedArray, dfs, adjacencyList);
    }

    public static ArrayList<Integer> dfs (int n, int[] visitedArray, ArrayList<Integer> dfs, ArrayList<ArrayList<Integer>> adjacencyList) {
        visitedArray[n] = 1;
        dfs.add(n);

        for(int neighbour : adjacencyList.get(n)) {
            if(visitedArray[neighbour] != 1) {
                dfs(n, visitedArray, dfs, adjacencyList);
            }
        }
        return dfs;
    }
}
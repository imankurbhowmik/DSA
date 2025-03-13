import java.util.ArrayList;

public class Four_noOfProvinces {

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(findCircleNum(isConnected));
    }

    public static int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for(int i=0; i<isConnected.length; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0 ; i<isConnected.length; i++) {
            for(int j=0 ; j<isConnected.length; j++) {
                if(i != j) {
                    if(isConnected[i][j] == 1) {
                        adjacencyList.get(i).add(j);
                        adjacencyList.get(j).add(i);
                    }
                }
            }
        }

        int[] visitedArray = new int[adjacencyList.size()];
        int count = 0;

        for(int i=0; i<visitedArray.length; i++) {
            if(visitedArray[i] != 1) {
                count++;
                dfs(i, visitedArray, adjacencyList);
            }
        }
        return count;
    }

    public static void dfs(int node, int[] visitedArray, ArrayList<ArrayList<Integer>> adjacencyList) {
        visitedArray[node] = 1;

        for(Integer n : adjacencyList.get(node)) {
            if(visitedArray[n] != 1) {
                dfs(n, visitedArray, adjacencyList);
            }
        }
    }
}
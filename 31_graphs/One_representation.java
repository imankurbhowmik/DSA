import java.util.ArrayList;

public class One_representation {

    // adjacency matrix
    public static void adjacencyMatrix (int n, int m) {
        int nodes = n;
        int edges = m;

        int[][] adjacencyMatrix = new int[n+1][n+1];

        adjacencyMatrix[1][2] = 1;
        adjacencyMatrix[2][1] = 1;
        //adjacencyMatrix[u][v] = adjacencyMatrix[v][u];
    }

    //adjacency list
    public static void adjacencyList(int n, int m) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<=n; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        adjacencyList.get(2).add(1);
        adjacencyList.get(1).add(2);
//        adjacencyList.get(u).add(v);
//        adjacencyList.get(v).add(u);

        //printing
        for (int i = 0; i <= n; i++) {
            for(int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print(adjacencyList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        adjacencyMatrix(5,5);
//        adjacencyList(5 ,5);
    }
}
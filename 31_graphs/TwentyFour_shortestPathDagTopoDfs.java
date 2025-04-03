import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TwentyFour_shortestPathDagTopoDfs {
    public static void main(String[] args) {
        int V = 4;
        int E = 2;
        int[][] edges = {{0,1,2}, {0,2,1}};

        for(int i=0; i<V; i++) {
            System.out.print(shortestPath(V, E, edges)[i] + " ");
        }
    }

    public static int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<ArrayList<Pair4>> adjacencyList = new ArrayList<>();

        for (int i=0; i<V; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<E; i++) {
            adjacencyList.get(edges[i][0]).add(new Pair4(edges[i][1], edges[i][2]));
        }

        int[] visited = new int[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<V; i++) {
            if(visited[i] == 0) {
                topoSort(adjacencyList, visited, i, stack);
            }
        }

        int[] distance = new int[V];
        for(int i=0; i<V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[0] = 0;

        while(!stack.isEmpty()) {
            int node = stack.pop();

            for(Pair4 pair : adjacencyList.get(node)) {
                if(distance[pair.neighbour] > distance[node] + pair.weight){
                    distance[pair.neighbour] = distance[node] + pair.weight;
                }
            }
        }

        for(int i=0; i<V; i++) {
            if(distance[i] == Integer.MAX_VALUE) distance[i] = -1;
        }

        return distance;
    }

    private static void topoSort(ArrayList<ArrayList<Pair4>> adjacencyList, int[] visited, int node, Stack<Integer> stack) {
        visited[node] = 1;

        for(Pair4 pair : adjacencyList.get(node)) {
            if(visited[pair.neighbour] == 0) {
                topoSort(adjacencyList, visited, pair.neighbour, stack);
            }
        }
        stack.push(node);
    }
}

class Pair4 {
    int neighbour;
    int weight;

    public Pair4() {

    }

    public Pair4(int neighbour, int weight) {
        this.neighbour = neighbour;
        this.weight = weight;
    }
}
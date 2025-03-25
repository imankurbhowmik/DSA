import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Fourteen_bipartiteGraph {
    public static void main(String[] args) {
        int[][] graph = {{},{2,4,6},{1,4,8,9},{7,8},{1,2,8,9},{6,9},{1,5,7,8,9},{3,6,9},{2,3,4,6,9},{2,4,5,6,7,8}};
        System.out.println(isBipartite(graph));
    }

    public static boolean isBipartite(int[][] graph) {
        int[] coloredArray = new int[graph.length];
        Arrays.fill(coloredArray, -1);


        for(int i=0; i< graph.length; i++) {
            if(coloredArray[i] == -1) {
                coloredArray[i] = 0;
                if(bfs(graph, coloredArray, i) == false) {
                    return false;
                }
            }
        }return true;
    }

    private static boolean bfs(int[][] graph, int[] coloredArray, int sc) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sc);

        while(!queue.isEmpty()) {
            Integer node = queue.poll();

            for(Integer neighbour : graph[node]) {
                if(coloredArray[neighbour] == -1) {
                    queue.add(neighbour);
                    coloredArray[neighbour] = 1-coloredArray[node];
                } else if (coloredArray[neighbour] != -1 && coloredArray[neighbour] == coloredArray[node]) {
                    return false;
                }
            }
        }return true;
    }
}
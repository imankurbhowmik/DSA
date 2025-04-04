// undirected graph

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TwentyFive_shortestPathBfs {
    public static void main(String[] args) {

    }

    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int[] distance = new int[adj.size()];

        for(int i=0; i<adj.size(); i++) {
            distance[i] = (int)(1e9);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        distance[src] = 0;

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for(Integer neighbour: adj.get(node)) {
                if(distance[node] + 1 < distance[neighbour]) {
                    distance[neighbour] = distance[node] + 1;
                    queue.add(neighbour);
                }
            }
        }
        for(int i=0; i<distance.length; i++) {
            if(distance[i] == 1e9) distance[i] = -1;
        }
        return distance;
    }
}
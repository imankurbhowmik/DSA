import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Twenty_dcgCycleDetectionBfs {
    public static void main(String[] args) {

    }

    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[adj.size()];

        for(int i=0; i<adj.size(); i++) {
            for(Integer node : adj.get(i)) {
                indegree[node] ++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        for(int i=0; i<adj.size(); i++) {
            if(indegree[i] == 0) queue.add(i);
        }

        while(!queue.isEmpty()) {
            int node = queue.poll();
            count++;

            for (Integer neighbour : adj.get(node)) {
                indegree[neighbour] --;

                if(indegree[neighbour] == 0) queue.add(neighbour);
            }
        }
        return count != adj.size();
    }
}

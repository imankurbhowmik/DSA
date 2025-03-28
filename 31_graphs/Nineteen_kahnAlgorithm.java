import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Nineteen_kahnAlgorithm {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> topo(ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[adj.size()];

        for(int i=0; i<adj.size(); i++) {
            for(Integer it : adj.get(i)) {
                indegree[it] ++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> topoAns = new ArrayList<>();

        for(int i=0; i<adj.size(); i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }

        while(!queue.isEmpty()) {
            int node = queue.peek();
            topoAns.add(node);
            queue.poll();

            for (Integer neighbour : adj.get(node)) {
                indegree[neighbour] -- ;
                if(indegree[neighbour] == 0) queue.add(neighbour);
            }
        }
        return topoAns;
    }
}

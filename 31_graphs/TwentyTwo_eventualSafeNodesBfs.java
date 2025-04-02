import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TwentyTwo_eventualSafeNodesBfs {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> eventualSafeNodes (int V, ArrayList<ArrayList<Integer>> adjacencyList) {
        ArrayList<ArrayList<Integer>> adjRev = new ArrayList<>();

        for(int i=0; i<V; i++) {
            for(Integer It : adjacencyList.get(i)) {
                adjRev.get(It).add(i);
            }
        }

        int[] indegree = new int[V];

        for(int i=0; i<V; i++) {
            for(int It : adjRev.get(i)) {
                indegree[It] ++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<V; i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }
        ArrayList<Integer> safeNodes = new ArrayList<>();

        while(!queue.isEmpty()) {
            int node = queue.poll();
            safeNodes.add(node);

            for(Integer neighbour : adjRev.get(node)) {
                indegree[neighbour] --;
                if(indegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }

        }
        safeNodes.sort(null);
        return safeNodes;
    }
}
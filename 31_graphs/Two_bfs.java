import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Two_bfs {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> bfs (int nodes, ArrayList<Integer> adjacencyList) {
        ArrayList<Integer> bfs = new ArrayList<>();

        int[] visitedArray = new int[adjacencyList.size()];
        visitedArray[0] = 1;

        Queue<Integer> queue = new LinkedList();
        queue.add(0);

        while(!queue.isEmpty()) {
            Integer node = queue.poll();
            bfs.add(node);

            for(Integer it: adjacencyList.get(node)) {
                if(visitedArray[it] != 1) {
                    visitedArray[it] = 1;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
}
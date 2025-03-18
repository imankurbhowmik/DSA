import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Eight_detectCycleBFS {
    public static void main (String[] args) {

    }

    public static boolean detectCycle(ArrayList<ArrayList<Integer>>adj, int src) {
        int[] visitedArray = new int[adj.size()];
        visitedArray[src] = 1;
        for(int i=1; i<adj.size(); i++) {
            if(visitedArray[i] != 1) {
                if(bfs(adj, src, visitedArray)) return true;
            }
        }return false;
    }

    public static boolean bfs (ArrayList<ArrayList<Integer>> adjacencyList, int src, int[] visitedArray) {
        Queue<Pair2> queue = new LinkedList<Pair2>();
        queue.add(new Pair2(src, -1));
        visitedArray[src] = 1;

        while(!queue.isEmpty()) {
            int present = queue.peek().presentNode;
            int parent = queue.peek().parent;
            queue.poll();

            for(Integer neighbour:adjacencyList.get(present)) {
                if(parent != neighbour && visitedArray[neighbour] != 1) {
                    queue.add(new Pair2(neighbour, present));
                    visitedArray[neighbour] = 1;
                } else if (visitedArray[neighbour] == 1 && neighbour != parent) {
                    return true;
                }
            }
        }return false;
    }
}

class Pair2 {
    int presentNode;
    int parent;

    public Pair2(int presentNode, int parent) {
        this.presentNode = presentNode;
        this.parent = parent;
    }
}
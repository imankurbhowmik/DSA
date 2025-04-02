import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TwentyThree_alienDictionary {
    public static void main(String[] args) {

    }

    public static String findOrder (String[] dict, int N, int K) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for(int i=0; i<N-1; i++) {
            String s1 = dict[i];
            String s2 = dict[i+1];

            int len = Math.min(s1.length(), s2.length());

            for(int j=0; j<len; j++) {
                if(s1.charAt(j) != s2.charAt(j)) {
                    adjacencyList.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                }
            }
        }
        String ans = "";

        for(int i=0; i<K; i++) {
            ans = ans + topo(adjacencyList, K).get(i);
        }

        return ans;
    }

    private static ArrayList<Integer> topo(ArrayList<ArrayList<Integer>> adj, int K) {
        int[] indegree = new int[K];
        ArrayList<Integer> topo = new ArrayList<>();

        for(int i=0; i<adj.size(); i++) {
            for(Integer It : adj.get(i)) {
                indegree[It] ++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<indegree.length; i++) {
            if(indegree[i] == 0) queue.add(i);
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo.add(node);

            for (Integer neighbour : adj.get(node)) {
                indegree[neighbour] -- ;
                if (indegree[neighbour] == 0) queue.add(neighbour);
            }
        }
        return topo;
    }
}
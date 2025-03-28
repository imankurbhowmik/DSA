import java.util.ArrayList;
import java.util.Stack;

public class Eighteen_topoSortDfs {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> topo(ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        int[] visitedArray = new int[adj.size()];
        ArrayList<Integer> topoAns = new ArrayList<>();

        for(int i=0; i<adj.size(); i++) {
            if(visitedArray[i] != 1) {
                dfs(adj, i, stack, visitedArray);
            }
        }

        while(!stack.isEmpty()) {
            topoAns.add(stack.peek());
            stack.pop();
        }
        return topoAns;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> list, int node, Stack<Integer> stack, int[] visitedArray) {
        visitedArray[node] = 1;

        for(Integer neighbour : list.get(node)) {
            if(visitedArray[neighbour] != 1) {
                dfs(list, neighbour, stack, visitedArray);
            }
        }
        stack.push(node);
    }
}
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

public class TwentyOne_courseSchedule {
    public static void main(String[] args) {
        int[][] prerequisites = {{1, 0}, {2, 1}, {3, 2}};
//        System.out.println(findOrder(4, prerequisites));
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<numCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0; i<prerequisites.length; i++) {
            adjacencyList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegree = new int[numCourses];

        for(int i=0; i<adjacencyList.size(); i++) {
            for(Integer node : adjacencyList.get(i)){
                indegree[node] ++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<indegree.length; i++) {
            if(indegree[i] == 0) {
                queue.add(i);
            }
        }

        ArrayList<Integer> order = new ArrayList<>();
        int[] orderArray = new int[numCourses];
        int count = 0;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            count++;
            order.add(node);

            for(Integer neighbour : adjacencyList.get(node)) {
                indegree[neighbour] --;
                if(indegree[neighbour] == 0) queue.add(neighbour);
            }
        }

        if(count == numCourses) {
            for (int i = 0; i < numCourses; i++) {
                orderArray[i] = order.get(i);
            }
            return orderArray;
        };
        return new int[]{};
    }
}
import java.util.*;

public class One_inbuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(56);
        stack.push(52);
        stack.push(50);
        stack.push(51);
        stack.push(58);
        stack.push(55);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();

        queue.add(39);
        queue.add(30);
        queue.add(31);
        queue.add(33);
        queue.add(32);
        queue.add(34);
        queue.add(36);


        System.out.println(queue.peek());  // gets the head

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> dequeue = new ArrayDeque<>();
    }
}
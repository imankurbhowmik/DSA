import java.util.Stack;

public class Eight_implementQueueStackRemove {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public Eight_implementQueueStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) throws Exception{
        while(!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);

        while(!second.isEmpty()) {
            first.push(second.pop());
        }

    }

    public int remove() throws Exception{
        return first.pop();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    public int peek () throws Exception{
        return first.peek();
    }
}
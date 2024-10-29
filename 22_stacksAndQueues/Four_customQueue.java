public class Four_customQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public Four_customQueue() {
        this(DEFAULT_SIZE);
    }

    public Four_customQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if(isFull()) {
            return false;
        }

    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }
}
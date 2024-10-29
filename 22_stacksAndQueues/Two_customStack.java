public class Two_customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Two_customStack() {
        this(DEFAULT_SIZE);
    }

    public Two_customStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("stack is full !!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Two_stackException{
        if(isEmpty()) {
            throw new Two_stackException("cannot remove from empty stack !!");
        }
        int removed = data[ptr];
        ptr --;
        return removed;
    }

    public int peek() throws Two_stackException{
        if(isEmpty()){
            throw new Two_stackException("cannot peek from an empty stack !!") ;
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

}
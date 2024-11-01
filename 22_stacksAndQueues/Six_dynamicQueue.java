public class Six_dynamicQueue extends Five_circularQueue {
    public Six_dynamicQueue() {
        super();
    }

    public Six_dynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()) {
            int[] temp = new int[data.length * 2];

            for(int i=0; i<data.length; i++) {
                temp[i] = data[(i+front)%data.length];
                front = 0;
                end = data.length;
                data = temp;
            }

        }return super.insert(item);
    }
}
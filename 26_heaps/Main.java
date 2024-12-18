import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(45);
        heap.insert(89);
        heap.insert(57);
        heap.insert(12);
        heap.insert(90);
        heap.insert(32);

        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }

}
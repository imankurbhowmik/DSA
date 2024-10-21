import java.util.LinkedList;


public class One_customLL {

    private Node head;
    private Node tail;

    private int size;

    public One_customLL() {
        this.size = 0;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size+=1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);

        if(tail == null) {
            insertFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
public class Three_customCLL {

    private Node head;
    private Node tail;

    public Three_customCLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);

        if(head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail=node;
    }

    public void display () {
        Node node = head;
        if(head != null) {
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
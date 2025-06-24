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
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // insert using recursion

    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec (int value, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);
        return node;
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

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete (int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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

    // questions

    // duplicates
    public void duplicates() {
        Node node = head;

        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }tail = node;
        tail.next = null;
    }

    // merge

    public static One_customLL merge(One_customLL first, One_customLL second) {
        Node f = first.head;
        Node s = second.head;

        One_customLL ans = new One_customLL();

        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    // check cycle
    public static boolean checkCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast.next==null && fast.next.next == null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow) return true;
        }
        return false;
    }
//

    // find length of cycle

    public int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                Node temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }
//  detect start of cycle

//    public ListNode detectCycle(ListNode head) {
//
//        if(calculateLength(head) == 0) {
//            return null;
//        }
//
//        ListNode first = head;
//        ListNode second = head;
//        int l = calculateLength(head);
//
//        while(l>0) {
//            second = second.next;
//            l--;
//        }
//
//        while(first != second) {
//            first = first.next;
//            second = second.next;
//        }
//        return second;
//
//    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1) {
            return true;
        }return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while(number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number/=10;
        }return ans;
    }

    // find middle of linked list

    public Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        Node midPrev = slow;

        while(fast != null && fast.next!=null) {
            midPrev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(midPrev!=null) {
            midPrev.next = null;
        }
        return slow;

    }

    // bubble sort
    public void bubbleSort() {
        bubbleSort(size-1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row==0) {
            return;
        }

        if(col<row) {
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value) {
                if(first==head) {
                    head = second;
                    first.next=second.next;
                    second.next=first;
                }
                else if(second==tail) {
                    Node p = get(col-1);
                    p.next=second;
                    tail=first;
                    first.next= null;
                    second.next= tail;
                }
                else {
                    Node p = get(col-1);
                    p.next=second;
                    first.next= second.next;
                    second.next=first;
                }
            }bubbleSort(row, col+1);
        }else {
            bubbleSort(row-1, 0);
        }
    }

    //recursion reverse
    private void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail= node;
        tail.next= null;
    }


    public static void main(String[] args) {
        One_customLL first = new One_customLL();
        One_customLL second = new One_customLL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        One_customLL ans = One_customLL.merge(first, second);
        ans.display();


    }
}
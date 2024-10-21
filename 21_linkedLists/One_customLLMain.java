public class One_customLLMain {
    public static void main(String[] args) {
        One_customLL list = new One_customLL();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);

        System.out.println(list.deleteLast());
        list.display();
    }
}

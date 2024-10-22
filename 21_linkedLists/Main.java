public class Main {
    public static void main(String[] args) {
//        Three_customCLL list = new Three_customCLL();

//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertFirst(9);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(100, 3);
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.find(8 ));

//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertFirst(9);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);

        One_customLL list = new One_customLL();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertRec(34, 2);

        list.display();
    }
}

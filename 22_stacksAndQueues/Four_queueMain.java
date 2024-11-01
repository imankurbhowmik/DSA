public class Four_queueMain {
    public static void main(String[] args) throws Exception{
        Four_customQueue queue = new Four_customQueue(5);

        queue.insert(51);
        queue.insert(52);
        queue.insert(53);
        queue.insert(54);
        queue.insert(55);

        queue.display();

        queue.remove();

        queue.display();

    }
}
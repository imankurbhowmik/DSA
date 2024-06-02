public class One_comparison {
    public static void main(String[] args) {
        String a = "Ankur";
        String b = "Ankur";

        System.out.println(a==b);  // checks whether ref variable points to same object

        // to create diff objects of same value : creating these values outside the pool but in heap
        String c = new String("Ankur");
        String d = new String("Ankur");

        System.out.println(c==d);
        System.out.println(c.equals(d)); // checks only values
    }
}

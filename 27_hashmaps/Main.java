public class Main {
    public static void main(String[] args) {
        Integer num = 876383457;
        String name = "Ankur";

        int a = num.hashCode();
        int b = name.hashCode();

        System.out.println(a+" "+b);
    }
}
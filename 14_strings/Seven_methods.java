import java.util.Arrays;

public class Seven_methods {
    public static void main(String[] args) {
        String name = "Ankur Bhowmik";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Ankur       ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
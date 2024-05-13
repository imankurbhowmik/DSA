import java.util.*;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
       System.out.print(greet(name));
    }

    static String greet(String name){
        return "Hello " + name;
    }
}
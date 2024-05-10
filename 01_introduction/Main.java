import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // we have static here bcz we want to run main function without creating an object of class Main 
        System.out.println("Hello World!!");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
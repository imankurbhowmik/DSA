import java.util.*;

public class sum{
    public static void main(String[] args) {
        // sum();
        System.out.println(sum2());
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }


    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
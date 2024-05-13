import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        while(number>0){
            int rem = number%10;
            number/=10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}
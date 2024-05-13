import java.util.*;

public class countNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int digitToFind = sc.nextInt();
        int count = 0;
        while(number > 0){
            long rem = number % 10;
            if(rem == digitToFind){
                count++;
            }
            number/=10;
        }
        System.out.println(count);
    }
}
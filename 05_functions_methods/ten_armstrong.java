import java.util.*;

public class ten_armstrong {
    public static void main(String[] args) {
        //System.out.println(isArmstrong(153));

        for(int i=100; i<=999; i++){
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}

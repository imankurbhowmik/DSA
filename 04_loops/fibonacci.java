import java.util.*;


public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 3;
        while(count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }System.out.println(b);
    }    
}
public class Nine_reverse {
    public static void main(String[] args) {
        // reverse(1234);
        // System.out.println(sum);
        System.out.println(reverse2(1234));
    }

    static int sum = 0;
    static void reverse(int n) {
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }

    // 2nd way

    static int reverse2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if(n%10==n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
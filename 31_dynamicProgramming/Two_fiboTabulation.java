public class Two_fiboTabulation {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
//        System.out.println(fibo(n, dp));
        System.out.println(fiboOpti(5));
    }

    static int fibo(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // space optimisation
    static int fiboOpti(int n) {
        int prev2 = 0;
        int prev = 1;

        for(int i=2; i<=n; i++) {
            int curi = prev+prev2;
            prev2 = prev;
            prev = curi;
        }

        return prev;
    }

    public int climbStairs(int n) {
        return helper(n);
    }

    public int helper(int n) {
        int prev2 = 1;
        int prev = 1;

        for(int i=2; i<=n; i++) {
            int cur_i = prev + prev2;
            prev2 = prev;
            prev = cur_i;
        }
        return prev;
    }

}
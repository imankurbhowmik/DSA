import java.util.Arrays;

public class Three_frogJump {
    public static int solve(int index, int[] height, int[] dp) {
        if(index == 0) return 0;
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne = solve(index-1, height, dp) + Math.abs(height[index] - height[index-1]);
        if(index > 1) {
            jumpTwo = solve(index-2, height, dp) + Math.abs(height[index] - height[index-2]);
        }
        return dp[index] = Math.min(jumpOne, jumpTwo);
    }

    public static int solve2(int index, int[] height, int[] dp) {
        dp[0] = 0;
        int ss = Integer.MAX_VALUE;
        for(int i=1; i<= index; i++) {
            int fs = dp[index-1] + Math.abs(height[index] - height[index-1]);
            if(index > 1) {
                ss = dp[index-2] + Math.abs(height[index] - height[index-2]);
            }
            dp[i] = Math.min(fs, ss);
        }
        return dp[index];
    }

    public static int solve3(int index, int[] height, int[] dp) {
        int prev = 0;
        int prev2 = 0;
        int ss = Integer.MAX_VALUE;
        for(int i=1; i<= index; i++) {
            int fs = prev + Math.abs(height[i] - height[i-1]);
            if(index > 1) {
                ss = prev2 + Math.abs(height[i] - height[i-2]);
            }
            int curi = Math.min(fs, ss);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] height = {10, 60, 70, 10, 40, 30};
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(solve2(n, height, dp));
    }
}
import java.util.Arrays;

public class Five_ninjasTraining {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        int[][] dp = new int[arr.length][4];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(maxPoints(arr.length-1, 3, arr, dp));
    }

    static int maxPoints(int day, int last, int[][] arr, int[][] dp) {
        if(day==0) {
            int maxi = 0;
            for(int i=0; i<=2; i++) {
                if(i != last) {
                    maxi = Math.max(maxi, arr[0][i]);
                }
            }return maxi;
        }

        if(dp[day][last] != -1) return dp[day][last];

        int maxi = 0;
        for(int i=0; i<=2; i++) {
            if(i != last) {
                int points = arr[day][i] + maxPoints(day-1, i, arr, dp);
                maxi = Math.max(points, maxi);
            }
        }
        return dp[day][last] = maxi;
    }
}
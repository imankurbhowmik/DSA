import java.util.Arrays;

public class Four_nonAdjacentMaxSum {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        int[] dp = new int[5];
        Arrays.fill(dp, -1);
        System.out.println(findMaxSum(dp, arr.length-1, arr));
    }

    static int findMaxSum(int[] dp, int index, int[] arr) {
        if(index == 0) return arr[index];
        if(index < 0) return 0;

        if(dp[index] != -1) return dp[index];

        int pick = arr[index] + findMaxSum(dp, index-2, arr);
        int notPick = 0 + findMaxSum(dp, index-1, arr);

        return Integer.max(pick, notPick);
    }
}

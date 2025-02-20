import java.util.Arrays;

public class Four_nonAdjacentMaxSum {
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        int[] dp = new int[5];
        Arrays.fill(dp, -1);
        System.out.println(findMaxSum3(arr.length-1, arr));
    }

    static int findMaxSum(int[] dp, int index, int[] arr) {
        if(index == 0) return arr[index];
        if(index < 0) return 0;

        if(dp[index] != -1) return dp[index];

        int pick = arr[index] + findMaxSum(dp, index-2, arr);
        int notPick = 0 + findMaxSum(dp, index-1, arr);

        return Integer.max(pick, notPick);
    }

    static int findMaxSum2(int[] dp, int index, int[] arr) {
        dp[0] = arr[0];

        if(dp[index] != -1) return dp[index];

        for(int i=1; i<= index; i++) {
            int take = arr[i];
            if(i>1) take+= dp[i-2];
            int notTake = 0 + dp[i-1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[index];
    }

    static int findMaxSum3(int index, int[] arr) {
        int prev = arr[0];
        int prev2 = 0;

        for(int i=1; i<= index; i++) {
            int take = arr[i];
            if(i>1) take+= prev2;
            int notTake = 0 + prev;
            int curi = Math.max(take, notTake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
}

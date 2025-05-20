public class One_maxPointsCards {
    public static void main(String[] args) {

    }
    public static int maxScore(int[] nums, int k) {
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;

        for(int i=0; i<k; i++) {
            lSum = lSum + nums[i];
        }
        maxSum = lSum;

        int rIndex = nums.length-1;
        for(int i=k-1; i>=0; i--) {
            lSum = lSum - nums[i];
            rSum = rSum + nums[rIndex];
            maxSum = Math.max(maxSum, lSum+rSum);
            rIndex--;
        }
        return maxSum;
    }
}
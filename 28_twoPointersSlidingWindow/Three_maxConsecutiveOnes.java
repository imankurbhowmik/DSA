public class Three_maxConsecutiveOnes {
    public static void main(String[] args) {

    }

    public static int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int maxLength = 0;
        int zeros = 0;

        while(r<nums.length) {
            if(nums[r] == 0) zeros++;

            if(zeros>k) {
                if(nums[l] == 0) zeros--;
                l++;
            }
            if(zeros<=k) {
                int length = r-l+1;
                maxLength = Math.max(length, maxLength);
            }
            r++;
        }
        return maxLength;
    }
}
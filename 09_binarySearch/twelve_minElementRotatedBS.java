public class twelve_minElementRotatedBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 1, 2, 3};
        System.out.println(findMin(arr));
    }

    public static int findMin (int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end-start)/2 ;
             if(arr[start] <= arr[mid]) {
                 ans = Integer.min(ans, arr[start]);
                 start = mid+1;
             } else{
                 ans = Integer.min(arr[mid], ans);
                 end = mid-1;
             }
        } return ans;
    }
}
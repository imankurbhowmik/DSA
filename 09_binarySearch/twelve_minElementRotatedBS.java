public class twelve_minElementRotatedBS {
    public static void main(String[] args) {
        int[] arr = {6, 6, 6, 1, 1, 1, 2, 4, 4, 4, 6};
//        System.out.println(findMin(arr));
        System.out.println(findMinWithDuplicates(arr));
    }

    public static int findMin (int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end-start)/2 ;

//            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
//                start++;
//                end--;
//                continue;
//            }

            if(arr[start] <= arr[end]) {
                ans = Integer.min(ans, arr[start]);
                break;
            }
             if(arr[start] <= arr[mid]) {
                 ans = Integer.min(ans, arr[start]);
                 start = mid+1;
             } else{
                 ans = Integer.min(arr[mid], ans);
                 end = mid-1;
             }
        } return ans;
    }
    public static int findMinWithDuplicates (int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end-start)/2 ;

            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                ans = Integer.min(ans, arr[start]);
                start++;
                end--;
                continue;
            }

            if(arr[start] < arr[end]) {
                ans = Integer.min(ans, arr[start]);
                break;
            }
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
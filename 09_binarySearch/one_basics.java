public class one_basics {
    public static void main(String[] args) {
        int[] arr = {-123, -40, -30, 0, 1, 2, 4, 8, 9, 23, 57, 78, 90, 123, 567, 700, 800, 850, 990};
        // steps
        // target = 78
        // step1 : find the middle element  (0+7)/2 = 3
        // step2 : target > mid => search in the right else search in left
        // step3 : if middle element == target ans

        // total no of max comparisons is log2(N)
        //  better way to find mid   mid = start + (end- start)/2

        int ans = binarySearch(arr, 850);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid -1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }return -1;
    }
}
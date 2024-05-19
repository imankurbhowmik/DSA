import java.util.Arrays;

public class six_startEndIndex {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7; 
        System.out.println(Arrays.toString(searchInRange(arr, target)));
    }

    static int[] searchInRange(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = search(arr, 7, true);
        int end = search(arr, 7, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // function to find the index
    static int search(int[] arr, int target, boolean isStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(isStart){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }return ans;
    }
}

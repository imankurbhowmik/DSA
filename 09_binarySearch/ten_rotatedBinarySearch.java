public class ten_rotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        int target = 2;
//        System.out.print(search(nums, target));
        System.out.println(search2(nums, target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int pivot = findPivot(nums, start, end);
        if(nums[start] < target){
            return binarySearch(nums, target, start, pivot);
        }else{
            return binarySearch(nums, target, pivot+1, end);
        }
    }

    public static int findPivot(int[] nums, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            } if(mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            } if (nums[mid]>nums[start]) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        } return -1;
    }




    public static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            }else {
                return mid;
            }
        }return -1;
    }

    // second approach

    public static int search2 (int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2 ;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[start] <= arr[mid]) {
                if(target >= arr[start] && target <= arr[mid]) {
                    end = mid -1 ;
                } else {
                    start = mid+1;
                }
            } else {
                if(target >= arr[mid] && target <= arr[end]) {
                    start = mid+1;
                } else {
                    end = mid - 1;
                }
            }
        } return -1;
    }
}
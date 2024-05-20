public class nine_findInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 5;
        int peak = findPeakElement(arr, target);
        if(searchInAscendingArray(arr, peak, target)!=-1){
            System.out.println(searchInAscendingArray(arr, peak, target));
        }else{
            System.out.println(searchInDescendingArray(arr, peak, target));
        }

    }

    static int findPeakElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= arr[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }return start;
        
    }

    static int searchInAscendingArray(int[] arr, int peak, int target){
        int start = 0;
        int end = peak;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }return -1;

    }

    static int searchInDescendingArray(int[] arr, int peak, int target){
        int start = peak + 1;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                start = mid + 1;
            }else if(arr[mid] < target){
                end = mid - 1;
            }else{
                return mid;
            }
        }return -1;

    }
}
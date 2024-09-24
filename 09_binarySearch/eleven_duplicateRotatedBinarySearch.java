public class eleven_duplicateRotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 9, 2, 2, 2};
        int target = 9;
//        System.out.println(searchElement(arr, target));
        System.out.println(searchElement2(arr, target));
    }

    static int searchElement(int[] arr, int target){
        int pivot = findPivot(arr);

        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }

        if(target == arr[pivot]){
            return pivot;
        }

        if(target < arr[0]){
            return binarySearch(arr, target, pivot + 1, arr.length-1);
        }
        else{
            return binarySearch(arr, target, 0, pivot - 1);
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            //case1
            if(mid < arr.length - 1 && arr[mid] > arr[mid+1]){
                return mid;
            }

            //case2
            if(mid > 0 && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }

            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }



    // 2nd approach

    public static int searchElement2 (int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2 ;

            if(target == arr[mid]) {
                return mid;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }
            if(arr[start] <= arr[mid]) {
                if(target >= arr[start] && target <= arr[mid]) {
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target >= arr[mid] && target <= arr[end]) {
                    start = mid +1;
                }else{
                    end = mid-1;
                }
            }
        }return -1;
    }

}
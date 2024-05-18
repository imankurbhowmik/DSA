public class two_orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-90, -89, -67, -34, -17, -12, 0, 34, 78, 200, 500, 900, 990};
        int target = 900;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

    
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[start] < arr[end]){
                if(target > arr[mid]){
                    start = mid+1;
                }else if(target < arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }

            else if(arr[start] > arr[end]){
                if(target < arr[mid]){
                    start = mid+1;
                }else if(target > arr[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }return -1;
    }
}

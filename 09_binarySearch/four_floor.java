public class four_floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        
        if(target < arr[0]){
            return -1;
        }
         

        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }return arr[end];
    }
}

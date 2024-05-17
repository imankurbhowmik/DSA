public class five_max {
    public static void main(String[] args) {
        int[] arr = {56, 78, 23, 90, 12};
        System.out.println(max(arr, 1, 3));
    }

    static int max(int[] arr, int start, int end){
        int max = arr[0];
        for(int i=start; i<=end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
public class one_elementSearch {
    public static void main(String[] args) {
        int[] arr = {1, 67, 89, 12, -11, 56, 89, 90, -34};
        System.out.println(linearSearch(arr, 11));
        System.out.println(linearSearch2(arr, 11));
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }return -1;
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int num : arr){
            if(num == target){
                return num;
            }
        }return Integer.MAX_VALUE;
    }
}
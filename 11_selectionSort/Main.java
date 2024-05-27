import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int max = findMaxIndex(arr, 0, arr.length-i-1);
            swap(arr, max, arr.length-i-1);
        }
    } 

    static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int j=start; j<=end; j++) {
            if(arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    } 

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
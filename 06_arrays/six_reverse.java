import java.util.Arrays;

public class six_reverse {
    public static void main(String[] args) {
        int[] arr = {1, 89, 12, 67, 23, 90};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            swap(arr, start, end);
            start++;
            end --;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

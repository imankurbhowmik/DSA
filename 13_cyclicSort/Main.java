import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int arr[] = {5, 4, 3, 2, 1};
        sort(arr); 
        System.out.print(Arrays.toString(arr));
    }

    static int[] sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
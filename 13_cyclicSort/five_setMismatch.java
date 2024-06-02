import java.util.Arrays;

public class five_setMismatch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 2, 6, 5};
        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    static int[] setMismatch(int[] arr) {
        sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(i != arr[i] - 1){
                return new int[]{i+1, arr[i]};
            }
        }return new int[]{-1, -1};
    }

    static void sort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            if(i != arr[i] -1) {
                swap(arr, i, arr[i]-1);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
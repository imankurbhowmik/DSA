import java.util.Arrays;

public class four_swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 78};
        
        swap(arr, 4, 1);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[] arr = {3, 1, 5, 4, 2};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for(int i=0; i< arr.length-1; i++) {
            for(int j=1; j< arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; 
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
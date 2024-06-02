import java.util.ArrayList;
import java.util.Arrays;

public class two_allMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findAllMissingNumbers(arr));
        
    }

    static ArrayList<Integer> findAllMissingNumbers(int[] arr) {
        ArrayList<Integer> allMissingNumbers = new ArrayList<>();
        sort(arr);
        for(int index=0; index<arr.length; index++) {
            if(index+1 != arr[index]) {
                allMissingNumbers.add(index+1);
            }
        } return allMissingNumbers;
    }

    static void sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(i != arr[i]-1) {
                swap(arr, i, arr[i]-1);
            }else {
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
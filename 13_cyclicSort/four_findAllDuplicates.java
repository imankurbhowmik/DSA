import java.util.ArrayList;

public class four_findAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findAllDuplicates(arr));
    }

    static ArrayList<Integer> findAllDuplicates(int[] arr) {
        ArrayList<Integer> duplicate = new ArrayList<>();
        sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(i != arr[i]-1) {
                duplicate.add(arr[i]);
            }
        }
        return duplicate;
    }

    static void sort(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            if(i != arr[i] - 1) {
                swap(arr, i, arr[i]-1);
            }
            else{
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
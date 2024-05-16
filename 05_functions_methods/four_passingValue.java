import java.util.Arrays;

public class four_passingValue {
    public static void main(String[] args) {
        int[] arr = {1, 56, 78, 34};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));  // original array is changed since direct reference was made to the object
    }

    static void changeArr(int[] arr){
        arr[0] = 99;
        System.out.println(Arrays.toString(arr));
    }
}
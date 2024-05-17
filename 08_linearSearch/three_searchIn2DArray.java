import java.util.*;

public class three_searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 67},
            {2, 67, 90, 12},
            {12, 67, 90}
        };
        int target = 90;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }return new int[]{-1, -1};
    }
}

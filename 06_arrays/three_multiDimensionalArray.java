import java.util.*;

public class three_multiDimensionalArray {
    public static void main(String[] args) {
        /*
          1 2 3 
          4 5 6
          7 8 9
        */

        // array of arrays

        int[][] arr = new int[3][3];

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // input

        Scanner sc = new Scanner(System.in);

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                // arr[row][col] = sc.nextInt();
            }
        }

        //output

        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }System.out.println();
        // }

        // for(int row=0; row<arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for (int[] a  : arr) {
            // System.out.println(a);
        }

        for(int row =0; row< arr2.length; row++){
            for(int col=0 ; col<arr2[row].length; col++){
                System.out.print(arr2[row][col]);
            }System.out.println();
        }


    }
}

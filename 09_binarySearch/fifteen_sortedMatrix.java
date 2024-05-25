import java.util.Arrays;

public class fifteen_sortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        int target = 17;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] binarySearch(int[][] arr, int target, int row, int colStart, int colEnd) {
        while(colStart <= colEnd) {
            int cMid = colStart + (colEnd - colStart)/2;
            
            if(arr[row][cMid] == target) {
                return new int[] {row,cMid};
            }
            
            if(arr[row][cMid] < target) {
                colStart = cMid + 1;
            }
            else{
                colEnd = cMid - 1;
            }
            
        }
        return new int[] {-1, -1};
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            return binarySearch(arr, target, 0, 0, cols-1);
        }

        int cMid = cols / 2;
        int rStart = 0;
        int rEnd = arr.length-1;
        

        //apply binary search until we have 2 rows remaining
        while (rStart < rEnd-1) {
            int mid = rStart + (rEnd - rStart)/2;

            if(arr[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }

            if(arr[mid][cMid] < target) {
                rStart = mid;
            }

            if(arr[mid][cMid] > target) {
                rEnd = mid;
            }
        }

        // 2 rows remaining
        if(arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        
        if(arr[rStart+1][cMid] == target) {
            return new int[]{rStart+1, cMid};
        }

        if(arr[rStart][cMid] > target) {
            return binarySearch(arr, target, rStart, 0, cMid - 1);
        }
        
        if(arr[rStart][cMid] < target && arr[rStart][cMid] < arr[rStart][cols-1]) {
            return binarySearch(arr, target, rStart, cMid+1, cols-1);
        }
        
        if(arr[rStart+1][cMid] < target) {
            return binarySearch(arr, target, rStart+1, 0, cMid - 1);
        }
        else{
            return binarySearch(arr, target, rStart+1, cMid+1, cols-1);
        }
    }
}

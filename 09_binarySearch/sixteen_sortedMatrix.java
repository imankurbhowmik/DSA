import java.util.Arrays;

import static java.util.Collections.binarySearch;

public class Sixteen_sortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}
        };
        int target = 0;
        System.out.println(Arrays.toString(searchMatrix2(matrix, target)));
    }
        public static boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int rStart = 0;
            int rEnd = m-1;
            int cStart = 0;
            int cEnd = n-1;
            int cMid = cStart + (cEnd - cStart)/2;

            if(m==1) {
                return binarySearch(matrix, 0, 0, cEnd, target);
            }

            while(rStart <= rEnd-1) {
                int rMid = rStart + (rEnd - rStart)/2;
                if(matrix[rMid][cMid] == target) {
                    return true;
                }else if(matrix[rMid][cMid] < target) {
                    rStart = rMid;
                }else {
                    rEnd = rMid;
                }
            }

            if(matrix[rStart][cMid] == target) {
                return true;
            }if(matrix[rStart+1][cMid] == target) {
                return true;
            }if(target <= matrix[rStart][cMid-1]) {
                return binarySearch(matrix, rStart, 0, cMid-1, target);
            }if(target >= matrix[rStart][cMid+1] && target < matrix[rStart+1][0]) {
                return binarySearch(matrix, rStart, cMid+1, cEnd, target);
            }if(target <= matrix[rStart+1][cMid-1] && target > matrix[rStart][cEnd] ) {
                return binarySearch(matrix, rStart+1, 0, cMid-1, target);
            }else{
                return binarySearch(matrix, rStart +1, cMid+1, cEnd, target);
            }
        }

        public static boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
            int start = cStart;
            int end = cEnd;

            while(start <= end) {
                int mid = start + (end-start)/2;
                if(matrix[row][mid] == target) {
                    return true;
                }else if(matrix[row][mid] < target) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }return false;
        }

        // approach 2

    public static int[] searchMatrix2(int[][] arr, int target) {
        int start = 0;
        int length = arr.length  * arr[0].length;
        int end = length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid/length][mid%length] == target) {
                return new int[] {mid/length, mid%length};
            }else if(arr[mid/length][mid%length] < target) {
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }return new int[] {-1, -1};
    }


}
import java.util.*;

public class Thirteen_countRotations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 0, 0, 0, 1, 1};
        System.out.println(countRotations2WithDuplicates(arr));
    }

    static int countRotations(int[] arr){
        return findPivot(arr) + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            //case1
            if(mid < arr.length - 1 && arr[mid] > arr[mid+1]){
                return mid;
            }

            //case2
            if(mid > 0 && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            //case3
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    // approach 2

    public static int countRotations2(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int minIndex = -1;
        int minElement = Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end-start)/2 ;

            if(arr[start] <= arr[mid]) {
                if(arr[start]<=minElement){
                    minElement = arr[start];
                    minIndex = start;
                }start = mid +1;
            }else{
               if(arr[mid] <= minElement) {
                   minElement = arr[mid];
                   minIndex = mid;
               }end = mid-1;
            }
        }return minIndex;
    }

    public static int countRotations2WithDuplicates (int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int minElement = Integer.MAX_VALUE;
        int minIndex = -1;

        while(start <= end) {
            int mid = start + (end-start)/2 ;

            if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if(arr[start] < minElement) {
                    minElement = arr[start];
                    minIndex = start;
                }
                start++;
                end--;
                continue;
            }

            if(arr[start] < arr[end]) {
                if(arr[start] < minElement) {
                    minElement = arr[start];
                    minIndex = start;
                }
                break;
            }
            if(arr[start] <= arr[mid]) {
                if(arr[start] < minElement) {
                    minElement = arr[start];
                    minIndex = start;
                }
                start = mid+1;
            } else{
                if(arr[mid] < minElement) {
                    minElement = arr[mid];
                    minIndex = mid;
                }
                end = mid-1;
            }
        } return minIndex;
    }
}
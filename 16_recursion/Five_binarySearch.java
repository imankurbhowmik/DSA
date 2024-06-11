public class Five_binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 67, 89, 90, 122};
        int target = 90;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m] == target) {
            return m;
        }

        else if(arr[m] > target) {
            return search(arr, target, s, m-1);
        }

        else{
            return search(arr, target, m+1, e);
        }

    }
}

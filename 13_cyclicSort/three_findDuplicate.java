public class three_findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicates(arr));
    }


    static int findDuplicates(int[] arr) {
        int i = 0;
        int ans = -1;
        while(i < arr.length) {
            if(i != arr[i] - 1) {
                if(arr[arr[i]-1] != arr[i]) {
                    swap(arr, i, arr[i]-1);
                }else{
                    ans = arr[i];
                }   
            } else{
                i++;
            }
        }return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

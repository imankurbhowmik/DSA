public class six_missingSmallestPositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(missingSmallestPositive(arr));
    }   

    static int missingSmallestPositive(int[] arr) {
        sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(i != arr[i] - 1){
                return i+1;
            }
        }return arr.length+1;
    }

    static void sort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            if(i != arr[i] -1){
                if(arr[i] <= 0) {
                    i++;
                }
                swap(arr, i, arr[i]-1);
            }else{
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
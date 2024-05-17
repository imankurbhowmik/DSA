public class four_maxValue {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 67},
            {2, 67, 90, 12},
            {12, 67, 90}
        };
        
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] element : arr){
            for(int value : element){
                if(value > max){
                    max = value;
                }
            }
        }return max;
    }
}
public class five_evenDigits {
    public static void main(String[] args) {
        int[] arr = {1, 34, 678, -1234, 7890};
        System.out.println(countElement(arr));
    }

    // count no of elements with even digits
    static int countElement(int[] arr){
        int count = 0;
        for(int num : arr){
            if(isEven(num)){
                count++;
            }
        }return count;
    }

    // whether even
    static boolean isEven(int num){
        return countDigits(num) % 2 == 0;
    }


    // count no of digits
    static int countDigits(int i){
        if(i < 0){
            i *= -1;
        }

        if(i == 0){
            return 1;
        }
        
        int count = 0;
        while(i > 0){
            i /= 10;
            count++;
        }return count;
    }
}

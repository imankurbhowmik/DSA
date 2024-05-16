import java.util.*;

public class two_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[4];
        
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        // for(int i=0; i< arr.length; i++){
            // System.out.print(arr[i]+" ");
        // }

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        System.out.println(Arrays.toString(arr));

    }
}
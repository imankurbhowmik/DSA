import java.util.Arrays;

public class seven_varAgs{
    public static void main(String[] args) {
        func(45, 66, 66, 565);
    }

    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, int ...v){
        
    }
}
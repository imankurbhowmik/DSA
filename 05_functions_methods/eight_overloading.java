import java.util.*;

public class eight_overloading{
    public static void main(String[] args) {
        nums("Ankur");
        nums(2);
        test("ankur");
        test(1, 3);
        // test(); this is not possible = ambiguity
    }

    static void nums(int a){
        System.out.println(a);
    }
    
    static void nums(String b){
        System.out.println(b);
    }

    static void test(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
    static void test(String ...v){
        System.out.println(Arrays.toString(v));
    }
}


// overloading happens when we have two functions of same name
// error is debugged when the argument types are different
// happens during compile time
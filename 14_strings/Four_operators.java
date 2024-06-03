import java.util.ArrayList;

public class Four_operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //195
        System.out.println("a" + "b");  //ab operator overloading
        System.out.println('a' + 3); //100
        System.out.println((char)('a' + 3)); //d
        System.out.println("a" + 1); //a1
        //int wil be converted to Integer that will call toString() => "a" + "1"

        System.out.println("ankur" + new ArrayList<>());  // ankur[]
        System.out.println("ankur" + new Integer(56));  // ankur56


        // System.out.println(new Integer(56) + new ArrayList<>());
        // error : + can be used in case of primitives or if we have atleast one datatype as string

        System.out.println(new Integer(56) + "" +
         new ArrayList<>()); //56[]
    }
}
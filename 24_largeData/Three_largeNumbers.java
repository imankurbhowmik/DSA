import java.math.BigInteger;

public class Three_largeNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(898579874);  // convert int/long to BigInteger

        int x = B.intValue();  // convert BigInteger to int value

//        BigInteger C = BigInteger.valueOf("78634587569");
        BigInteger C = new BigInteger("645846");

//        constants
        BigInteger D = BigInteger.ONE;

        // addition
        BigInteger s = A.add(B);
        System.out.println(s);

        // multiply
        BigInteger m = C.multiply(B);

        // subtract
        BigInteger sub = C.subtract(B);

        // divide
        BigInteger dv = C.divide(B);

        // remainder
        BigInteger r = C.remainder(B);

        // compare
        if(C.compareTo(B) < 0){
            System.out.println("Yes");
        }

    }
}
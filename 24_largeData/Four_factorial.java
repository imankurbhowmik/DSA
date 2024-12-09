import java.math.BigInteger;

public class Four_factorial {
    public static void main(String[] args) {
        System.out.println(fact(456));
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        double z = y-x;
        System.out.println(z);   // 0.010000000000000002
    }

    static BigInteger fact(int num) {
        BigInteger ans = new BigInteger("1");

        for (int i = 2; i < num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }
}
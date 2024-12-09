import java.math.BigDecimal;

public class Five_BigDecimal {
    public static void main(String[] args) {
        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        System.out.println(ans);  //0.01

        BigDecimal a = new BigDecimal("83458576.7846834576");
        BigDecimal b = new BigDecimal("63476.89472394836789");

        // operations
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.pow(2));
        System.out.println(b.negate());

        // constants
        BigDecimal con = BigDecimal.ONE;
    }
}
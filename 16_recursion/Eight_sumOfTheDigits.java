public class Eight_sumOfTheDigits {
    public static void main(String[] args) {
        int ans = sumOfTheDigits(1342);
        System.out.println(ans);
    }

    static int sumOfTheDigits (int n) {
        if(n == 0) {
            return 0;
        }

        return (n%10) + sumOfTheDigits(n/10);
    }
}

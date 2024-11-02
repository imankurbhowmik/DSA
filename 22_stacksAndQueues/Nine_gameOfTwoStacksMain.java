import java.util.*;

public class Nine_gameOfTwoStacksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = sc.nextInt();
            int[] a = new int[N];
            int[] b = new int[M];

            for (int j = 0; j < N; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < M; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(gameOfTwoStacks(X, a, b));
        }
    }
    static int gameOfTwoStacks(int x, int[] a, int[] b) {
        return gameOfTwoStacksCount(x, a , b, 0 , 0) - 1;
    }

    private static int gameOfTwoStacksCount(int x, int[] a, int[] b, int sum, int count) {
        if(sum > x){
            return count;
        }

        if(a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = gameOfTwoStacksCount(x, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2 = gameOfTwoStacksCount(x, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);

        return Math.max(ans1, ans2);
    }

}
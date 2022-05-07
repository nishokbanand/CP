
import java.util.Scanner;

public class dicecombinations {
    public static long dicecomb(int n) {
        long[] dp = new long[n + 1];
        for (int i = 0; i <= n; i++)
            dp[i] = 0;
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i >= j)
                    dp[i] += dp[i - j] % ((long) (1e9 + 7));
                dp[i] %= ((long) (1e9 + 7));
            }
            dp[i] %= ((long) (1e9 + 7));
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dicecomb(n));
        sc.close();
    }
}

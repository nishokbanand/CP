import java.util.Scanner;

public class coincombinationsII {
    static double mod = 1e9 + 7;

    static long coincombinationsI(int[] coins, int sum) {
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int coin = 0; coin < coins.length; coin++) {
            for (int i = 1; i <= sum; i++) {
                if (i - coins[coin] >= 0) {
                    dp[i] += dp[i - coins[coin]];
                }
                if (dp[i] >= mod)
                    dp[i] -= mod;
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coins = new int[sc.nextInt()];
        int sum = sc.nextInt();
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.println(coincombinationsI(coins, sum));
        sc.close();
    }
}

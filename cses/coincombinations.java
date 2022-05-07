import java.util.Scanner;

public class coincombinations {
    static long coincombination(int[] coins, int sum) {
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0)
                    dp[i] += dp[i - coins[j]] % ((long) (1e9 + 7));
                dp[i] %= ((long) (1e9 + 7));
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
        System.out.println(coincombination(coins, sum));
        sc.close();
    }
}

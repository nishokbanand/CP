import java.util.Arrays;

public class coin_change {
    static int min_coins(int[] coins, int sum, int[] dp) {
        dp[0] = 1;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    int subres = dp[i - coins[j]];
                    if (subres != Integer.MAX_VALUE && subres + 1 < dp[i])
                        dp[i] = subres + 1;
                }
            }
        }
        return dp[sum];
    }

    static int findNoOfCoins(int[] coins, int[] dp, int sum) {
        dp[0] = 1;
        for (int i = 1; i <= sum; i++) {
            for (int coin : coins) {
                if (i - coin >= 0)
                    dp[i] += dp[i - coin];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = new int[] { 1, 2, 3 };
        int sum = 4;
        int[] dp = new int[sum + 1];
        // Arrays.fill(dp, Integer.MAX_VAjLUE);
        // System.out.println(min_coins(coins, sum, dp));
        System.out.println(findNoOfCoins(coins, dp, sum));
    }
}

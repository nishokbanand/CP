import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class Coin_change {
    static int findmincoins(int amt, int[] coins, int size) {
        int[] dp = new int[amt + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= amt; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    int subres = dp[i - coins[j]];
                    dp[i] = Math.min(subres + 1, res);
                }
            }
        }
        return dp[amt];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] coins = new int[size];
        // for (int i = 0; i < size; i++) {
        // coins[i] = sc.nextInt();
        // }
        int[] coins = new int[] { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int amt = sc.nextInt();
        System.out.println(findmincoins(amt, coins, 10));
    }
}

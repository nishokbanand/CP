import java.util.Arrays;
import java.util.Scanner;

/**
 * coinchange
 */
public class minimumcoins {
    static int mincoins(int[] arr, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j])
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 25, 10, 5 };
        int target = 30;
        Arrays.sort(arr);
        System.out.println(mincoins(arr, target));
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class minimizingcoins {
    static int minimize(int[] arr, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 10000);
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i - arr[j] >= 0)
                    dp[i] = Math.min(dp[i], dp[i - arr[j]] + 1);
            }
        }
        if (dp[sum] == Integer.MAX_VALUE - 10000)
            return -1;
        return dp[sum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimize(arr, sum));
        sc.close();
    }
}
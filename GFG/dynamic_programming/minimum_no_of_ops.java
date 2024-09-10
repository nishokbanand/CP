import java.util.Arrays;
import java.util.Scanner;

public class minimum_no_of_ops {

    static int solve(int n, int[] dp) {
        if (n == 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        if (n % 2 == 0) {
            int prod = solve(n / 2, dp);
            int sum = solve(n - 1, dp);
            return dp[n] = 1 + Math.min(prod, sum);
        } else {
            return dp[n] = 1 + solve(n - 1, dp);
        }
    }

    static int minimumops(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minimumops(n));
        sc.close();
    }
}

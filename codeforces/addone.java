import java.util.Scanner;

public class addone {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] dp = new int[200_005][10];
        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < 200_001; i++) {
            for (int j = 0; j < 9; j++) {
                dp[i][j] = dp[i - 1][j + 1] % mod;
            }
            dp[i][9] = (dp[i - 1][1] + dp[i - 1][0]) % mod;
        }
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int num = sc.nextInt();
            int op = sc.nextInt();
            int ans = 0;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                ans += (dp[op][digit]) % mod;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

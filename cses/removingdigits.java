import java.util.Arrays;
import java.util.Scanner;

public class removingdigits {
    static int remove(int num) {
        int[] dp = new int[num + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 100000);
        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            int x = i;
            while (x > 0) {
                int digit = x % 10;
                dp[i] = Math.min(dp[i], 1 + dp[i - digit]);
                x = x / 10;
            }
        }
        return dp[num];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(remove(num));
        sc.close();
    }
}

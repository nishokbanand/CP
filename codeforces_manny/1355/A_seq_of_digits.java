import java.util.Scanner;

/**
 * A_seq_of_digits
 */

// an+1 = an + min(an) * max(an);

public class A_seq_of_digits {
    static int sequence(int a, int k) {
        int[] dp = new int[k + 1];
        dp[0] = 0;
        dp[1] = a;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + mindigit(dp[i - 1]) * maxdigit(dp[i - 1]);
        }
        return dp[k];
    }

    static int mindigit(int num) {
        int min_num = Integer.MAX_VALUE;
        while (num > 0) {
            int temp = num % 10;
            min_num = Math.min(temp, min_num);
            num = num / 10;
        }
        return min_num;
    }

    static int maxdigit(int num) {
        int max_num = Integer.MIN_VALUE;
        while (num > 0) {
            int temp = num % 10;
            max_num = Math.max(temp, max_num);
            num = num / 10;
        }
        return max_num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int a = sc.nextInt(), k = sc.nextInt();
            System.out.println(sequence(a, k));
        }
    }
}
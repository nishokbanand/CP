import java.util.Scanner;

/**
 * findnthfibo
 */
public class findnthfibo {
    static int findfib(int n) {
        // dp[0] = 0;
        // dp[1] = 1;
        // for (int i = 2; i < dp.length; i++) {
        // dp[i] = dp[i - 1] + dp[i - 2];
        // }
        // return dp[dp.length - 1];
        // (1+rt5)^n - (1-rt5)^n / 2^n*rt5
        int firstpart = (int) Math.pow((1 + Math.sqrt(5)), n);
        int scndpart = (int) Math.pow((1 - Math.sqrt(5)), n);
        int ans = (firstpart - scndpart) / (int) (Math.pow(2, n) * Math.sqrt(5));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dp = new int[num + 1];
        System.out.println(findfib(num));
    }
}
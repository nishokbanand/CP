import java.util.Scanner;

public class fibonacciseries {
    static int fibo(int num) {
        if (num <= 1)
            return num;
        int[] dp = new int[num + 1];
        dp[1] = 1;
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[num];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibo(num));
    }
}

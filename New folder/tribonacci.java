import java.util.Scanner;

public class tribonacci {
    static int tribo(int num) {
        int[] dp = new int[num + 1];
        if (num <= 1)
            return num;
        if (num == 2)
            return 1;
        dp[num] = tribo(num - 3) + tribo(num - 1) + tribo(num - 2);
        return dp[num];
    }
    // static int tribo(int num) {
    // int[] dp = new int[num + 1];
    // dp[1] = 1;
    // dp[2] = 1;
    // for (int i = 3; i <= num; i++) {
    // dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
    // }
    // return dp[num];
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(tribo(num));
    }
}

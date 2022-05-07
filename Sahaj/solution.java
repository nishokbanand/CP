import java.util.Scanner;
import java.util.Arrays;

public class solution {
    static int paintwall(int num) {
        if (num == 1)
            return 0;
        int[] dp = new int[num + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 2;
        dp[3] = 3;
        if (num == 2 || num == 3)
            return num;
        if (isPrime(num))
            return num;
        for (int i = 4; i < dp.length; i++) {
            if (isPrime(i))
                dp[i] = i;
            else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        int times = i / j;
                        dp[i] = Math.min(dp[i], times + dp[j]);
                    }
                }
            }
        }
        return dp[num];
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(paintwall(num));
    }
}
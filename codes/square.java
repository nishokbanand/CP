import java.util.Arrays;
import java.util.Scanner;
public class square {
    static int perfect(int sum , int []coins){
        int dp[] = new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(coins[j]<=i)dp[i] = Math.min(dp[i],dp[i - coins[j]]+1);
            }
        }
        return dp[sum]<=sum?dp[sum]:-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int []coins = new int[length];
        for (int i = 0; i < length; i++) {
            coins[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.print(perfect(sum,coins));
    }
}

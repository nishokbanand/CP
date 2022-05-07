
import java.util.Scanner;

public class jumpgame2 {
    static int jump(int[] arr) {
        // int[] dp = new int[arr.length];
        // Arrays.fill(dp, Integer.MAX_VALUE);
        // dp[arr.length - 1] = 0;
        // for (int i = arr.length - 2; i >= 0; i--) {
        // int min = Integer.MAX_VALUE;
        // for (int j = 1 + i; j <= Math.min(arr.length - 1, i + arr[i]); j++) {
        // min = Math.min(min, dp[j]);
        // }
        // if (min != Integer.MAX_VALUE) {
        // dp[i] = min + 1;
        // }
        // }
        // return dp[0];
        int end = 0, farthest = 0, jump = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == end) {
                jump++;
                end = farthest;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(jump(arr));
        sc.close();
    }
}

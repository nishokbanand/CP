import java.util.Scanner;

public class robber {
    static int robbing(int[] arr) {
        int[] dp = new int[arr.length + 1];
        dp[0] = 0;
        dp[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + arr[i]);
        }
        return dp[arr.length];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(robbing(arr));
        sc.close();
    }
}

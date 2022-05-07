import java.util.Scanner;

public class mincostclimbingstairs {

    static int mincost(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = arr[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[arr.length - 1], dp[arr.length - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(mincost(arr));
        sc.close();
    }
}

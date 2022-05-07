import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class longesstsubmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] mat = new int[R][C];
        int[][] dp = new int[R][C];
        int maxsize = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
                if (i == 0 || j == 0) {
                    dp[i][j] = mat[i][j];
                }
                if (mat[i][j] == 1) {
                    maxsize = 1;
                }
            }
        }
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (mat[i][j] == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                int left = dp[i][j - 1];
                int top = dp[i - 1][j];
                int topleft = dp[i - 1][j - 1];
                dp[i][j] = Math.min(left, Math.min(top, topleft)) + 1;
                if (dp[i][j] > maxsize) {
                    maxsize = dp[i][j];
                }
            }
        }
        System.out.println(maxsize);
    }
}

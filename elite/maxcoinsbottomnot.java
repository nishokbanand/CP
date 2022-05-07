import java.util.Arrays;
import java.util.Scanner;

public class maxcoinsbottomnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            int[][] mat = new int[R][C];
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            int[][] dp = new int[R][C];
            for (int i = 0; i < C; i++) {
                dp[0][i] = mat[0][i];
            }
            for (int row = 1; row < R; row++) {
                int prevRow[] = Arrays.copyOf(dp[row - 1], C);
                Arrays.sort(prevRow);
                int firstmax = prevRow[C - 1];
                int secondmax = prevRow[C - 2];
                for (int col = 0; col < C; col++) {
                    if (dp[row - 1][col] != firstmax) {
                        dp[row][col] = firstmax + mat[row][col];
                    } else {
                        dp[row][col] = secondmax + mat[row][col];
                    }
                }
            }
            Arrays.sort(dp[R - 1]);
            System.out.println(dp[R - 1][C - 1]);
        }
    }
}

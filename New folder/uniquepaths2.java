import java.util.Scanner;

public class uniquepaths2 {
    static int path(int[][] obstaclegrid) {
        int R = obstaclegrid.length;
        int C = obstaclegrid[0].length;
        int[][] dp = new int[R][C];
        if (obstaclegrid[0][0] == 1)
            return 0;
        dp[0][0] = 1;
        // first row
        for (int i = 1; i < C; i++) {
            if (obstaclegrid[0][i] != 1)
                dp[0][i] = dp[0][i - 1];
        }
        // first column
        for (int i = 1; i < R; i++) {
            if (obstaclegrid[i][0] != 1)
                dp[i][0] = dp[i - 1][0];
        }
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (obstaclegrid[i][j] == 1)
                    dp[i][j] = 0;
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[R - 1][C - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] obstaclegrid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                obstaclegrid[i][j] = sc.nextInt();
            }
        }
        System.out.println(path(obstaclegrid));
    }
}

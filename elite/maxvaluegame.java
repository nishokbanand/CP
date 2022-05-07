import java.util.Scanner;

public class maxvaluegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int startrow = sc.nextInt();
        int startcol = sc.nextInt();
        int[][] dp = new int[row][col];
        dp[startrow][startcol] = mat[startrow][startcol];
        for (int i = startcol + 1; i < col; i++) {
            dp[startrow][i] = mat[startrow][i] + dp[startrow][i - 1];
        }
        for (int i = startrow + 1; i < row; i++) {
            dp[i][startcol] = mat[i][startcol] + dp[i - 1][startcol];
        }
        for (int i = startrow + 1; i < row; i++) {
            for (int j = startcol + 1; j < col; j++) {
                dp[i][j] = mat[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        System.out.println(dp[row - 1][col - 1]);
    }
}

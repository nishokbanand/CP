import java.util.Scanner;

/**
 * longest_path
 */
public class longest_path {
    static int findlongestutil(int[][] mat, int row, int column, int[][] dp, int size) {
        if (row < 0 || row >= size || column < 0 || column >= size) {
            return 0;
        }
        if (dp[row][column] != -1)
            return dp[row][column];

        int top = Integer.MIN_VALUE, bottom = Integer.MIN_VALUE, left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
        // top
        if (row > 0 && mat[row][column] + 1 == mat[row - 1][column]) {

            top = dp[row][column] = 1 + findlongestutil(mat, row - 1, column, dp, size);
        }
        // bottom
        if (row < size - 1 && mat[row][column] + 1 == mat[row + 1][column]) {
            bottom = dp[row][column] = 1 + findlongestutil(mat, row + 1, column, dp, size);
        }
        // left
        if (column > 0 && mat[row][column] + 1 == mat[row][column - 1]) {
            left = dp[row][column] = 1 + findlongestutil(mat, row, column - 1, dp, size);
        }
        // right
        if (column < size - 1 && mat[row][column] + 1 == mat[row][column + 1]) {
            right = dp[row][column] = 1 + findlongestutil(mat, row, column + 1, dp, size);
        }
        dp[row][column] = Math.max(top, Math.max(bottom, Math.max(left, Math.max(right, 1))));
        return dp[row][column];
    }

    static int findlongestdist(int[][] mat, int size) {
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                dp[i][j] = -1;
            }
        }
        int res = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (dp[i][j] == -1) {
                    dp[i][j] = findlongestutil(mat, i, j, dp, size);
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(findlongestdist(mat, size));
        sc.close();
    }
}
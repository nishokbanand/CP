import java.util.Scanner;

public class gridpath {
    static double mod = 1e9 + 7;

    static int path(int[][] grid, int n) {
        int[][] dp = new int[n + 1][n + 1];
        if (n == 1 && grid[1][1] == 1 || grid[n][n] == 1)
            return 0;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (i == n && j == n)
                    dp[i][j] = 1;
                else {
                    int op1 = (j == n) ? 0 : dp[i][j + 1];
                    int op2 = (i == n) ? 0 : dp[i + 1][j];
                    dp[i][j] = op1 + op2;
                    if (grid[i][j] == 1)
                        dp[i][j] = 0;
                    if (dp[i][j] > mod) {
                        dp[i][j] -= mod;
                    }
                }
            }
        }

        return dp[1][1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int[][] grid = new int[size + 1][size + 1];
        for (int i = 1; i <= size; i++) {
            String line = sc.nextLine();
            for (int j = 1; j <= size; j++) {
                if (line.charAt(j - 1) != '.')
                    grid[i][j] = 1;
            }
        }
        sc.close();
        System.out.println(path(grid, size));
    }
}
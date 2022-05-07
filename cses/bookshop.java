import java.util.Scanner;

public class bookshop {
    static int maxbookbought(int[] books, int[] pages, int n, int x) {
        int[][] dp = new int[n + 1][x + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= x; j++) {
                if (j == 0)
                    dp[i][j] = 0;
                else {
                    int op1 = (i == 1) ? 0 : dp[i - 1][j];
                    int op2 = (j < books[i]) ? 0 : pages[i] + dp[i - 1][j - books[i]];
                    dp[i][j] = Math.max(op1, op2);
                }
            }
        }
        return dp[n][x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] books = new int[n + 1];
        int[] pages = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            books[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            pages[i] = sc.nextInt();
        }
        System.out.println(maxbookbought(books, pages, n, x));
    }
}

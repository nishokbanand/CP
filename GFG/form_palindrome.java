import java.util.Scanner;

public class form_palindrome {
    static int form_pal(String a) {
        StringBuilder sb = new StringBuilder(a);
        String rev = sb.reverse().toString();
        System.out.println(a);
        System.out.println(rev);
        int[][] dp = new int[a.length() + 1][rev.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return a.length() - lcs(a, rev, a.length(), rev.length(), dp);
    }

    static int lcs(String a, String rev, int m, int n, int[][] dp) {
        if (m == 0 || n == 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
        if (a.charAt(m - 1) == rev.charAt(n - 1)) {
            dp[m][n] = 1 + lcs(a, rev, m - 1, n - 1, dp);
            return dp[m][n];
        }
        dp[m][n] = Math.max(lcs(a, rev, m - 1, n, dp), lcs(a, rev, m, n - 1, dp));
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(form_pal(a));
        sc.close();
    }

}

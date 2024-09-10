import java.util.Scanner;

/**
 * editdist
 */
public class editdist {
    static int finddist(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int k = 0; k < dp.length; k++) {
            dp[k][0] = k;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int q = dp[i - 1][j] + 1;
                int w = dp[i][j - 1] + 1;
                int e = dp[i - 1][j - 1];
                if (a.charAt(i - 1) != b.charAt(j - 1))
                    e += 1;
                dp[i][j] = Math.min(Math.min(q, w), e);
            }
        }
        return dp[a.length()][b.length()];
    }

    public static void main(String[] args) {
        main("h");
    }

    public static void main(String a) {
        System.out.println("in");
    }
}
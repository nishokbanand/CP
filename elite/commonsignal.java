import java.util.Arrays;
import java.util.Scanner;

public class commonsignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int max = Integer.MIN_VALUE;
        int[][] mat = new int[a.length()][b.length()];
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    if (i == 0 || j == 0) {
                        mat[i][j] = 1;
                    } else {
                        mat[i][j] = 1 + mat[i - 1][j - 1];
                    }
                    max = Math.max(max, mat[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}

import java.util.Scanner;

public class levenshetien_dist {
    static int findldist(String a, String b) {
        int[][] l = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i < a.length(); i++) {
            l[i][0] = i;
        }
        for (int i = 0; i < b.length(); i++) {
            l[0][i] = i;
        }
        for (int i = 1; i < a.length() + 1; i++) {
            for (int j = 1; j < b.length() + 1; j++) {
                int d1 = l[i][j - 1] + 1;
                int d2 = l[i - 1][j] + 1;
                int d3 = l[i - 1][j - 1];
                if (a.charAt(i - 1) != b.charAt(j - 1))
                    d3 += 1;
                l[i][j] = Math.min(Math.min(d1, d2), d3);
            }
        }
        return l[a.length()][b.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abc";
        String b = "db";
        System.out.println(findldist(a, b));
        sc.close();
    }
}

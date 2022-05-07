import java.util.Scanner;

public class wildcardpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();
        int R = text.length(), C = pattern.length();
        boolean mat[][] = new boolean[R + 1][C + 1];
        mat[0][0] = true;
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (pattern.charAt(j - 1) == '?' || pattern.charAt(j - 1) == text.charAt(i - 1)) {
                    mat[i][j] = mat[i - 1][j - 1];
                } else if (pattern.charAt(j - 1) == '*') {
                    mat[i][j] = mat[i - 1][j] || mat[i][j - 1];
                }
            }
        }
        System.out.println(mat[R][C] == true ? "Matching" : "Not matching");
    }
}

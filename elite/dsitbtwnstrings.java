import java.util.Scanner;

public class dsitbtwnstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[][] mat = new int[str2.length() + 1][str1.length() + 1];
        for (int col = 0; col <= str1.length(); col++) {
            mat[0][col] = col;
        }
        for (int row = 0; row <= str2.length(); row++) {
            mat[row][0] = row;
        }
        for (int row = 1; row <= str2.length(); row++) {
            for (int col = 1; col <= str1.length(); col++) {
                if (str1.charAt(col - 1) == str2.charAt(row - 1)) {
                    mat[row][col] = mat[row - 1][col - 1];
                } else {
                    int left = mat[row][col - 1];
                    int top = mat[row - 1][col];
                    int topleft = mat[row - 1][col - 1];
                    mat[row][col] = 1 + Math.min(top, Math.min(left, topleft));
                }
            }
        }
        System.out.println(mat[str2.length()][str1.length()]);
    }
}

import java.util.Scanner;

public class floodfill {
    static int[][] floodfiller(int[][] mat, int sR, int sC, int newColor) {
        int color = mat[sR][sC];
        return dfs(mat, sR, sC, newColor, color);
    }

    static int[][] dfs(int[][] mat, int r, int c, int newColor, int color) {
        if (mat[r][c] == color) {
            mat[r][c] = newColor;
            if (r >= 1)
                dfs(mat, r - 1, c, newColor, color);
            if (c >= 1)
                dfs(mat, r, c - 1, newColor, color);
            if (r + 1 < mat.length)
                dfs(mat, r + 1, c, newColor, color);
            if (c + 1 < mat[0].length)
                dfs(mat, r, c + 1, newColor, color);
        }
        return mat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int sR = sc.nextInt();
        int sC = sc.nextInt();
        int newColor = sc.nextInt();
        int[][] res = floodfiller(mat, sR, sC, newColor);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

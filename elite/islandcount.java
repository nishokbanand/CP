import java.util.Scanner;

public class islandcount {
    static int R, C;

    static void traverse(int[][] mat, int row, int col) {
        if (row >= 0 && row < R && col >= 0 && col < C) {
            if (mat[row][col] == 0) {
                return;
            }
            mat[row][col] = 0;
            traverse(mat, row, col - 1);
            traverse(mat, row, col + 1);
            traverse(mat, row - 1, col);
            traverse(mat, row + 1, col);
            traverse(mat, row - 1, col - 1);
            traverse(mat, row - 1, col + 1);
            traverse(mat, row + 1, col - 1);
            traverse(mat, row + 1, col + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        int[][] mat = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int row = 0; row < R; row++) {
            for (int col = 0; col < C; col++) {
                if (mat[row][col] == 1) {
                    count++;
                    traverse(mat, row, col);
                }
            }
        }
        System.out.println(count);

    }
}

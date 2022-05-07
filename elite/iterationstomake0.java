import java.util.Scanner;

public class iterationstomake0 {
    static int R, C, iterations;

    static void traverse(int mat[][], int row, int col) {
        if (row >= 0 && row < R && col >= 0 && col < C) {
            if (mat[row][col] == 0) {
                return;
            }
            mat[row][col] = 0;
            traverse(mat, row, col - 1);
            traverse(mat, row, col + 1);
            traverse(mat, row - 1, col);
            traverse(mat, row + 1, col);
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
        int k = sc.nextInt();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (k == mat[i][j]) {
                    iterations++;
                    traverse(mat, i, j);
                }
            }
        }
        System.out.println(iterations);
    }
}

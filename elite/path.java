import java.util.Scanner;

public class path {
    static int R, C, found = 0;
    static int destinationr, destinationc;

    static void traverse(int mat[][], int row, int col) {
        if (row >= 0 && row < R && col >= 0 && col < C) {
            if (row == destinationr && col == destinationc) {
                found = 1;
                return;
            }
            if (mat[row][col] == 0 || mat[row][col] == 2) {
                return;
            }
            mat[row][col] = 2;
            traverse(mat, row, col - 1);
            if (found != 1) {
                traverse(mat, row, col + 1);
            }
            if (found != 1) {
                traverse(mat, row + 1, col);
            }

            if (found != 1) {
                traverse(mat, row - 1, col);
            }

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
        int sourcer = sc.nextInt();
        int sourcec = sc.nextInt();
        destinationr = sc.nextInt();
        destinationc = sc.nextInt();
        if (mat[sourcer][sourcec] == 0 || mat[destinationr][destinationc] == 0) {
            System.out.println("no");
        } else {
        }
        traverse(mat, sourcer, sourcec);
        System.out.println(found == 1 ? "yes" : "no");
    }
}

import java.util.Scanner;

public class mattravtopleft {
    static int R, C;

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
        int row = 0, col = 0, dir = 1;
        for (int iter = 1; iter <= R + C - 1; iter++) {
            if (dir == 1) {
                while (row >= 0 && col < C) {
                    System.out.print(mat[row][col] + " ");
                    row--;
                    col++;
                }
                dir = -1;
                if (row < 0 && col < C) {
                    row = 0;
                }
                if (col >= C) {
                    col = C - 1;
                    row += 2;
                }
            } else {
                while (row < R && col >= 0) {
                    System.out.print(mat[row][col] + " ");
                    row++;
                    col--;
                }
                dir = 1;
                if (col < 0 && row < R) {
                    col = 0;
                }
                if (row >= R) {
                    row = R - 1;
                    col += 2;
                }
            }
        }
    }
}

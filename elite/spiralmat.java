import java.util.Scanner;

public class spiralmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int startcol = 0, startrow = 0, endrow = row - 1, endcol = col - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // left to right
            for (int i = startcol + 1; i <= endcol; i++) {
                System.out.print(mat[endrow][i] + " ");
            }
            // top to bottom
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(mat[i][startcol] + " ");
            }

            if (startrow != endrow) {
                // right to left
                for (int i = endcol - 1; i >= startcol + 1; i--) {
                    System.out.print(mat[startrow][i] + " ");
                }
            }
            // bottom to top
            if (startcol != endcol) {
                for (int i = endrow - 1; i >= startrow; i--) {
                    System.out.print(mat[i][endcol] + " ");
                }
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralmat {
    static List spiral(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        return helper(mat, m, n);
    }

    static List helper(int[][] mat, int R, int C) {
        int startrow = 0, endrow = R - 1, startcol = 0, endcol = C - 1;
        List<Integer> list = new ArrayList<>();
        int d = 0;
        while (startrow <= endrow && startcol <= endcol) {
            // left to right
            if (d == 0) {
                for (int i = startcol; i <= endcol; i++) {
                    list.add(mat[startrow][i]);
                }
                startrow++;
            }
            System.out.println(list);
            // top to bottom
            if (d == 1) {
                for (int i = startrow; i <= endrow; i++) {
                    list.add(mat[i][endcol]);
                }
                endcol--;
            }
            System.out.println(list);
            // right to left
            if (d == 2) {
                for (int i = endcol; i >= startcol; i--) {
                    list.add(mat[endrow][i]);
                }
                endrow--;
            }
            System.out.println(list);
            // bottom to top
            if (d == 3) {
                for (int i = endrow; i >= startrow; i--) {
                    list.add(mat[i][startcol]);
                }
                startcol++;
            }
            System.out.println(list);
            d = (d + 1) % 4;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(spiral(mat));
    }
}

import java.util.Scanner;

public class checkifstraight {
    static boolean check(int[][] mat) {
        for (int i = 2; i < mat.length; i++) {
            if (!slope(mat[i], mat[0], mat[1]))
                return false;
        }
        return true;
    }

    // y-y1/y2-y1 = x-x1/x2-x1;
    static boolean slope(int[] mat, int[] p1, int[] p2) {
        int x = mat[0], y = mat[1], x1 = p1[0], y1 = p1[1], x2 = p2[0], y2 = p2[1];
        return ((y - y1) * (x2 - x1) == (x - x1) * (y2 - y1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(check(mat));
        sc.close();
    }
}

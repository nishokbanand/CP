import java.util.Scanner;
import java.util.ArrayList;

public class traverse_mat_in_spiral {
    static ArrayList<Integer> traverse(int[][] mat, int r, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = c - 1, top = 0, bottom = r - 1;
        while (left <= right && top <= bottom) {
            // left to right
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                // right to left
                for (int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            // bottom to top:
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(traverse(mat, r, c));
        sc.close();
    }
}

import java.util.Scanner;

public class max_sum_path_grid {
    static int max_sum(int[][] mat) {
        int[][] sum = new int[mat.length][mat.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i][0] = mat[i][0];
            sum[0][i] = mat[0][i];
        }
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat.length; j++) {
                sum[i][j] = Math.max(sum[i - 1][j], sum[i][j - 1]) + mat[i][j];
                System.out.println(sum[i][j]);
            }
        }
        return sum[mat.length - 1][mat.length - 1] + sum[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(max_sum(mat));
        sc.close();
    }

}

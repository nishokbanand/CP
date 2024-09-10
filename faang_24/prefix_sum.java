import java.util.Scanner;

public class prefix_sum {
    static void prefix_sum_twod_arr(int[][] mat) {
        int[][] prefix_sum = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 && j == 0)
                    prefix_sum[i][j] = mat[i][j];
                else if (i == 0 && j > 0)
                    prefix_sum[i][j] = prefix_sum[i][j - 1] + mat[i][j];
                else if (j == 0 && i > 0)
                    prefix_sum[i][j] = prefix_sum[i - 1][j] + mat[i][j];
                else
                    prefix_sum[i][j] = prefix_sum[i - 1][j] + prefix_sum[i][j - 1] - prefix_sum[i - 1][j - 1]
                            + mat[i][j];
            }
        }
        for (int[] p : prefix_sum) {
            for (int num : p) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // 28 //45-21-27-12

        // 1 3 6
        // 5 12 21
        // 12 27 45

        //

        System.out.println(prefix_sum[2][2] - prefix_sum[0][2] - prefix_sum[2][1] + prefix_sum[0][0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        prefix_sum_twod_arr(mat);
        // int[] arr = new int[] { 5, 4, 3, 5, 6, 7 };
        // int[] prefix_arr = new int[arr.length];
        // prefix_arr[0] = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // prefix_arr[i] = prefix_arr[i - 1] + arr[i];
        // }
        // for (int num : prefix_arr)
        // System.out.println(num);
        // System.out.println(prefix_arr[4] - prefix_arr[2 - 1]);
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class maxwealth {
    static int richest(int[][] mat) {
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            int sum = Arrays.stream(mat[i]).sum();
            res = Math.max(sum, res);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(richest(mat));
        sc.close();
    }
}

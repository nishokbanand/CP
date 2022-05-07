import java.util.Scanner;

public class maxsubmat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] rowsum = new int[r][c + 1];
        int curr;
        for (int i = 0; i < r; i++) {
            rowsum[i][0] = 0;
        }
        for (int row = 0; row < r; row++) {
            for (int col = 1; col <= c; col++) {
                curr = sc.nextInt();
                rowsum[row][col] = curr + rowsum[row][col - 1];

            }
        }
        int k, maxsum = Integer.MIN_VALUE;
        k = sc.nextInt();
        for (int row = 0; row <= r - k; row++) {
            for (int col = 1; col <= c - k + 1; col++) {
                int sum = 0;
                for (int srow = row; srow < row + k; srow++) {
                    sum += rowsum[srow][col + k - 1] - rowsum[srow][col - 1];
                }
                if (sum > maxsum) {
                    maxsum = sum;
                }
            }
        }
        System.out.println(maxsum);
    }
}

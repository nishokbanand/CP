import java.util.Scanner;

public class Ajira_prep {
    static int solve(int[][] arr, int[] one_serving) {
        int n = arr.length;
        int m = arr[0].length;
        /*
         * Case 1
         * 
         * 2 1
         * 
         * 500 300
         * 
         * 900
         * 
         * 660
         */
        // all combinations of arr such that the values of arr is in
        // [90%,110%](exclusive)
        // of the one_serving values.
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] >= one_serving[j] * 0.9 && arr[i][j] <= one_serving[j] * 1.1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] one_serving = new int[N];
        for (int i = 0; i < N; i++) {
            one_serving[i] = sc.nextInt();
        }
        int[][] arr = new int[P][N];
        for (int i = 0; i < P; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(arr, one_serving));
    }
}

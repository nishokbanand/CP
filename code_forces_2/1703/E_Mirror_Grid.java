import java.util.Scanner;

/**
 * E_Mirror_Grid
 */
public class E_Mirror_Grid {
    static int noOfchanges(int[][] grid, int size) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[][] grid = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            System.out.println(noOfchanges(grid, size));
        }
        sc.close();
    }
}
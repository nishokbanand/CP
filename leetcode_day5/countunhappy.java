import java.util.Scanner;

public class countunhappy {
    static int count(int n, int[][] preferences, int[][] pairs) {
        int count = 0;
        int[][] prefrank = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    prefrank[i][j] = -1;
                else
                    prefrank[i][j] = getindex(preferences, i, j);
            }
        }
        return count;
    }

    static int getindex(int[][] preferences, int ele1, int ele2) {
        for (int i = 0; i < preferences[ele1].length; i++) {
            if (preferences[ele1][i] == ele2)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] preferences = new int[][] { { 1, 2, 3 }, { 3, 2, 0 }, { 3, 1, 0, }, { 1, 2, 0, } };
        int[][] pairs = new int[][] { { 0, 1 }, { 2, 3 } };
        System.out.println(count(n, preferences, pairs));
        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * one
 */
public class one {
    static int[] dr = new int[] { 0, 0, 1, -1 };
    static int[] dc = new int[] { 1, -1, 0, 0 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        //
        int m = grid.length;
        int n = grid[0].length;

        int[][] dist = new int[m][n];
        for (int[] ar : dist)
            Arrays.fill(ar, -1);

        Queue<List<Integer>> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    dist[i][j] = 0;
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    q.add(temp);
                }
            }
        }
        System.out.println(q);
        while (!q.isEmpty()) {
            List<Integer> curr_index = q.poll();
            System.out.println(curr_index);
            for (int d = 0; d < 4; d++) {
                int new_r = curr_index.get(0) + dr[d];
                int new_c = curr_index.get(1) + dc[d];
                if (new_r >= 0 && new_r < m && new_c >= 0 && new_c < n) {
                    if (grid[new_r][new_c] == 1) {
                        if (dist[new_r][new_c] == -1) {
                            dist[new_r][new_c] = dist[curr_index.get(0)][curr_index.get(1)] + 1;
                            List<Integer> temp = new ArrayList<>();
                            temp.add(new_r);
                            temp.add(new_c);
                            q.add(temp);
                        }
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && dist[i][i] == -1)
                    System.out.println(-1);
                else
                    ans = Math.max(ans, dist[i][j]);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
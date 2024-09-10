import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Making_a_large_island
 */
class Solution {
    static int[] dr = new int[] { 0, 0, 1, -1 };
    static int[] dc = new int[] { 1, -1, 0, 0 };
    int[][] components;
    int[] size;
    int[][] g;
    int n;

    boolean isValid(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }

    void dfs(int row, int col, int cval) {
        components[row][col] = cval;
        ++size[cval];
        for (int i = 0; i < 4; i++) {
            int new_r = row + dr[i];
            int new_col = col + dc[i];
            if (isValid(new_r, new_col) && g[new_r][new_col] == 1 && components[new_r][new_col] == -1) {
                dfs(new_r, new_col, cval);
            }
        }
    }

    int find_largest_island(int[][] grid) {
        PriorityQueue<Integer> h = new PriorityQueue();
        h.g = grid;
        n = g.length;
        components = new int[n][n];
        for (int[] arr : components) {
            Arrays.fill(arr, -1);
        }
        size = new int[n * n];
        boolean[] visited = new boolean[n * n];
        int c = 0;// c is for grouping the islands
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 1 && components[i][j] == -1) {
                    dfs(i, j, c);
                    ans = Math.max(ans, size[c]);
                    c++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 0) {
                    ArrayList<Integer> cmps = new ArrayList<>();
                    for (int d = 0; d < 4; d++) {
                        int ni = dr[d] + i;
                        int nj = dc[d] + j;
                        if (isValid(ni, nj) && g[ni][nj] == 1)
                            cmps.add(components[ni][nj]);
                    }
                    int total = 1;
                    for (int num : cmps) {
                        if (visited[num] == false) {
                            visited[num] = true;
                            total += size[num];
                        }
                    }
                    ans = Math.max(total, ans);
                    for (int num : cmps) {
                        visited[num] = false;
                    }
                }
            }
        }
        return ans;
    }
}

public class Making_a_large_island {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        Solution sol = new Solution();
        System.out.println(sol.find_largest_island(grid));
        sc.close();
    }
}
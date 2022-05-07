import java.util.Scanner;

public class gameoflife {
    static int[][] directions = new int[][] { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 }, { -1, -1 }, { 1, 1 }, { 1, -1 },
            { -1, 1 } };

    static void game(int[][] grid) {
        int alivecount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    alivecount = livecount(grid, i, j);
                    System.out.println("alivecount " + alivecount);
                    if (alivecount < 2 || alivecount > 3) {
                        grid[i][j] = -2;
                    }
                } else if (grid[i][j] == 0) {
                    alivecount = livecount(grid, i, j);
                    if (alivecount == 3) {
                        grid[i][j] = 2;
                    }
                }
            }
        }
        update(grid);
    }

    static void update(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    grid[i][j] = 1;
                if (grid[i][j] == -2)
                    grid[i][j] = 0;
            }
        }
    }

    static int livecount(int[][] grid, int row, int col) {
        int livecount = 0;
        for (int[] direction : directions) {
            int r = direction[0] + row;
            int c = direction[1] + col;
            if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && (grid[r][c] == 1 || grid[r][c] == -2)) {
                livecount++;
            }
        }
        return livecount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        game(grid);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        sc.close();

    }
}

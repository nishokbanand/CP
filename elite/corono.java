import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class corono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), C = sc.nextInt();
        int[][] mat = new int[R][C];
        int healthy = 0, days = 0;
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 1) {
                    healthy++;
                }
                if (mat[i][j] == 2) {
                    q.add(i * C + j);
                }
            }
        }
        q.add(-1);
        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == -1) {
                if (!q.isEmpty()) {
                    days++;
                    q.add(-1);
                }
                continue;
            }
            int row = node / C, col = node % C;
            if (col != 0 && mat[row][col - 1] == 1) {
                mat[row][col - 1] = 2;
                q.add(row * C + col - 1);
                healthy--;
            }
            if (col != C - 1 && mat[row][col + 1] == 1) {
                mat[row][col + 1] = 2;
                q.add(row * C + col + 1);
                healthy--;
            }
            if (row != 0 && mat[row - 1][col] == 1) {
                mat[row - 1][col] = 2;
                q.add((row - 1) * C + col);
                healthy--;
            }
            if (row != R - 1 && mat[row + 1][col] == 1) {
                mat[row + 1][col] = 2;
                q.add((row + 1) * C + col);
                healthy--;
            }
        }
        if (healthy == 0) {
            System.out.println(days);
        } else {
            System.out.println(-1);
        }
    }
}

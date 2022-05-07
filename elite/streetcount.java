import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class streetcount {
    private static List<Integer> getRelated(int[][] mat, int node, int n) {
        List<Integer> nodes = new ArrayList<>();
        int noderow = node / n;
        int nodeCol = node % n;
        for (int col = nodeCol - 1; col >= 0; col--) {
            if (mat[noderow][col] == 1) {
                nodes.add(noderow * n + col);
            } else {
                break;
            }
        }
        for (int col = nodeCol + 1; col < n; col++) {
            if (mat[noderow][col] == 1) {
                nodes.add(noderow * n + col);
            } else {
                break;
            }
        }
        for (int row = noderow - 1; row >= 0; row--) {
            if (mat[row][nodeCol] == 1) {
                nodes.add(row * n + nodeCol);
            } else {
                break;
            }
        }
        for (int row = noderow + 1; row < n; row++) {
            if (mat[row][nodeCol] == 1) {
                nodes.add(row * n + nodeCol);
            } else {
                break;
            }
        }
        return nodes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int source = sc.nextInt() * n + sc.nextInt();
        int destination = sc.nextInt() * n + sc.nextInt();
        boolean[] visited = new boolean[n * n];
        int streetcount[] = new int[n * n];
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            List<Integer> related = getRelated(mat, node, n);
            for (Integer integer : related) {
                if (!visited[integer]) {
                    queue.add(integer);
                    visited[integer] = true;
                    streetcount[integer] = 1 + streetcount[node];
                    if (integer == destination) {
                        System.out.println(streetcount[integer]);
                        return;
                    }
                }
            }
        }
        System.out.println(streetcount[destination]);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class finishalltasks {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static ArrayList<ArrayList<Integer>> adjlist;

    static void makegraph(int n, ArrayList<Pair> list) {
        adjlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjlist.add(new ArrayList<>());
        }
        for (var pair : list) {
            adjlist.get(pair.second).add(pair.first);
        }
    }

    static boolean cycledetec(ArrayList<Pair> list, int node, boolean[] visited, boolean[] onpath, int n) {
        if (onpath[node])
            return true;
        if (visited[node])
            return false;
        onpath[node] = true;
        visited[node] = true;
        for (var neigh : adjlist.get(node)) {
            if (cycledetec(list, neigh, visited, onpath, n))
                return true;
        }
        return onpath[node] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        ArrayList<Pair> list = new ArrayList<>();
        list.add(new Pair(1, 0));
        list.add(new Pair(2, 1));
        list.add(new Pair(2, 1));
        list.add(new Pair(3, 2));
        boolean[] visited = new boolean[n];
        boolean[] onpath = new boolean[n];
        makegraph(n, list);
        for (int i = 0; i < n; i++) {
            if (cycledetec(list, i, visited, onpath, n)) {
                System.out.println(0);
                break;
            }
        }
        sc.close();
    }
}

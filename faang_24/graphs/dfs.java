import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class dfs {
    static ArrayList<LinkedList<Integer>> adjlist;
    static boolean[] visited;

    static void depth(int s) {
        if (visited[s] == true)
            return;
        visited[s] = true;
        System.out.println(s);
        for (var list : adjlist.get(s)) {
            depth(list);
        }
    }

    static Queue<Integer> q;

    static void breadth(int s) {
        q.add(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.println(node);
            for (var num : adjlist.get(node)) {
                if (visited[num])
                    continue;
                visited[num] = true;
                q.add(num);
            }
        }
    }

    public static void main(String[] args) {
        adjlist = new ArrayList<LinkedList<Integer>>();
        int[] arr = new int[] { 1, 4, 2, 5, 3 };
        q = new LinkedList<>();
        visited = new boolean[6];
        for (int i = 0; i <= arr.length; i++)
            adjlist.add(new LinkedList<>());
        adjlist.get(1).add(4);
        adjlist.get(1).add(2);
        adjlist.get(2).add(1);
        adjlist.get(2).add(5);
        adjlist.get(2).add(3);
        adjlist.get(4).add(1);
        adjlist.get(5).add(2);
        adjlist.get(5).add(3);
        adjlist.get(3).add(5);
        adjlist.get(3).add(2);
        breadth(3);
    }
}

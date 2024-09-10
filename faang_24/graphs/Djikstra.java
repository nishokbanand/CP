import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Node {
    int to, weight;

    Node(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}

public class Djikstra {
    static int n;
    static Graph graph;

    static class Graph {
        List<List<Node>> edgelist = new ArrayList<>();

        Graph(List<Edge> edges) {
            n = 0;
            for (var edge : edges) {
                n = Math.max(n, Math.max(edge.src, edge.dest));
            }
            for (int i = 0; i <= n; i++)
                edgelist.add(new ArrayList<>());
            for (var edge : edges) {
                edgelist.get(edge.src).add(new Node(edge.dest, edge.weight));
                edgelist.get(edge.dest).add(new Node(edge.src, edge.weight));
            }
        }
    }

    static void dikstra(int src) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<List<Integer>> q = new PriorityQueue<>(new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        temp.add(src);
        boolean[] visited = new boolean[n + 1];
        q.add(temp);
        while (!q.isEmpty()) {
            int a = q.poll().get(1);
            if (visited[a])
                continue;
            visited[a] = true;
            for (var edge : graph.edgelist.get(a)) {
                if (dist[a] + edge.weight < dist[edge.to]) {
                    dist[edge.to] = dist[a] + edge.weight;
                    temp = new ArrayList<>();
                    temp.add(-dist[edge.to]);
                    temp.add(edge.to);
                    q.add(temp);
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    public static void main(String[] args) {
        graph = new Graph(Arrays.asList(new Edge(3, 2, 2), new Edge(3, 4, 6), new Edge(2, 1, 5), new Edge(4, 1, 9),
                new Edge(4, 5, 2), new Edge(1, 5, 1)));
        dikstra(1);
    }

}

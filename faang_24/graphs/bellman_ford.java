import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * bellman_ford
 */

class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Node {
    int to;
    int weight;

    Node(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}

public class bellman_ford {
    static class Graph {
        List<List<Node>> edgelist = new ArrayList<>();

        Graph(List<Edge> edges) {
            int n = 0;
            for (var edge : edges) {
                n = Math.max(Math.max(edge.src, edge.dest), n);
            }
            for (int i = 0; i <= n; i++)
                edgelist.add(new ArrayList<>());
            for (var edge : edges) {
                edgelist.get(edge.src).add(new Node(edge.dest, edge.weight));
                edgelist.get(edge.dest).add(new Node(edge.src, edge.weight));
            }
        }
    }

    static Graph graph;

    static void bellman(int src) {
        int[] dist = new int[6];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 1; i <= 5; i++) {
            for (var e : graph.edgelist.get(i)) {
                dist[e.to] = Math.min(dist[e.to], dist[i] + e.weight);
            }
        }
        for (int i = 0; i < 6; i++)
            System.out.println(i + " " + dist[i]);
    }

    public static void main(String[] args) {
        graph = new Graph(Arrays.asList(new Edge(1, 3, 3), new Edge(1, 4, 7),
                new Edge(1, 2, 5), new Edge(3, 4, 1), new Edge(2, 4, 3),
                new Edge(2, 5, 2), new Edge(4, 5, 2)));
        bellman(1);
    }
}
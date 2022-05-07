import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        int i = 0;
        for (List<String> eq : equations) {
            String start = eq.get(0);
            String end = eq.get(1);
            double val = values[i];
            graph.putIfAbsent(start, new HashMap<>());
            graph.get(start).put(end, val);
            graph.putIfAbsent(end, new HashMap<>());
            graph.get(end).put(start, (1 / val));
            i++;
        }
        return graph;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] ans = new double[queries.size()];
        int i = 0;
        for (List<String> query : queries) {
            HashSet<String> visited = new HashSet<>();
            if (query.get(0).equals(query.get(1))) {
                if (graph.containsKey(query.get(0))) {
                    ans[i++] = 1.0;
                } else {
                    ans[i++] = -1.0;
                }
                continue;
            }
            double res = dfs(query.get(0), query.get(1), graph, visited);
            ans[i++] = res;
        }
        return ans;
    }

    private double dfs(String start, String end, Map<String, Map<String, Double>> graph, HashSet<String> visited) {
        if (!graph.containsKey(start)) {
            return -1.0;
        }
        if (graph.get(start).containsKey(end)) {
            return graph.get(start).get(end);
        }
        visited.add(start);
        Map<String, Double> startMap = graph.get(start);
        for (Map.Entry<String, Double> entry : startMap.entrySet()) {
            if (!visited.contains(entry.getKey())) {
                double currval = dfs(entry.getKey(), end, graph, visited);
                if (currval != -1) {
                    return currval * entry.getValue();
                }
            }
        }
        return -1.0;
    }
}

public class evaluate_div {
    public static void main(String[] args) {
        List<List<String>> equations = new ArrayList<>();
        List<String> temp = new ArrayList<>() {
            {
                add("a");
                add("b");
            }
        };
        equations.add(temp);
        temp = new ArrayList<String>() {
            {
                add("b");
                add("c");
            }
        };
        equations.add(temp);
        double[] values = new double[] { 2.0, 3.0 };
        List<List<String>> queries = new ArrayList<>();
        temp = new ArrayList<String>() {
            {
                add("a");
                add("c");
            }
        };
        queries.add(temp);
        temp = new ArrayList<String>() {
            {
                add("b");
                add("a");
            }
        };
        queries.add(temp);
        temp = new ArrayList<String>() {
            {
                add("a");
                add("e");
            }
        };
        queries.add(temp);
        temp = new ArrayList<String>() {
            {
                add("a");
                add("a");
            }
        };
        queries.add(temp);
        temp = new ArrayList<String>() {
            {
                add("x");
                add("x");
            }
        };
        queries.add(temp);
        Solution sol = new Solution();
        double[] res = sol.calcEquation(equations, values, queries);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

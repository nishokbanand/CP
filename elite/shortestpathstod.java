import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Link {
    int source, dest, dist;
}

public class shortestpathstod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), L = sc.nextInt();
        List<Link> links = new ArrayList<>();
        for (int i = 1; i <= L; i++) {
            Link link = new Link();
            link.source = sc.nextInt();
            link.dest = sc.nextInt();
            link.dist = sc.nextInt();
            links.add(link);
        }
        Integer[] shortest = new Integer[N + 1];
        shortest[1] = 0;
        boolean relaxed = true;
        for (int i = 1; i < N && relaxed; i++) {
            relaxed = false;
            for (Link link : links) {
                if (shortest[link.source] == null) {
                    continue;
                }
                if (shortest[link.dest] == null || shortest[link.source] + link.dist < shortest[link.dest]) {
                    shortest[link.dest] = shortest[link.source] + link.dist;
                    relaxed = true;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            System.out.print(shortest[i] + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] leaps = new int[sc.nextInt()];
        int slippery = sc.nextInt();
        for (int i = 0; i < leaps.length; i++) {
            leaps[i] = sc.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < slippery; i++) {
            arr.add(sc.nextInt());
        }
        long[] ways = new long[n + 1];
        ways[0] = 1;
        for (int i = 1; i < ways.length; i++) {
            // if (arr.contains(i)) {
            // ways[i] = 0;
            // continue;
            // }
            for (int j = 0; j < leaps.length; j++) {
                if (i >= leaps[j])
                    ways[i] += ways[(int) i - leaps[j]];
            }
            if (arr.contains(i)) {
                int lastnonslippery = i - 1;
                while (arr.contains(lastnonslippery) && lastnonslippery > 0) {
                    lastnonslippery--;
                }
                if (lastnonslippery > 0) {
                    ways[lastnonslippery] += ways[i];
                }
                ways[i] = 0;
            }

        }
        System.out.println(ways[n]);
    }
}

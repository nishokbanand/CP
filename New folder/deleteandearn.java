import java.util.HashMap;
import java.util.Scanner;

public class deleteandearn {
    static HashMap<Integer, Integer> points = new HashMap<>();
    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static int maxpoints(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return points.getOrDefault(1, 0);
        if (cache.containsKey(num))
            return cache.get(num);
        int gain = points.getOrDefault(num, 0);
        cache.put(num, Math.max(maxpoints(num - 1), maxpoints(num - 2) + gain));
        return cache.get(num);
    }

    public static int delandearn(int[] arr) {
        int maxnumber = 0;
        for (int i : arr) {
            points.put(i, points.getOrDefault(i, 0) + i);
            maxnumber = Math.max(maxnumber, i);
        }
        return maxpoints(maxnumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(delandearn(arr));
    }
}

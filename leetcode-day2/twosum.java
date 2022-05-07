import java.util.HashMap;
import java.util.Scanner;

public class twosum {
    static int[] twos(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                res[1] = i;
                res[0] = map.get(arr[i]);
            } else
                map.put(target - arr[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] res = new int[2];
        res = twos(arr, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}

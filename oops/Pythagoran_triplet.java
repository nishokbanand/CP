import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Pythagoran_triplet {
    static boolean triplets(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put((int) Math.pow(num, 2), map.getOrDefault(Math.pow(num, 2), 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            map.put(first, map.get(first) - 1);
            for (int j = i + 1; j < arr.length; j++) {
                map.put(arr[j], map.get(arr[j]) - 1);
                int res = first + arr[j];
                if (map.get(res) != null && map.get(res) != 0)
                    return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(triplets(arr));
    }

}

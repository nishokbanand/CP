import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 * kweakestrows
 */
public class kweakestrows {
    static int[] kweakest(int[][] mat, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    System.out.println(count);
                    count += 1;
                }
            }
            map.put(count, i);
        }
        System.out.println(map);
        // int i = 0;
        // HashMap<Integer, Integer> result = (HashMap<Integer, Integer>) sort(map);
        // for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
        // if (i == k)
        // break;
        // res[i++] = entry.getKey();
        // }
        return res;
    }

    static Map<Integer, Integer> sort(HashMap<Integer, Integer> map) {
        LinkedList<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int[] res = kweakest(mat, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}
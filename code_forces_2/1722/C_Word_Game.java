import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * C_Word_Game
 */
public class C_Word_Game {
    static int[] findpoints(String[][] str_arr, HashMap<String, Integer> map) {
        int[] findpoints = new int[3];
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < str_arr[0].length; j++) {
                if (map.get(str_arr[i][j]) == 1)
                    total += 3;
                if (map.get(str_arr[i][j]) == 2)
                    total += 1;
            }
            findpoints[i] = total;
        }
        return findpoints;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt();
            String[][] str_arr = new String[3][n];
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < str_arr[0].length; j++) {
                    str_arr[i][j] = sc.next();
                    map.put(str_arr[i][j], map.getOrDefault(str_arr[i][j], 0) + 1);
                }
            }
            int[] findpoints = findpoints(str_arr, map);
            for (int num : findpoints)
                System.out.print(num + " ");
            System.out.println();
        }
        sc.close();
    }
}
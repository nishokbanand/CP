import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * B_Remove_Prefix
 */
public class B_Remove_Prefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            int ans = 0;
            for (int i = size - 1; i >= 0; i--) {
                if (set.contains(arr[i])) {
                    ans = i + 1;
                    break;
                }
                set.add(arr[i]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
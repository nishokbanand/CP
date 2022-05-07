import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class minmaxswap {
    static int maxmin(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int temp = Math.max(a[i], b[i]);
            a[i] = Math.min(a[i], b[i]);
            b[i] = temp;
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i : a) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (Integer integer : b) {
            list2.add(integer);
        }
        int max1 = Collections.max(list1);
        int max2 = Collections.max(list2);
        return max1 * max2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] a = new int[size];
            int[] b = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(maxmin(a, b));
        }
        sc.close();
    }
}

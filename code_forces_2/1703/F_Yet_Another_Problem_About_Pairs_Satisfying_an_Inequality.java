import java.util.Scanner;
import java.util.TreeSet;

/**
 * F_Yet_Another_Problem_About_Pairs_Satisfying_an_Inequality
 */
public class F_Yet_Another_Problem_About_Pairs_Satisfying_an_Inequality {
    static int findpairs(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= (i + 1))
                continue;
            ans += set.headSet(arr[i], false).size();
            set.add(i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findpairs(arr));
        }
        sc.close();
    }
}
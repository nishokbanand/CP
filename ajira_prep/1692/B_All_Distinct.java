import java.util.*;

/**
 * B_All_Distinct
 */
public class B_All_Distinct {
    static int alldistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        if (set.size() % 2 == arr.length % 2) {
            return set.size();
        } else {
            return set.size() - 1;
        }
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
            System.out.println(alldistinct(arr));
        }
        sc.close();
    }
}
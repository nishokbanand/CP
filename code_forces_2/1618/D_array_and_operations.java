import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D_array_and_operations {
    static int minimize(int[] arr, int k) {
        int ans = 0;
        arr = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
                .toArray();
        for (int i = 0; i < k; i++) {
            ans += arr[i + k] / arr[i];
        }
        for (int i = 2 * k; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size_of_arr = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[size_of_arr];
            for (int i = 0; i < size_of_arr; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(minimize(arr, k));
        }
    }
}

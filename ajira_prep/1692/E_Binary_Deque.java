import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * E_Binary_Deque
 */
public class E_Binary_Deque {
    static int binarydeque(int[] arr, int required_sum) {
        int[] prefix_arr = new int[arr.length];
        for (int i = 1; i < prefix_arr.length; i++) {
            prefix_arr[i] = arr[i] + prefix_arr[i - 1];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int required_sum = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(binarydeque(arr, required_sum));
        }
    }
}
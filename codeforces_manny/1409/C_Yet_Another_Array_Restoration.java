import java.util.Arrays;
import java.util.Scanner;

/**
 * C_Yet_Another_Array_Restoration
 */
public class C_Yet_Another_Array_Restoration {
    static void Yet_Another_Array_Restoration(int n, int x, int y) {
        int[] res = new int[n];
        if (n == 2) {
            res[0] = x;
            res[1] = y;
            System.out.println(res[0] + " " + res[1]);
            return;
        }
        res[n - 1] = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                arr[i] = x;
                arr[j] = y;
                int diff = y - x;
                int distance = j - i;
                if (diff % distance == 0) {
                    diff = diff / distance;
                    for (int k = i + 1; k < arr.length; k++) {
                        arr[k] = arr[k - 1] + diff;
                    }
                    for (int k = i - 1; k >= 0; k--) {
                        arr[k] = arr[k + 1] - diff;
                    }
                    if (arr[0] > 0 && arr[n - 1] < res[n - 1]) {
                        res = Arrays.copyOf(arr, arr.length);
                    }
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            Yet_Another_Array_Restoration(n, x, y);
        }
        sc.close();
    }
}
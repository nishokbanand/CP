import java.util.Scanner;

/**
 * Ele_with_l_and_r
 */
public class Ele_with_l_and_r {
    static int findele(int[] arr, int size) {
        // 4 2 5 7
        // 4 4 5 7
        // 7 7 7 7
        int[] left_max = new int[size];
        left_max[0] = arr[0];
        for (int i = 1; i < left_max.length; i++) {
            left_max[i] = Math.max(left_max[i - 1], arr[i]);
        }
        int[] right_max = new int[size];
        right_max[size - 1] = arr[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right_max[i] = Math.min(right_max[i + 1], arr[i]);
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= left_max[i - 1] && arr[i] <= right_max[i + 1])
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.println(findele(arr, size));
        sc.close();
    }
}
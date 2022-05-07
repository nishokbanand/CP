import java.util.Arrays;
import java.util.Scanner;

public class splitarr {
    static int right;

    static int split(int[] arr, int m) {
        int left = Arrays.stream(arr).max().getAsInt();
        right = Arrays.stream(arr).sum();
        int res = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cansplit(arr, m, mid)) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    static boolean cansplit(int[] arr, int m, int val) {
        int currsum = 0;
        int subarrays = 0;
        for (int num : arr) {
            currsum += num;
            if (currsum > val) {
                subarrays += 1;
                currsum = num;
            }
        }
        return subarrays + 1 <= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(split(arr, m));
        sc.close();
    }
}

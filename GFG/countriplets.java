import java.util.Scanner;
import java.util.Arrays;

public class countriplets {
    static int countriplet(int[] arr) {
        /* first approach n^2 logn */
        int ans = 0;
        /*
         * 1 2 3 5
         * i j
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (findnextval(arr, sum, j + 1, arr.length - 1)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static boolean findnextval(int[] arr, int sum, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == sum) {
                return true;
            }
            if (arr[mid] > sum) {
                return findnextval(arr, sum, left, mid - 1);
            } else {
                return findnextval(arr, sum, mid + 1, right);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(countriplet(arr));
        sc.close();
    }
}

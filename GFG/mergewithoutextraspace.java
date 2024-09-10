import java.util.Scanner;
import java.util.Arrays;

public class mergewithoutextraspace {
    static void merge_arr(int[] arr1, int[] arr2) {
        /*
         * 1 3 5 7
         * 0 2 6 8 9
         */
        // for (int i = 0; i < arr1.length; i++) {
        // if (arr1[i] > arr2[0]) {
        // arr1[i] = arr1[i] + arr2[0];
        // arr2[0] = arr1[i] - arr2[0];
        // arr1[i] = arr1[i] - arr2[0];
        // Arrays.sort(arr2);
        // }
        // }
        int i = 0, j = 0, k = arr1.length - 1;
        while (i <= k && j < arr2.length) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size_arr1 = sc.nextInt();
        int[] arr1 = new int[size_arr1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int size_arr2 = sc.nextInt();
        int[] arr2 = new int[size_arr2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        merge_arr(arr1, arr2);
    }
}
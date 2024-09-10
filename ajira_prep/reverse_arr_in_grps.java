import java.util.Scanner;
import java.util.ArrayList;

/**
 * reverse_arr_in_grps
 */
public class reverse_arr_in_grps {
    static void reverse_arr(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            int temp = 0;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    static void reverse_arr(ArrayList<Integer> list, int k) {
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < arr.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);
            int temp = 0;
            while (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        list.clear();
        for (int num : arr) {
            list.add(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse_arr(arr, k);
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}
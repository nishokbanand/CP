import java.util.Arrays;
import java.util.Scanner;

public class Reverse_arr {
    static int[] reverse(int[] arr, int k, int size) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i += k) {
            left = i;
            right = Math.min(i + k - 1, size - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(reverse(arr2, k, size)));
    }
}

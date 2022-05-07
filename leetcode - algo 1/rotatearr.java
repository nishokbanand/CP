import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rotatearr {
    static void rotate(int[] arr, int k) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
        }
        reverse(arr, 0, arr.length - 1);

        reverse(arr, 0, (k - 1 % arr.length - 1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reverse(arr, k, arr.length - 1);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }

    static int[] reverse(int[] arr, int left, int right) {
        for (int i = left; i <= right; i++) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rotate(arr, k);
        sc.close();
    }
}

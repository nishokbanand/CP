import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nextpermutation {
    static List<List<Integer>> nextpermu(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int index1 = arr.length - 2;
        while (index1 >= 0 && arr[index1 + 1] <= arr[index1]) {
            index1--;
        }
        if (index1 >= 0) {
            int index2 = arr.length - 1;
            while (arr[index2] <= arr[index1]) {
                index2--;
            }
            swap(arr, index1, index2);
        }
        reverse(arr, index1 + 1);
        res.add(toList(arr));
        return res;
    }

    static List<Integer> toList(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int num : arr) {
            res.add(num);
        }
        return res;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr, int left) {
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(nextpermu(arr));
        sc.close();
    }
}

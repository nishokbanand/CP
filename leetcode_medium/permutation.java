import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutation {
    static List<List<Integer>> permu(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, arr, 0);
        return res;
    }

    static void backtrack(List<List<Integer>> res, int[] arr, int start) {
        if (start == arr.length) {
            res.add(toList(arr));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i);
            backtrack(res, arr, start + 1);
            swap(arr, i, start);
        }
    }

    static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    static List<Integer> toList(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int num : arr) {
            res.add(num);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(permu(arr));
        sc.close();
    }
}

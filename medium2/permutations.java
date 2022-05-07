import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class permutations {
    static List<List<Integer>> res = new ArrayList<>();

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void permu(int[] arr, int start, int end) {
        if (start == end) {
            res.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
            permu(arr, start + 1, end);
            swap(arr, start, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        permu(arr, 0, arr.length - 1);
        System.out.println(res);
        sc.close();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class foursum {
    static List<List<Integer>> sumfour(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = target - arr[i] - arr[j];
                int left = j + 1;
                int right = arr.length - 1;
                while (left < right) {
                    if (arr[left] + arr[right] == sum) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);
                        res.add(temp);
                        while (left < right && arr[left] == temp.get(2))
                            ++left;
                        while (left < right && arr[right] == temp.get(3))
                            --right;
                    } else if (arr[left] + arr[right] > sum) {
                        right--;
                    } else {
                        left++;
                    }
                }
                while (j + 1 < arr.length && arr[j] == arr[j + 1])
                    ++j;
            }
            while (i + 1 < arr.length && arr[i] == arr[i + 1])
                ++i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(sumfour(arr, target));
        sc.close();
    }
}

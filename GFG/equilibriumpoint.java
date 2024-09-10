import java.util.Scanner;

public class equilibriumpoint {
    static int sortarr(int[] arr) {
        if (arr.length == 1)
            return arr[0];
        int left = 1, sum_left = arr[0], sum_right = 0;
        for (int i = 2; i < arr.length; i++) {
            sum_right += arr[i];
        }
        while (left <= arr.length - 1) {
            if (sum_left == sum_right) {
                return left + 1;
            } else {
                if (left < arr.length - 1) {
                    sum_left += arr[left];
                    left++;
                    sum_right -= arr[left];
                } else
                    left++;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sortarr(arr));
    }
}

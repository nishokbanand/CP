import java.util.Arrays;
import java.util.Scanner;

public class threesumclosest {
    static int closest(int[] arr, int target) {
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        int closest = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {

                int sum = arr[left] + arr[right] + arr[i];
                if (target == sum) {
                    return arr[left] + arr[right] + arr[i];
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                int diff = Math.abs(target - sum);
                if (diff < mindiff) {
                    mindiff = diff;
                    closest = sum;
                }
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(closest(arr, target));
        sc.close();
    }
}

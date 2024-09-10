import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class two_sum {
    static int twosum(int[] arr, int sum) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1, curr_sum = 0;
        while (left <= right) {
            curr_sum = arr[left] + arr[right];
            if (curr_sum == sum)
                return 1;
            else if (curr_sum > sum)
                right--;
            else
                left++;
        }
        return 0;
    }

    static int threesum(int[] arr, int sum) {
        Arrays.sort(arr);
        int curr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];
            int left = i + 1, right = arr.length - 1;
            while (left <= right) {
                curr_sum = t + arr[left] + arr[right];
                if (curr_sum > sum)
                    right--;
                else if (curr_sum < sum)
                    left++;
                if (curr_sum == sum)
                    return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 5, 6, 7, 9, 9, 10 };
        int x = 12;
        // System.out.println(twosum(arr, x));
        System.out.println(threesum(arr, x));
    }

}

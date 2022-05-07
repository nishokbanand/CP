import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Arrays;

public class maxnumofkpairs {
    static int countofpairs(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            if (arr[left] + arr[right] == k) {
                count++;
                left++;
                right--;
            } else if (arr[left] + arr[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, 3, 4, 3 };
        System.out.println(countofpairs(arr, 6));
    }
}
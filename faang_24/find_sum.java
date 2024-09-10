
import java.util.HashSet;
import java.util.Scanner;

public class find_sum {

    static int findmaxsum(int[] arr, int k) {
        int maxsum = (int) -1e6;
        int curr_sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        while (right < arr.length) {
            while (left < right && set.contains(arr[right]) || set.size() > k) {
                curr_sum -= arr[left];
                set.remove(arr[left]);
                left++;
            }
            curr_sum += arr[right];
            set.add(arr[right]);
            if (set.size() == k) {
                maxsum = Math.max(maxsum, curr_sum);
            }
            right++;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 1, 2, 3, 4, 4, 3, 2, 1 };
        int k = 3;
        System.out.println(findmaxsum(arr, k));
        sc.close();
    }

}

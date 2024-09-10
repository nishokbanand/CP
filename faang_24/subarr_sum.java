public class subarr_sum {
    static int findsum(int[] arr, int sum) {
        int left = 0, right = 0, curr_sum = 0;
        while (right < arr.length) {
            curr_sum += arr[right];
            while (curr_sum > sum) {
                curr_sum -= arr[left];
                left++;
            }
            if (curr_sum == sum) {
                System.out.println(left + " " + right);
                break;
            }
            right++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 5, 4, 3, 2, 6 };
        int x = 12;
        System.out.println(findsum(arr, x));
    }
}

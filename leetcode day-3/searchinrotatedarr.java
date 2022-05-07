import java.util.Scanner;

public class searchinrotatedarr {
    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int start = left;
        left = 0;
        right = nums.length - 1;
        if (target <= nums[start] && target >= nums[right]) {
            right = start;
        } else if (target <= nums[right] && target >= nums[start]) {
            left = start;
        }
        return searchutil(nums, left, right, target);
    }

    static int searchutil(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                return searchutil(nums, mid + 1, right, target);
            }
            if (target < nums[mid]) {
                return searchutil(nums, left, mid - 1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(arr, target));
        sc.close();
    }
}
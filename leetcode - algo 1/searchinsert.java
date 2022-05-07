import java.util.Scanner;

public class searchinsert {
    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
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
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(nums, target));
        sc.close();
    }
}

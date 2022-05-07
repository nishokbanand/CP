import java.util.Scanner;

public class twosum {
    static void sumtwo(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                nums[start] = start;
                nums[end] = end;
                break;
            } else if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sumtwo(nums, target);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        sc.close();
    }
}

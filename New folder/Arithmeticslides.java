import java.util.Scanner;

public class Arithmeticslides {
    public static int arithmeticslices(int[] nums) {
        int curr = 0, count = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr += 1;
                count += curr;
            } else {
                curr = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(arithmeticslices(nums));
    }
}

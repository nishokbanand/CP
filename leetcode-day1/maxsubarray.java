import java.util.Scanner;

public class maxsubarray {
    public static int maxSubArray(int[] nums) {
        int currmax = nums[0];
        int globalmax = currmax;
        for (int i = 1; i < nums.length; i++) {
            currmax = Math.max(currmax + nums[i], nums[i]);
            globalmax = Math.max(globalmax, currmax);
        }
        return globalmax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxSubArray(nums));
    }
}

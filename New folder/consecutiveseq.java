import java.util.HashSet;
import java.util.Scanner;

public class consecutiveseq {
    public static int longestconsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int streak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentnum = num;
                int currentstreak = 1;
                while (set.contains(currentnum + 1)) {
                    currentnum += 1;
                    currentstreak += 1;
                }
                streak = Math.max(streak, currentstreak);
            }
        }
        return streak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int index = 0; index < nums.length; index++) {
            nums[index] = sc.nextInt();
        }
        System.out.println(longestconsecutive(nums));
        sc.close();
    }
}

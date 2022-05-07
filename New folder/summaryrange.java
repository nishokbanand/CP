import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class summaryrange {
    public static List<String> summaryranges(int[] nums) {
        int n = nums.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < n && nums[i] + 1 == nums[i + 1])
                i++;
            if (start == nums[i]) {
                list.add("" + start);
            } else {
                list.add("" + start + "->" + nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(summaryranges(nums));
    }
}

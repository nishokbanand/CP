import java.util.Scanner;

public class singlenumber {
    static int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i : nums) {
        // map.put(i, map.get(i) == null ? 1 : map.get(i) + 1);
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() == 1) {
        // return entry.getKey();
        // }
        // }
        // return -1;
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
            System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));
        sc.close();
    }
}

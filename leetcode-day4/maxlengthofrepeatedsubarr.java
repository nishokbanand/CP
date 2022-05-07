import java.util.Scanner;

/**
 * maxlengthofrepeatedsubarr
 */

public class maxlengthofrepeatedsubarr {
    static int maxlen(int[] nums1, int[] nums2) {
        int ans = Integer.MIN_VALUE;
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = nums1.length - 1; i >= 0; i--) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[sc.nextInt()];
        int[] nums2 = new int[sc.nextInt()];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(maxlen(nums1, nums2));
        sc.close();
    }
}
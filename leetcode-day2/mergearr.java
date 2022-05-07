import java.util.Scanner;

public class mergearr {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int last = (m + n) - 1;
        while (pointer1 >= 0 && pointer2 >= 0) {
            nums1[last--] = nums1[pointer1] > nums2[pointer2] ? nums1[pointer1--] : nums2[pointer2--];
        }
        while (pointer2 >= 0) {
            nums1[last--] = nums2[pointer2--];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        merge(nums1, m, nums2, n);
        sc.close();
    }
}

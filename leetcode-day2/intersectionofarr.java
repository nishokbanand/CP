import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class intersectionofarr {
    static int[] intersec(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int[] res = new int[set.size()];
        int k = 0;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            res[k++] = it.next();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[sc.nextInt()];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[sc.nextInt()];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] res = intersec(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}

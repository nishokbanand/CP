import java.util.*;

/**
 * intersectionII
 */
public class intersectionII {
    static int[] intersec(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[0];
        for (int num : nums1) {
            map.put(num, map.get(num) == null ? 1 : map.get(num) + 1);
        }
        for (int num : nums2) {
            map.put(num, map.get(num) == null ? 1 : map.get(num) + 1);
        }
        System.out.println(map);
        return res;
        // List<Integer> list = new ArrayList<>();
        // boolean[] flag = new boolean[nums2.length];
        // boolean[] flag2 = new boolean[nums1.length];
        // for (int i = 0; i < nums1.length; i++) {
        // for (int j = 0; j < nums2.length; j++) {
        // if (!flag2[i] && !flag[j] && (nums1[i] == nums2[j])) {
        // list.add(nums1[i]);
        // flag[j] = true;
        // flag2[i] = true;
        // }
        // }
        // }
        // int[] res = new int[list.size()];
        // int k = 0;
        // Iterator<Integer> it = list.iterator();
        // while (it.hasNext()) {
        // res[k++] = it.next();
        // }
        // return res;
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
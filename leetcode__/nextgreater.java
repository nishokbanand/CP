import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//496
public class nextgreater {
    static int[] nextgreat(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            int ele = nums1[i];
            int index = map.get(ele);
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > ele) {
                    res[k] = nums2[j];
                    break;
                }
            }
            k++;
        }
        return res;
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
        int[] res = nextgreat(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }
}

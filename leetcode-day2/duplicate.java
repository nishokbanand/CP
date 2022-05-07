import java.util.HashSet;
import java.util.Scanner;

public class duplicate {
    static boolean removedups(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        boolean flag = false;
        for (int num : nums) {
            if (set.contains(num)) {
                flag = true;
                break;
            } else {
                set.add(num);
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removedups(arr));
        sc.close();
    }
}

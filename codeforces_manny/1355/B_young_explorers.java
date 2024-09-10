import java.util.Scanner;
import java.util.Arrays;

public class B_young_explorers {
    static int groups(int[] arr) {
        Arrays.sort(arr);
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt++;
            if (arr[i] <= cnt) {
                cnt = 0;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(groups(arr));
        }
    }
}

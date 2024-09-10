import java.util.Arrays;
import java.util.Scanner;

public class C_Good_Subarr {
    // static int goodsubarr(int[] arr) {
    // int[] prefix_arr = new int[arr.length];
    // prefix_arr[0] = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // prefix_arr[i] = prefix_arr[i - 1] + arr[i];
    // }
    // int left = 0;
    // int right = prefix_arr.length;
    // int sum = 0, res = 0;
    // while (left <= right) {
    // if (prefix_arr[left] - prefix_arr[right] == right - left) {
    // res++;
    // }

    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            String str = sc.next();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str.charAt(i) + "");
            }
            System.out.println(goodsubarr(arr));
        }
        sc.close();
    }
}

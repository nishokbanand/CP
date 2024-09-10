import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

/**
 * C_Mere_Array
 */
public class C_Mere_Array {
    static String mere_array(int[] arr) {
        String bool = "YES";
        int[] sorted_arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sorted_arr[i]) {
                if (arr[i] % sorted_arr[0] != 0) {
                    bool = "NO";
                    return bool;
                }
            }
        }
        return bool;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
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
            System.out.println(mere_array(arr));
        }
    }
}
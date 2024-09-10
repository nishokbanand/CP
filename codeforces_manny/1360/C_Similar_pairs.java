import java.util.Arrays;
import java.util.Scanner;

/**
 * C_Similar_pairs
 */
public class C_Similar_pairs {
    static String similar_pairs(int[] arr) {
        Arrays.sort(arr);
        int[] count = new int[2];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] % 2]++;
        }
        if (count[0] % 2 == 0 && count[1] % 2 == 0)
            return "YES";
        else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] == 1)
                    return "YES";
            }
        }
        return "NO";
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
            System.out.println(similar_pairs(arr));
        }
        sc.close();
    }
}
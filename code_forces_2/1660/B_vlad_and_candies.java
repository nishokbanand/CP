import java.util.Arrays;
import java.util.Scanner;

public class B_vlad_and_candies {
    static String calc_candies(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 1) {
            if (arr[0] == 1)
                return "yes";
            else
                return "no";
        }
        if (arr[arr.length - 1] - arr[arr.length - 2] <= 1) {
            return "yes";
        } else {
            return "no";
        }
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
            System.out.println(calc_candies(arr));
        }
        sc.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

/**
 * omakar&pass
 */
public class A_Omkar_and_Password {
    static int omkar_pass(int[] arr) {
        Arrays.sort(arr);
        if (arr[0] == arr[arr.length - 1])
            return arr.length;
        else
            return 1;
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
            System.out.println(omkar_pass(arr));
        }
        sc.close();
    }
}

import java.util.Scanner;

/**
 * plusone
 */
public class plusone {
    static int[] plus(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 9) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i] + 1;
            }
        }
        if (arr[0] == 0) {
            int[] res = new int[arr.length + 1];
            res[0] = 1;
            return res;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = plus(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        sc.close();
    }

}
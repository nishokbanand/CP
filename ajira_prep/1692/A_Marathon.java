import java.util.Scanner;

/**
 * A_Marathon
 */
public class A_Marathon {
    static int marathon(int[] arr) {
        int res = 0;
        int timur = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (timur < arr[i])
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int[] arr = new int[4];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(marathon(arr));
        }
    }
}
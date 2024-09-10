import java.util.Scanner;

/**
 * A_degenerate_triangles
 */
public class A_degenerate_triangles {
    static void degenerate_triangles(int[] arr) {
        if (arr[0] + arr[1] > arr[arr.length - 1]) {
            System.out.println(-1);
        } else {
            System.out.println(1 + " " + 2 + " " + arr.length);
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
            degenerate_triangles(arr);
        }
        sc.close();
    }
}
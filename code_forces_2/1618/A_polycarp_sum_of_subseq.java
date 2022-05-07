import java.util.Scanner;

/**
 * A_polycarp_sum_of_subseq
 */
public class A_polycarp_sum_of_subseq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int[] arr = new int[7];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            arr[2] = arr[4] - arr[0];
            arr[1] = arr[5] - arr[2];
            arr[0] = arr[6] - arr[1] - arr[2];
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        }
        sc.close();
    }
}
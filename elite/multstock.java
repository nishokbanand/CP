import java.util.Scanner;

/**
 * multstock
 */
public class multstock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                result += arr[i] - arr[i - 1];
            }
        }
        System.out.println(result);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class weightcantbemeasured {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= res) {
                res += arr[i];
            }
        }
        System.out.println(res);
    }
}

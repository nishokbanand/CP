import java.util.Scanner;
import java.util.ArrayList;

/**
 * leadersinarr
 */
public class leadersinarr {
    static ArrayList<Integer> findleaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findleaders(arr));
    }
}
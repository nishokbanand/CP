import java.util.Arrays;
import java.util.Scanner;

public class B_Equal_candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int no_candies = 0;
            for (int i = 1; i < arr.length; i++) {
                no_candies += arr[i] - arr[0];
            }
            System.out.println(no_candies);
        }
    }
}

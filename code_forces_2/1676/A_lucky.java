import java.util.Scanner;

/**
 * A_lucky
 */
public class A_lucky {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int num = sc.nextInt();
            int[] arr = new int[6];
            for (int i = arr.length - 1; i >= 0; i--) {
                int temp = num % 10;
                arr[i] = temp;
                num = num / 10;
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < 3; i++)
                sum1 += arr[i];
            for (int i = 3; i < 6; i++)
                sum2 += arr[i];
            System.out.println(sum1 == sum2 ? "yes" : "no");
        }
        sc.close();
    }
}
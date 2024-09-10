import java.util.Scanner;

/**
 * A_Distance_and_Axis
 */
public class A_Distance_and_Axis {
    static int distance_and_axis(int a, int k) {
        if (k > a)
            return k - a;
        if (a % 2 == k % 2)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int a = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(distance_and_axis(a, k));
        }
    }
}
import java.util.Scanner;

/**
 * A_Distance_and_Axis
 */
public class A_Distance_and_Axis {
    static int distance_and_axis(int point_a, int diff) {
        if (diff < point_a) {
            if (point_a % 2 == diff % 2)
                return 0;
            else
                return 1;
        } else {
            return diff - point_a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int point_a = sc.nextInt();
            int diff = sc.nextInt();
            System.out.println(distance_and_axis(point_a, diff));
        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * A_number_transformation
 */
public class A_number_transformation {
    static int[] number_transformation(int x, int y) {
        int[] res = new int[2];
        if (x == y) {
            res[0] = 1;
            res[1] = 1;
        }
        if (y % x == 0) {
            res[0] = 1;
            res[1] = y / x;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] res = number_transformation(x, y);
            System.out.println(res[0] + " " + res[1]);
        }
        sc.close();
    }
}
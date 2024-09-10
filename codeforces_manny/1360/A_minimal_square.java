import java.util.Scanner;

/**
 * A_minimal_square
 */
public class A_minimal_square {
    static int minimal_area(int h, int w) {
        // 1 cas
        double res = Math.pow(Math.min(Math.max((2 * h), w), Math.max(h, 2 * w)), 2);
        return (int) res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int w = sc.nextInt(), h = sc.nextInt();
            System.out.println(minimal_area(h, w));
        }
        sc.close();
    }
}
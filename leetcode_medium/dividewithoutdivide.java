import java.util.Scanner;

public class dividewithoutdivide {
    static int divide(int dividend, int divisor) {
        int res = 0;
        while (dividend - divisor >= 0) {
            int x = 0;
            while (dividend - (divisor << 1 << x) >= 0) {
                x++;
            }
            res += 1 << x;
            dividend = dividend - (divisor << x);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(divide(dividend, divisor));
        sc.close();
    }
}

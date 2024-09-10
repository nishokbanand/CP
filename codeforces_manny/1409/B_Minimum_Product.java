import java.util.Scanner;

/**
 * B_Minimum_Product
 */
public class B_Minimum_Product {
    static long minimum_product(Long a, Long b, Long x, Long y, Long n) {
        Long num1 = Math.max(a - n, x);
        Long num2 = Math.max(y, b - (n - (a - num1)));
        Long num3 = Math.max(b - n, y);
        Long num4 = Math.max(x, (a - (n - (b - num3))));
        return Math.min(num1 * num2, num3 * num4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            Long a = sc.nextLong(), b = sc.nextLong(), x = sc.nextLong(), y = sc.nextLong(), n = sc.nextLong();
            System.out.println(minimum_product(a, b, x, y, n));
        }
        sc.close();
    }
}
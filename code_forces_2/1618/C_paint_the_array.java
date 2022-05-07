import java.util.Scanner;

public class C_paint_the_array {
    static long findGcd(long num1, long num2) {
        if (num2 == 0)
            return num1;
        return findGcd(num2, num1 % num2);
    }

    static long paint(long[] arr) {
        long[] gcd = new long[2];
        gcd[0] = arr[0];
        gcd[1] = arr[1];
        for (int i = 2; i < arr.length; i += 2) {
            gcd[0] = findGcd(arr[i], gcd[0]);
        }
        for (int i = 3; i < arr.length; i += 2) {
            gcd[1] = findGcd(arr[i], gcd[1]);
        }
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] % gcd[0] == 0) {
                gcd[0] = 0;
                break;
            }
        }
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] % gcd[1] == 0) {
                gcd[1] = 0;
                break;
            }
        }
        for (int i = 0; i < gcd.length; i++) {
            if (gcd[i] != 0) {
                return gcd[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int size = sc.nextInt();
            long[] arr = new long[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
            }
            System.out.println(paint(arr));
        }
        sc.close();
    }
}

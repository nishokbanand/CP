import java.util.Scanner;

public class reverseint {
    static int rev(int x) {
        int carry = 1;
        if (x < 0) {
            carry = -1;
        }
        x = Math.abs(x);
        int res = 0;
        int temp = x;
        while (x != 0) {
            temp = x % 10;
            res = res * 10 + temp;
            x = x / 10;
        }
        res = res * carry;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(rev(x));
        sc.close();
    }
}

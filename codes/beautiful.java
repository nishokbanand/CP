import java.util.Scanner;

public class beautiful {
    static int reverse(int num) {
        int temp = 0;
        int res = 0;
        while (num > 0) {
            temp = num % 10;
            res = (res * 10) + temp;
            num = num / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int divisor = sc.nextInt();
        int counter = 0;
        for (int i = start; i <= end; i++) {
            int rev = reverse(i);
            if (Math.abs(i - rev) % divisor == 0) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}

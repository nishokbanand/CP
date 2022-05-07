import java.util.Scanner;

public class findsqrt {
    static int findsqr(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
            System.out.println(x);
        }
        return (int) x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findsqr(num));
        sc.close();
    }
}

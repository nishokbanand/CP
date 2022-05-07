import java.util.Scanner;

public class paranomix {
    static int result(int n) {
        if (!isPrime(n)) {
            n = result(++n);
        }
        return n;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = result(n + 1);
        if (res == k)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}

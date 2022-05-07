import java.util.ArrayList;
import java.util.Scanner;

public class integerreplacment {
    public static int replace(int n) {
        if (n == 1)
            return 0;
        if (n % 2 == 0)
            return 1 + replace(n / 2);
        return 1 + Math.min(replace(n - 1), replace(n + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(replace(n));
    }
}

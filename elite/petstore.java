import java.math.BigInteger;
import java.util.Scanner;

public class petstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] bg = new BigInteger[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i <= 2) {
                bg[i] = new BigInteger(i + "");
            } else {
                bg[i] = new BigInteger((i - 1) + "");
                bg[i] = bg[i].multiply(bg[i - 2]);
                bg[i] = bg[i].add(bg[i - 1]);
            }
        }
        System.out.println(bg[n]);
    }
}

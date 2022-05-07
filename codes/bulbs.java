import java.math.BigInteger;
import java.util.Scanner;

public class bulbs {
    static BigInteger bulbcount (int bulbs){
        BigInteger one = new BigInteger("1");
        BigInteger mod = new BigInteger("100000000");
        BigInteger two = new BigInteger(String.valueOf(2));
        BigInteger ans = (two.pow(bulbs).subtract(one)).mod(mod);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        BigInteger [] ans = new BigInteger[testcases];
        for (int i = 0; i < testcases; i++) {
            int bulbs = sc.nextInt();
            ans[i] = bulbcount(bulbs);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

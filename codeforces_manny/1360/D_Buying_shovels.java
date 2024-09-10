import java.util.Scanner;

/**
 * D_Buying_shovels
 */
public class D_Buying_shovels {
    static int buying_shovels(int n, int k) {
        int ans = n;
        if (n <= k)
            return 1;
        for (int i = 2; i <= Math.min(k, Math.sqrt(n)); i++) {
            if (n % i != 0)
                continue;
            if (n / i <= k)
                ans = Math.min(ans, i);
            ans = Math.min(ans, n / i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            System.out.println(buying_shovels(n, k));
        }
        sc.close();
    }
}
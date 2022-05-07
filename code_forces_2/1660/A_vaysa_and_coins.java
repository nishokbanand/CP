import java.util.Scanner;

class Solution {
    public int calc_burles(int burles_1, int burles_2) {
        if (burles_1 == 0)
            return 1;
        if (burles_2 == 0)
            return burles_1 + 1;
        int prod = burles_2 * 2 + burles_1;
        return prod + 1;
    }
}

public class A_vaysa_and_coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int burles_1 = sc.nextInt();
            int burles_2 = sc.nextInt();
            System.out.println(sol.calc_burles(burles_1, burles_2));
        }
        sc.close();
    }
}
import java.util.Scanner;

public class wine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int[][] max = new int[n][n];
        System.out.println(maxrev(prices, max, 0, n - 1, 1));
    }

    private static int maxrev(int[] prices, int[][] max, int left, int right, int year) {
        if (max[left][right] != 0) {
            return max[left][right];
        }
        if (left == right) {
            return prices[left] * year;
        }
        int leftRevenue = prices[left] * year + maxrev(prices, max, left + 1, right, year + 1);
        int RightRevenue = prices[right] * year + maxrev(prices, max, left, right - 1, year + 1);
        max[left][right] = Math.max(leftRevenue, RightRevenue);
        return max[left][right];
    }
}

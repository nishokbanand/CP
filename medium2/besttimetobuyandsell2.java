import java.util.Scanner;

public class besttimetobuyandsell2 {
    static int timetobuyandsell(int[] stocks) {
        int profit = 0;
        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i] > stocks[i - 1]) {
                profit += stocks[i] - stocks[i - 1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stocks = new int[sc.nextInt()];
        for (int i = 0; i < stocks.length; i++) {
            stocks[i] = sc.nextInt();
        }
        System.out.println(timetobuyandsell(stocks));
        sc.close();
    }
}

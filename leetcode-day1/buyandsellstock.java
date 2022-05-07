import java.util.Scanner;

public class buyandsellstock {
    static int buyandsell(int[] stocks) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < stocks.length; i++) {
            if (min > stocks[i]) {
                min = stocks[i];
            } else {
                if (stocks[i] - min > profit) {
                    profit = stocks[i] - min;
                }
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
        sc.close();
        System.out.println(buyandsell(stocks));
    }
}

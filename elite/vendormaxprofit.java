import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Item implements Comparable<Item> {
    int price, profit;

    @Override
    public int compareTo(Item other) {
        return this.price - other.price;
    }

}

public class vendormaxprofit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Item> items = new ArrayList<>();
        items.add(new Item());
        for (int i = 1; i <= K; i++) {
            Item item = new Item();
            item.price = sc.nextInt();
            item.profit = sc.nextInt();
            items.add(item);
        }
        Collections.sort(items);
        int[][] mat = new int[K + 1][N + 1];
        for (int i = 1; i <= K; i++) {
            Item curr = items.get(i);
            if (curr.price > N) {
                System.out.println(mat[i - 1][N]);
                return;
            }
            for (int amt = 1; amt <= N; amt++) {
                if (amt < curr.price) {
                    mat[i][amt] = mat[i - 1][amt];
                } else {
                    int incProfit = curr.profit + mat[i - 1][amt - curr.price];
                    int excProfit = mat[i - 1][amt];
                    mat[i][amt] = Math.max(incProfit, excProfit);
                }
            }
        }
        System.out.println(mat[K][N]);

    }
}

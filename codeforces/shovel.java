import java.util.Scanner;

public class shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int curramount = price;
        int change = sc.nextInt();
        int count = 1;
        while (curramount % 10 != 0) {
            if (curramount % 10 == change)
                break;
            curramount = curramount + price;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}

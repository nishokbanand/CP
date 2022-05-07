import java.util.Scanner;

public class count2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        while (y > x) {
            if (y % 2 == 0) {
                y = y / 2;
            } else {
                y = y + 1;
            }
            count++;
        }
        count = count + (x - y);
        System.out.println(count);
    }
}

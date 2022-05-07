import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        if (n <= 2) {
            System.out.println(n);
            return;
        } else {
            while (n > 2) {
                if (n % 2 == 0) {
                    n = n / 2;
                    count++;
                } else {
                    n = n - 1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
